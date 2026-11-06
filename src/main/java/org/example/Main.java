package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static void main() {
        ExecutorService workers = Executors.newFixedThreadPool(3);

        Bilheteria b = new Bilheteria("Cara de Barro",7);

        for (int i = 1;i<=10;i++){
            workers.submit(() ->{
               b.comprarIngresso();
            });
        }
        workers.shutdown();
    }
}
