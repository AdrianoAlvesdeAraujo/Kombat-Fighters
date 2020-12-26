import java.util.Random;

public class Fight {

    private Fighter desafiado;
    private Fighter desafiante;
    private int rounds;
    private boolean aprovada;

    public Fight(Fighter desafiado, Fighter desafiante) {
        this.desafiado = desafiado;
        this.desafiante = desafiante;
    }

    public void luta(){
        if(aprovada) {
            Random random = new Random();
            int vencedor = random.nextInt(3);
            System.out.println("numero aleatório: " + vencedor);
            switch (vencedor) {
                case 0:
                    System.out.println(" A luta foi Empate");
                    desafiado.empatarLuta();
                    desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Venceu a luta: "+desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("Venceu a luta: "+desafiante.getNome());
                    desafiado.perderLuta();
                    desafiante.ganharLuta();
                    break;
            }

        }else{
            System.out.println("Luta não pode acontecer pois não está aprovada");
        }



    }

    public void marcarLuta(){
        if((desafiado.getCategoria() == desafiante.getCategoria())&&(desafiado !=desafiante)){
            setAprovada(true);
            System.out.println("Apresentamos o primeiro lutador da noite");
            desafiado.apresentar();
            System.out.println("Apresentamos o segundo lutador da noite");
            desafiante.apresentar();


        }else{
            System.out.println("Luta não pode acontecer");
            setAprovada(false);
        }

    }

    public Fighter getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Fighter desafiado) {
        this.desafiado = desafiado;
    }

    public Fighter getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Fighter desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
