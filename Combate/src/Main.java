public class Main {

    public static void main(String[] args) {


        Fighter f1=new Fighter("Putscript", "Holanda", 29,1.70f,95,10,3,4);
        f1.apresentar();
        f1.ganharLuta();
        f1.empatarLuta();
        f1.status();

        Fighter f2=new Fighter("Bostinha", "Brazil", 29,1.70f,65,8,5,3);
        f2.apresentar();
        f2.ganharLuta();
        f2.empatarLuta();
        f2.perderLuta();
        f2.status();



    }

}
