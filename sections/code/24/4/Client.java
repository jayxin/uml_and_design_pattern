//客户端角色，代表咖啡摊的侍者
public class Client {
  //记录卖出咖啡的总数目
  private static Coffee[] coffees = new CoffeeFlavor[20];
  private static int ordersMade = 0;
  private static CoffeeFactory coffeeFactory;
  //静态方法，提供一杯咖啡
  private static void takeCoffees(String aFlavor) {
    coffees[ordersMade++]=coffeeFactory.
    getOrder(aFlavor);
  }
  public static void main(String[] args) {
    //创建口味工厂
    coffeeFactory = new CoffeeFactory();
    //创建一个个咖啡对象
    takeCoffees("Black Coffee");
    takeCoffees("Capucino");
    takeCoffees("Espresso");
    takeCoffees("Espresso");
    takeCoffees("Capucino");
    takeCoffees("Capucino");
    takeCoffees("Black Coffee");
    takeCoffees("Espresso");
    takeCoffees("Capucino");
    takeCoffees("Black Coffee");
    takeCoffees("Espresso");
    //将所创建的咖啡对象卖给客人
    for (int i = 0; i < coffeesMade; i++) {
      coffees[i].serve();
    }
    //打印出卖出的咖啡总数
    System.out.println("\nTotal teaFlavor objects
      made: "+coffeeFactory.getTotalFlavorsMade());
  }
}
