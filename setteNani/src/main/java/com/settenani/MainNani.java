package com.settenani;


public class MainNani {

    
    public static void main(String[] args) {
        Thread t1 = new NumeroNani("cucciolo");
        Thread t2 = new NumeroNani("pisolo");
        Thread t3 = new NumeroNani("eolo");
        Thread t4 = new NumeroNani("mammolo");
        Thread t5 = new NumeroNani("brontolo");
        Thread t6 = new NumeroNani("gongolo");
        Thread t7 = new NumeroNani("dotto");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();

    }

}
