/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estpsit;

public class Estpsit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   triangolo t1= new triangolo(1.0,1.0,1.0);

        t1.identificazionetriangolo();
        System.out.println("il triangolo è di tipo:" +   t1.identificazionetriangolo()); 

        t1.calcoloperimetro();
        t1.calcoloarea();
        System.out.println(" l'area è "  + t1.calcoloarea() +" il perimetro è " + t1.calcoloperimetro());

    }
    }
    

