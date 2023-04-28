package org.example.Ex2;

public class NotifyOperation extends OperationDecorator {
    private int amount;

    public NotifyOperation(int amount, Operation operation) {
        super(operation);
        this.amount = amount;
    }

    @Override
    public void withdrawMoney(int money) {
        if(money > amount){
            System.out.println("Сообщение отправлено");
        }
        super.withdrawMoney(money);
    }
}
