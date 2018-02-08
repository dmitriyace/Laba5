package com.shilko.ru;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Tiger Tigra = new Tiger("Тигра","Дом Кенги",5,5,5);
        Tigra.lookAtCeiling();
        Tigra.closeEyes();
        Tigra.checkFace();
        Tigra.workWithTongue();
        Tigra.smile();
        Tigra.like();
        Tigra.whereLive();
        Animal Roo = new Kangaroo("Ру", "Дом Кенги", 3,3,3);
        Roo.addEat(Ingestion.BREAKFAST, "Каша");
        Tigra.getEat();
        Rabbit Bunny = new Rabbit("Кролик","Дом Кролика", 10,10,10);
        Bunny.addSomeActions();
        Bunny.senseOfSelfReliance();
        Bunny.makeActions();*/


        /*Animal a = new Tiger("r", "t", 0, 0, 0);
        Animal b = new Kangaroo("q", "w", 3, 4, 5);
        Animal c = new Kangaroo("a", "s", 3, 4, 5);
        a.addAction("поехать вперед","упал");
        b.addAction("12");
        c.addAction("234");
        System.out.print(a.work());
        System.out.print(b.work());
        System.out.print(c.work());*/
        AnimalCollection collection = new AnimalCollection();
        Runtime.getRuntime().addShutdownHook(new Thread(()->{collection.save(args[0]);}));
        collection.load(args[0]);
        while (true) {
            Scanner in = new Scanner(System.in);
            collection.work();
            String lexeme = in.next();
            switch (lexeme.toLowerCase()) {
                case "remove_all":
                    collection.removeAll(System.in);
                    break;
                case "insert":
                    collection.insert(System.in);
                    break;
                case "save":
                    collection.save(args[0]);
                    break;
                case "remove_greater_key":
                    collection.removeGreaterKey(System.in);
                    break;
                case "remove":
                    collection.remove(System.in);
                    break;
                case "exit":
                    System.exit(0);
            }
        }
    }
}