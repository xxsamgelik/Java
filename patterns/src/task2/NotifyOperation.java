package task2;

public class NotifyOperation extends OperationDecorator {
    private int amount;
    private int money;
    private int maney;

    public NotifyOperation(int amount, Operation operation,int money) {
        super(operation);
        this.amount = amount;
        this.money=money;
        //this.maney=maney;
//        if(money > maney){
//            if(money>amount)
//                System.out.println("Со счета снята сумма" + maney);
//        }
//        else
//        {
//            System.out.println("Сумма снятия привышает сумму на счете");
//        }
    }

    @Override
    public void withdrawMoney(int maney) {
        if(money > maney){
            if(maney>amount)
            System.out.println("Со счета снята сумма "  + maney);
        }
        else
        {
            System.out.println("Сумма снятия привышает сумму на счете");
        }
        super.withdrawMoney(money);
    }
}
