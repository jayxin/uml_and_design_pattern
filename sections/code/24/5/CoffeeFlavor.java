public class CoffeeFlavor extends Coffee {
  private String flavor;
  //构造函数，内部状态以参数方式传入
  public Flavor(String flavor) { this.flavor = flavor; }
  //普通方法，返回咖啡名字
  public String getFlavor() { return this.flavor; }
  //将咖啡卖给客人
  public void serve(Table table) {
    System.out.println("Serving table " + table
      .getNumber() + " with flavor " + flavor );
  }
}
