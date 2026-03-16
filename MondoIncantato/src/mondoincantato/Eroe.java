
public class Eroe {
    private int vita, fame, sete;
    private String nome;
    private boolean ability;

    public Eroe(String nome, boolean ability, int vita, int fame, int sete) {
        this.nome = nome;
        this.ability = ability;
        this.vita = vita;
        this.fame = fame;
        this.sete = sete;
    }

    public int getVita() {
        return vita;
    }
    
        public void setVita(int vita) {
        this.vita = vita;
    }

    public int getFame() {
        return fame;
    }

    public void setFame(int fame) {
        this.fame = fame;
    }

    public int getSete() {
        return sete;
    }

    public void setSete(int sete) {
        this.sete = sete;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

}
