/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esgaracavalli;

import java.util.logging.Level;
import java.util.logging.Logger;


public class CavalliInGara implements Runnable {

    Cavallo corri;
  GaraCavalli campo;
    int v;//velocità
    Thread t;
    int c;//conta gli spostamenti
    int pos;//coordinata x

    public CavalliInGara(Cavallo corri,GaraCavalli campo) {
        this.corri=corri;//l'identificativo
        this.campo=campo;//il campo
        v=2;c=0;
        t=new Thread(this);
        t.start();//non ho capito perchè crea un thread e lo avvia
        pos=0;
    }
    
    
    @Override
    public void run() {
     int dimImg=79;
     int dimPis=960;
     //inizia la gara
     while((corri.getCordx() + dimImg) < dimPis)//non è arrivato al traguardo
     {
        
             if(c % 10 == 0)//ogni dieci spostamenti modifica la velocità del cavallo,se fa 0 entra
             {
                 v=(int) (Math.random()*400+1);//se sono passati cambiamo la velocità
             }
             corri.setCordx(corri.getCordx()+ v);//per spostare il cavallo con il cambiamento di velocità,sposta ogni volta la x per quanto è la velocità
             c++;//conta gli spostamenti
              try {
             Thread.sleep(75);
             
         } catch (InterruptedException ex) {
             Logger.getLogger(CavalliInGara.class.getName()).log(Level.SEVERE, null, ex);
         }
              campo.repaint();
     }
     //scrivo in che posizone è  arrivato
      pos=campo.getpos();
     campo.controlloArrivi();
    }
    
}