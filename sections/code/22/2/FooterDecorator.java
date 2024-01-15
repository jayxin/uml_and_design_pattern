// 具体装饰类—发票尾部
public class FooterDecorator extends OrderDecorator {
  public FooterDecorator(Order order) { super(order); }
  public void print() {
    order.print();
    printFooter();
  }
  private void printFooter() {
    out.println("发票尾……..");
    // ...
  }
  // ...
}
