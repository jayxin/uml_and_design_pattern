// 抽象装饰类
abstract public class OrderDecorator extends Order {
  protected Order order;
  public OrderDecorator(Order order) { this.order = order; }
  // ...
}
