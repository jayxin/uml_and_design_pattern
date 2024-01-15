// 抽象发票类
abstract public class Order {
  private  Vector<OrderLine> items = new Vector();
  public void print() {
    for (int i = 0; i < items.size(); i++) {
      OrderLine item = (OrderLine)items.get(i);
      item.printLine();
    }
  }
  // ...
}
