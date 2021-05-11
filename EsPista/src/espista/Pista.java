/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package espista;
import static java.lang.Thread.*;
import java.util.concurrent.*;


public class Pista {

    Semaphore s = new Semaphore(4);

    public Pista() {

    }

    public void gara(Piloti p) throws InterruptedException {
        s.acquire();
        System.out.println(p.getNome() + " è entrato nella pista");
        for (int i = 1; i < 16; i++) {
            sleep(1000);
            System.out.println(p.getNome() + " ha completato il giro " + i);
        }
        System.out.println(p.getNome() + " è uscito dalla pista");
        s.release();
    }
