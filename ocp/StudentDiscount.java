package ocp;
   public class StudentDiscount implements DiscountStrategy {
    public double calculate(double amount) { return amount * 0.05; }
}