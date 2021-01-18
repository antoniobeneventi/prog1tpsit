/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estpsit;


public class triangolo {
    private double lato1;
    private double lato2;
    private double lato3;
    private String nome;



    public triangolo(double lato1, double lato2, double lato3) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
    }
   public String identificazionetriangolo(){
      nome= "rettangolo";
       
       if(lato1==lato2 && lato1 == lato3 && lato2 == lato3){
           nome="equilatero";
       }
      
      if(lato1==lato2 && lato1!= lato3 && lato2!=lato3){
          nome="isoscele";
      }
      if(lato1!=lato2 && lato1 != lato3 && lato2 != lato3){
          nome="scaleno";
      }
       return nome;
   }
   public double calcoloperimetro(){
       double perimetro = lato1+lato2+lato3;
       return perimetro;
   }
   
   public double calcoloarea()
    {
        double area=0.0;
        if(nome=="equilatero")
        {
            area=lato1*lato1 * 0.433;
        }
        if(nome=="isoscele")   
        {
            double altezza= lato1*lato1 - lato3*lato3 / 2*2;
            altezza=Math.sqrt(altezza);
            area=lato3*altezza/2;
        }
        if(nome=="rettangolo")
        {
            area=lato1*lato2/2;
        }
        if(nome=="scaleno")
        { 
            double p=lato1*lato2*lato3/2;
            area = p*(p-lato1)*(p-lato2)*(p-lato3);
            area=Math.sqrt(area);
        }
        return area;
    }
    
    
}
