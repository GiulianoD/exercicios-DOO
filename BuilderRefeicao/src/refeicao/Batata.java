package refeicao;

public class  Batata {
    private String comBatata = "o lanche será com batata";

    public Batata (String comBatata){
        System.out.println(comBatata);
        this.setBatata(comBatata);
    }
    public String getBatata() {
        return comBatata;
    }
    public void setBatata(String comBatata) {
        this.comBatata = comBatata;
    }
}

