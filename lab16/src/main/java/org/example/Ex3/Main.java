package org.example.Ex3;

public class Main {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        Publisher publisher = new Publisher(mediator);
        PostOffice postOffice = new PostOffice();
        Factory factory = new Factory(mediator);

        mediator.setPublisher(publisher);
        mediator.setPostOffice(postOffice);
        mediator.setFactory(factory);

        User user = new User(factory);
        user.selectCategoryAndBrand("телефон", "Samsung");

        publisher.publish("Газета A", "Подписчик 1");
        publisher.publish("Журнал B", "Подписчик 2");
    }
}
