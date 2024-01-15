public class FlyweightFactory {
  private HashMap flies = new HashMap();
  public FlyweightFactory(){}
  //复合享元工厂方法，所需状态以参数形式传入
  //这个参数恰好可以使用String类型。
  public Flyweight factory(String compositeState) {
    ConcreteCompositeFlyweight compositeFly =
    new ConcreteCompositeFlyweight();
    int length = compositeState.length();
    Character state = null;
    for(int i = 0; i < length; i++) {
      state = new Character (compositeState.charAt(i) );
      compositeFly.add(state, this.factory(state));
    }
    return compositeFly;
  }
  //单纯享元工厂方法，所需状态以参数形式传入
  public Flyweight factory(Character state) {
    //检查具有此状态的享元是否已经存在
    if (flies.containsKey(state)) { //已存在，直接返回
      return (Flyweight) flies.get(state);
    } else { //不存在，创建新实例
      Flyweight fly = new ConcreteFlyweight(state);
      flies.put(state, fly); //将实例存储到聚集中
      return fly; //将实例返回
    }
  }
}
