public class Main {

    public static void main(String[] args) {

        Fighter[] f=new Fighter[6];


         f[0]=new Fighter("Putscript", "Holanda", 29, 1.70f, 65.00f, 10, 3, 4);
        f[0].apresentar();
        f[0].ganharLuta();
        f[0].empatarLuta();
        f[0].status();

        f[1]=new Fighter("Bolotinha", "Brazil", 29,1.70f,65,8,5,3);
        f[1].apresentar();
        f[1].ganharLuta();
        f[1].empatarLuta();
        f[1].perderLuta();
        f[1].status();

        Fight l=new Fight(f[0], f[1]);
        l.marcarLuta();
        l.luta();




    }

}
