import estrutura.CaixaEntradaGrupo;
import estrutura.Observable;
import estrutura.membros.MembroEmail;
import estrutura.membros.MembroWhatsapp;
import estrutura.membros.Observer;

class Main{
    public static void main(String[] args) {
        CaixaEntradaGrupo grupoDoCurso = new CaixaEntradaGrupo();
        Observable pessoalDoCurso = grupoDoCurso.getObservable();
        Observer ob1, ob2, ob3;

        System.out.println("Seção 1 --2 observadores--");
        ob1 = new MembroWhatsapp(11111);
        pessoalDoCurso.addObserver(ob1);
        ob2 = new MembroEmail("giuliano.123@email.énois");
        pessoalDoCurso.addObserver(ob2);
        grupoDoCurso.setNovaMensagem("Aviso de prova ontem.");
        
        System.out.println("\nSeção 2 --3 obervadores--");
        ob3 = new MembroWhatsapp(222222);
        pessoalDoCurso.addObserver(ob3);
        grupoDoCurso.setNovaMensagem("Aviso de prova hoje.");

        System.out.println("\nSeção 3 --2 observadores--");
        pessoalDoCurso.deleteObserver(ob2);
        grupoDoCurso.setNovaMensagem("Aviso de prova amanhã.");
    }
}