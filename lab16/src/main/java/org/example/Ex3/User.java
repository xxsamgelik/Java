package org.example.Ex3;

class User {
    private Factory factory;

    public User(Factory factory) {
        this.factory = factory;
    }

    public void selectCategoryAndBrand(String deviceType, String brand) {
        factory.produce(deviceType, brand);
    }
}
