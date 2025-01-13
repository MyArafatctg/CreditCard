public class CreditCard {
    private final double MAX_LIMIT = 5_00_000;
    private final double DAILY_WITHDRAWAL_LIMIT = 1_00_000;
    private final double TRANSACTION_LIMIT = 20_000;

    private double balance;
    private double dailyWithDrawalAmount;

    public CreditCard(){
        this.balance = MAX_LIMIT;
        this.dailyWithDrawalAmount = 0;
    };

    public void withdrawCash(double amount) throws Exception{
        if (amount > TRANSACTION_LIMIT){
            throw new Exception("Transaction limit exceeded! Maximum allowed is " + TRANSACTION_LIMIT);
        }
        if (dailyWithDrawalAmount + amount > TRANSACTION_LIMIT){
            throw new Exception("Daily withdrawal limit exceeded! Maximum allowed per day is " + DAILY_WITHDRAWAL_LIMIT);
        }
        if (amount > balance){
            throw new InsufficientFundsException();
        }

        balance -=amount;
        dailyWithDrawalAmount +=amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    };

    public void payBill(double amount) throws Exception{
        if (amount > balance){
            throw new InsufficientFundsException();
        }

        balance -=amount;
        System.out.println("Bill payment successful. Remaining balance: " + balance);
    }

    public void resetDailyLimit(){
        dailyWithDrawalAmount = 0;
    };

    public double getBalance(){
        return balance;
    }
}
