// 客户端类
public class Clint {
  private Order order;
  public static void main(String args[]) {
    order=new SalesOrder();
    OrderLine line1=new OrderLine();
    line1.setName("毛巾");
    line1.setUnits(1);
    line1.setPrice(10);
    order.addItem(line1);
    order=new HeaderDecorator(new FooterDecorator(order));
    order.print();
  }
}
