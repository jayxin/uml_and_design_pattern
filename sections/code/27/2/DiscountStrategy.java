abstract public class DiscountStrategy {
  private double price = 0;
  private int copies = 0;
  abstract public double calculateDiscount();
  public DiscountStrategy(double price,int copies) {
    this.price=price;
    this.copies=copies;
  }
}
