public class Fighter {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Fighter(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.nome=no;
        this.nacionalidade=na;
        this.idade=id;
        this.altura=al;
        setPeso(pe);
        this.vitorias=vi;
        this.empates=em;
        this.derrotas=de;

    }

    public void apresentar(){
        System.out.println("---------Aprensentação----------");
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+ getIdade());
        System.out.println("altura: "+getAltura());
        System.out.println("peso: "+getPeso());
        System.out.println("categoria: "+getCategoria());
        System.out.println("vitorias: "+getVitorias());
        System.out.println("Derrotas: "+getDerrotas());
        System.out.println("Empates: "+getEmpates());
        System.out.println(" ");

    }
    public void status(){

        System.out.println("----------Status-----------");
        System.out.println("Nome: "+getNome());
        System.out.println("categoria: "+getCategoria());
        System.out.println("vitorias: "+getVitorias());
        System.out.println("Derrotas: "+getDerrotas());
        System.out.println("Empates: "+getEmpates());
        System.out.println("");
    }

    public void ganharLuta(){
        setVitorias(getVitorias()+1);

    }
    public void perderLuta(){
        setDerrotas(getDerrotas()+1);

    }

    public void empatarLuta(){
        setEmpates(getEmpates()+1);

    }

    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    private float getAltura() {
        return altura;
    }

    private void setAltura(float altura) {
        this.altura = altura;
    }

    private float getPeso() {
        return peso;
    }

    private void setPeso(float peso) {
        this.peso = peso;
        if(this.peso<=52.5f){
            setCategoria("Inválido");
        }else if((this.peso>52.5f) && (this.peso<=72.3)){
            setCategoria("Peso Leve");
        }else if((this.peso>72.3f) && (this.peso<=83.3)){
            setCategoria("Peso Médio");
        }else if((this.peso>83.3f) && (this.peso<=110.00)){
            setCategoria("Peso Pesado");
        }else{
            setCategoria("Inválido");
        }
    }

    private String getCategoria() {
        return categoria;
    }

    private void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    private int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private int getEmpates() {
        return empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }
}
