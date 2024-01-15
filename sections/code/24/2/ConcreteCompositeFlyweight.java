import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
public class ConcreteCompositeFlyweight extends Flyweight {
  private HashMap flies = new HashMap(10);
  public ConcreteCompositeFlyweight() {  }
  //增加一个新的单纯享元对象到聚集中
  public void add(Character key, Flyweight  fly) { flies.put(key, fly); }
  //外部状态作为参数传入到方法中
  public void operation(String extrinsicState) {
    Flyweight fly =  null;
    for (Iterator it = flies.entrySet().iterator(); it.hasNext();) {
      Map.Entry e = (Map.Entry) it.next();
      fly = (Flyweight) e.getValue();
      fly.operation(extrinsicState);
    }
  }
}
