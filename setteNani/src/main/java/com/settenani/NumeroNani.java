package com.settenani;

public class NumeroNani extends Thread {

    public NumeroNani(String nome) {
        super();
        setName(nome);
    }

 
    public void run() {
        for (int i = 0; i < 7; i++) {
            System.out.println((i + 1) + " " + getName());
        }
    }
    
}
