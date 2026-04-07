/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mondoincantato;

/**
 *
 * @author augus
 */
public class Contenitore {
    private int salute,fame,sete,turno,acqua,cibo;
    private String nome;
    private static final long serialVersionUID = 1L;

    public Contenitore(Borsa b,Eroe e,Turno t) {
        this.salute = e.getVita();
        this.fame = e.getFame();
        this.sete = e.getSete();
        this.turno = t.getnTurno();
        this.acqua = b.contaAcqua();
        this.cibo = b.contaCibo();
        this.nome = e.getNome();
    }

    public int getSalute() {
        return salute;
    }

    public int getFame() {
        return fame;
    }

    public int getSete() {
        return sete;
    }

    public int getTurno() {
        return turno;
    }

    public int getAcqua() {
        return acqua;
    }

    public int getCibo() {
        return cibo;
    }

    public String getNome() {
        return nome;
    }
    
}
