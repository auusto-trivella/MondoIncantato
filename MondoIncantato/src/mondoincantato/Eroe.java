package mondoincantato;


public class Eroe {
    private int vita, fame, sete;
    private String nome;
    private boolean ability,lucky;

    public Eroe(String nome, boolean lucky, int vita, int fame, int sete,boolean ability) {
        this.nome = nome;
        this.lucky=lucky;
        this.vita = vita;
        this.fame = fame;
        this.sete = sete;
        this.ability = ability;
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

    public String getNome() {
        return nome;
    }

    public void setAbility(boolean ability) {
        this.ability = ability;
    }

    public void setLucky(boolean lucky) {
        this.lucky = lucky;
    }

    public boolean getLucky() {
        return lucky;
    }

    public boolean isAbility() {
        return ability;
    }
    

}
