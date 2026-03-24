package ocp;

public class DiscountApp {
    public static void main(String[] args) {
        DiscountStrategy studentRate = new StudentDiscount();
       // can also create for senior, pwd etc.
      
        Customer alice = new Customer("Saira", studentRate);
       
        double purchaseAmount = 100.0;

        System.out.println("Alice (Student) pays: $" + alice.applyDiscount(purchaseAmount));
    
        //Adding a new discount type (VIP) without changing Customer class
        Customer dave = new Customer("Dave", amount -> amount * 0.20); 
        System.out.println("Dave (VIP) pays: $" + dave.applyDiscount(purchaseAmount));
    }
}