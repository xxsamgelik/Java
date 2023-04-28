package task1;

import task1.Abstract.DairyFactory;
import task1.Abstract.Product;
import task1.Factories.BirdDairyFactory;
import task1.Factories.CowDairyFactory;
import task1.Factories.GoatDairyFactory;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        System.out.println("Выберите что хотите сделать\n 1 - Произвести коровьи продукты\n 2 - Произвести козлиные продукты\n 3 - Произвести птичьи продукты");
        Scanner scanner = new Scanner(System.in);
        int choose =scanner.nextInt();
        switch (choose)
        {
            case 1:
            {
                DairyFactory cowDairyFactory = new CowDairyFactory();
                Product cowCheese = cowDairyFactory.createCheese();
                Product cowMilk = cowDairyFactory.createMilk();
                Product cowSourCream = cowDairyFactory.createSourCream();
                cowCheese.printInfo();
                cowMilk.printInfo();
                cowSourCream.printInfo();
                break;
            }
            case 2:
            {
                DairyFactory goatDairyFactory = new GoatDairyFactory();
                Product goatCheese = goatDairyFactory.createCheese();
                Product goatMilk = goatDairyFactory.createMilk();
                Product goatSourCream = goatDairyFactory.createSourCream();

                goatCheese.printInfo();
                goatMilk.printInfo();
                goatSourCream.printInfo();
                break;
            }
            case 3:
            {
                DairyFactory birdDairyFactory = new BirdDairyFactory();
                Product birdCheese = birdDairyFactory.createCheese();
                Product birdMilk = birdDairyFactory.createMilk();
                Product birdSourCream = birdDairyFactory.createSourCream();

                birdCheese.printInfo();
                birdMilk.printInfo();
                birdSourCream.printInfo();
                break;
            }

        }

    }
}