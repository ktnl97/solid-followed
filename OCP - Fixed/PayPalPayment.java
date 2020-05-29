
public class PayPalPayment implements IPaymentProvider{

    public void makePayment(float amount){
        System.out.println("***********************************");
        System.out.format("Making the payment for the amount %s by PayPal %n", amount);
        System.out.println("Payment Successful");
        System.out.println("***********************************");
    }

}