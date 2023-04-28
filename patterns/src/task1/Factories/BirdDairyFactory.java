package task1.Factories;


import task1.Abstract.DairyFactory;
import task1.Abstract.Product;
import task1.SimpleClasses.BirdCheese;
import task1.SimpleClasses.CowCheese;

public class BirdDairyFactory extends DairyFactory {
    @Override
    public Product createCheese() {
        return new BirdCheese();
    }

    @Override
    public Product createMilk() {
        return new Product() {
            @Override
            public void printInfo() {
                System.out.println("Произведено молоко из птичьего молока");
            }
        };
    }


    @Override
    public Product createSourCream() {
        return new Product() {
            @Override
            public void printInfo() {
                System.out.println("Произведена сметана из птичьего молока");
            }
        };
    }
}