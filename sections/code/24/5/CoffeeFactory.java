public class CoffeeFactory {
  private Coffee[] coffees = new Coffee[20];
  private int coffeesMade = 0;
  private int totalFlavors = 0 ;
  //工厂方法，根据所需的口味提供咖啡
  public Coffee getCoffee(String flavorToGet) {
    if (totalFlavors > 0) {
      for (int i = 0; i < totalFlavors; i++) {
        if (flavorToGet.equals((coffees[i]).getFlavor())) {
          totalFlavors++;
          return coffees[i];
        }
      }
    }
    coffees[totalFlavors] = new Coffee (flavorToGet);
    coffeesMade++;
    return flavors[totalFlavors++];
  }
  //辅助方法，返回创建过的口味种类的个数
  public int getTotalFlavorsMade() {
    return totalFlavors;
  }
}
