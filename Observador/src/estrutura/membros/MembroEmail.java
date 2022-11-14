package estrutura.membros;

import estrutura.Observable;

public class MembroEmail implements Observer {
    private String email;

    public MembroEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void update(Observable obs) {
        System.out.println("O email \""+email+"\" foi notificado.");
    }
}
