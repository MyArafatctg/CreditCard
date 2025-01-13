public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){
        super("Insufficient fund in you account.");
    }
    public InsufficientFundsException(String message){
        super(message);
    }
}
