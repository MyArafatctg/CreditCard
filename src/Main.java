public class Main {
    public static void main(String[] args) {
        try{
            CreditCard myCard = new CreditCard();
            // Test transactions
            myCard.withdrawCash(15000); // Valid withdrawal
            myCard.withdrawCash(6000);  // Valid withdrawal
//             myCard.withdrawCash(25000); // Uncomment to test transaction limit exception
            myCard.payBill(300000);    // Valid bill payment
             myCard.payBill(250000);    // Uncomment to test insufficient balance exception

            // Daily limit reset example
            myCard.resetDailyLimit();
            myCard.withdrawCash(5000); // Valid after reset
        }catch (Exception e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}