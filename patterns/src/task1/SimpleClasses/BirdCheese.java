package task1.SimpleClasses;

import task1.Abstract.Product;

public class BirdCheese extends Product {
    @Override
    public void printInfo() {
        System.out.println("Произведен сыр из птичьего молока");
    }
}