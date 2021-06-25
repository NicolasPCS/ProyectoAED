package org.sim;

import org.sim.poo.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        /*LinkedStack<Integer> b = new LinkedStack<Integer>();
        
        b.push(7);
        b.toString();
        */
        Farmacia farmacia = new Farmacia();
        farmacia.agregarFarmaceuticos();
        
    }
}
