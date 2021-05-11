package espista;



import java.util.logging.*;

public class Piloti implements Runnable {

    private final String nome;

    private final Spogliatoio s;
    private final Pista p;

    public Piloti(String nome, Spogliatoio s, Pista p) {
        this.nome = nome;
        this.s = s;
        this.p = p;
    }

    public String getNome() {
        return nome;
    }

   
    public void run() {
        try {
            s.indossa(this);
            p.gara(this);
            s.togli(this);
        } catch (InterruptedException ex) {
            Logger.getLogger(Piloti.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
