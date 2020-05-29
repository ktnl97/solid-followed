public class CodHerApp {
    public static void main(final String[] args) {

     User user = User.create();

     if(!UserValidator.isValid(user)){
        return;
     }

     MailProvider mailProvider = new MailProvider();
     mailProvider.sendWelcomeEmail(user);

     IPaymentProvider paymentProvider = new PayPalPayment();
     paymentProvider.makePayment(100);
     
    }
 }