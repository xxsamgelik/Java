package task1.Factories;

import task1.Abstract.DairyFactory;
import task1.Abstract.Product;
import task1.SimpleClasses.CowCheese;

public class CowDairyFactory extends DairyFactory {
    @Override
    public Product createCheese() {
        return new CowCheese();
    }

    @Override
    public Product createMilk() {
        return new Product() {
            @Override
            public void printInfo() {
                System.out.println("Произведено молоко из коровьего молока");
            }
        };
    }

    @Override
    public Product createSourCream() {
        return new Product() {
            @Override
            public void printInfo() {
                System.out.println("Произведена сметана из коровьего молока");
            }
        };
    }
}