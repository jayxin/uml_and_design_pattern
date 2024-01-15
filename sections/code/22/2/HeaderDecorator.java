// 具体装饰类—发票头部
abstract public class HeaderDecorator extends OrderDecorator {
  private String cusName;
  private Date date;
  public HeaderDecorator(Order order) { super(order); }
  public void print() {
    printHeader();
    order.print();
  }
  private void printHeader() {
    out.println("发票头……..");
    out.println("顾客名：" + cusName + ";购物日期：" + date);
    // ...
  }
  // ...
}
