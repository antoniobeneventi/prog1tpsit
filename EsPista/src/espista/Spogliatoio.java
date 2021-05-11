package espista;



import static java.lang.Thread.*;
import java.util.concurrent.*;


public class Spogliatoio {

    Semaphore s = new Semaphore(2);

    public Spogliatoio() {

    }

    public void indossa(Piloti p) throws InterruptedException {
        s.acquire();
        sleep(2000);
        s.release();
        System.out.println(p.getNome() + "   tuta e casco indossati");
    }

    public void togli(Piloti p) throws InterruptedException {
        s.acquire();
        sleep(2000);
        s.release();
        System.out.println(p.getNome() + "   tuta e casco tolti");
    }

}
