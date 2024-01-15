import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
public class FlyweightFactory {
  private HashMap flies = new HashMap();
  private Flyweight lnkFlyweight;
  public FlyweightFactory() {  } //默认构造函数
  //构造函数,内部状态作为参数传入
  public synchronized Flyweight factory (Character state) {
    if (flies.containsKey(state)) {
      return (Flyweight) flies.get(state);
    } else {
      Flyweight fly = new ConcreteFlyweight(state);
      flies.put(state, fly);
      return fly;
    }
  }
  public void checkFlyweight() { //辅助方法
    Flyweight fly ;
    int i = 0;
    System.out.println("\n==========checkFlyweight()=============");
    for (Iterator it = flies.entrySet().iterator(); it.hasNext();) {
      Map.Entry e = (Map.Entry) it.next();
      System.out.println("Item " + (++i) + " : " + e.getKey());
    }
    System.out.println("==========checkFlyweight()=============");
  }
}
