package org.sim.elineales.Colas;

import java.util.ArrayList;

public class QueueTest {
    public static void main(String[] args) throws ExceptionIsEmpty {
        Queue<String> q = new ArrayQueue<String>(5);
        try{
            q.enqueue("Juan");
            q.enqueue("Maria");
            q.enqueue("Rosa");
            q.enqueue("Patty");
            q.enqueue("Luis");
            q.enqueue("Mauri");

            while ((!q.isEmpty())) {
                System.out.println("Elemento: " + q.dequeue());
            }
        } catch (ExceptionIsEmpty x) {
            System.out.println(x.getMessage());
        }
        System.out.println();
        LinkedQueue<String> z = new LinkedQueue<>();

        try{
            z.enqueue("Juan");
            z.enqueue("Maria");
            z.enqueue("Rosa");
            z.enqueue("Patty");
            z.enqueue("Luis");
            z.enqueue("Mauri");

            while ((!z.isEmpty())) {
                System.out.println("Elemento: " + z.dequeue());
            }
        } catch (ExceptionIsEmpty x) {
            System.out.println(x.getMessage());
        }
        System.out.println();

        try {
            int n = 5;
            ArrayList<Queue<String>> a = new ArrayList<>(n);

            for(int i = 0; i < n; i++) {
                a.add(new LinkedQueue<String>());
            }

            a.get(2).enqueue("Juan");
            a.get(0).enqueue("Maria");
            a.get(1).enqueue("Rosa");
            a.get(0).enqueue("Manuel");

            for(int i = 0; i < n; i++){
                System.out.println("Prioridad " + (i+1));
                while (!a.get(i).isEmpty()){
                    System.out.println("Elem: " + a.get(i).dequeue());
                }
            }

        } catch (ExceptionIsEmpty x) {
            System.out.println(x.getMessage());
        }

        try {
            int n = 5;
            ArrayList<Queue<String>> a = new ArrayList<>(n);

            for(int i = 0; i < n; i++) {
                a.add(new LinkedQueue<String>());
            }

            a.get(2).enqueue("Juan");
            a.get(0).enqueue("Maria");
            a.get(1).enqueue("Rosa");
            a.get(0).enqueue("Manuel");

            for(int i = 0; i < n; i++){
                System.out.println("Prioridad " + (i+1));
                while (!a.get(i).isEmpty()){
                    System.out.println("Elem: " + a.get(i).dequeue());
                }
            }

        } catch (ExceptionIsEmpty x) {
            System.out.println(x.getMessage());
        }



    }
}
