public class Carro {
    private String nome;
    private String marca;
    private int hp;

    public Carro(String nome, String marca, int hp){
        this.nome = nome;
        this.marca = marca;
        this.hp = hp;


    };
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
