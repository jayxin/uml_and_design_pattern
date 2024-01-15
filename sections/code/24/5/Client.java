public class Client {
  //卖出的咖啡总数
  private static Coffee[] coffee s=new Coffee[100];
  private static int coffeesMade = 0;
  private static CoffeeFactory coffeeFactory;
  //静态方法，提供一杯咖啡
  private static void takeCoffees(String aFlavor) {
    coffees[coffeesMade++] = flavorFactory.getCoffee(aFlavor);
  }
  public static void main(String[] args) {
    //创建咖啡工厂对象
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
      coffees[i].serve(new Table(i));
    }
    //打印卖出的咖啡总数
    System.out.println("\nTotal teaFlavor objects made:"+ flavorFactory.
      getTotalFlavorsMade());
  }
}
