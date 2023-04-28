package task1.Factories;

import task1.Abstract.DairyFactory;
import task1.Abstract.Product;
import task1.SimpleClasses.CowCheese;
import task1.SimpleClasses.GoatCheese;

public class GoatDairyFactory extends DairyFactory {
    @Override
    public Product createCheese() {
        return new GoatCheese();
    }

    @Override
    public Product createMilk() {
        return new Product() {
            @Override
            public void printInfo() {
                System.out.println("Произведено молоко из козьего молока");
            }
        };
    }

    @Override
    public Product createSourCream() {
        return new Product() {
            @Override
            public void printInfo() {
                System.out.println("Произведена сметана из козьего молока");
            }
        };
    }
}