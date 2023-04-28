package task2;

public class App {
    public static void main(String[] args) {
        OperationDecorator operation = new NotifyOperation(1000, new AccountOperation());

        operation.withdrawMoney(10000);
    }
}
