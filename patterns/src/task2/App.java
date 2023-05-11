package task2;

public class App {
    public static void main(String[] args) {
        OperationDecorator operation = new NotifyOperation(100, new AccountOperation(),10);
        operation.withdrawMoney(10000);
    }
}
