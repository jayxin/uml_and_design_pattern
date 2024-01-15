public class CoffeeFlavor extends Coffee {
  private String flavor;
  public CoffeeFlavor(String flavor) { //内部状态以参数方式传入
    this.flavor = flavor;
  }
  public String getFlavor() { //返回咖啡名字
    return this.flavor;
  }
  public void serve() { //将咖啡卖给客人
    System.out.println("Serving flavor " + flavor );
  }
}
