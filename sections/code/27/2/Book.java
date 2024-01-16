class Book {
  private DiscountStrategy strategy;
  private float price;
  void setStrategy(DiscountStrategy st) { this.strategy=st; }
  // ...
  float getPrice(int copies) {
    return price*copies-strategy.calculateDiscount();
  }
}
