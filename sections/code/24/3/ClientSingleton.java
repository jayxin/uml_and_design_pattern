public class ClientSingleton {
  private static FlyweightFactorySingleton factory;
  public static public void main(String[] args) {
    //创建享元工厂对象
    factory = FlyweightFactorySingleton.getInstance();
    //向享元工厂对象请求一个内部状态为’a’的对象
    Flyweight fly = factory.factory(new Character('a'));
    //以参数方式传入外部状态
    fly.operation("First Call");
    //向工厂对象请求一个内部状态为’b’的对象
    fly = factory.factory(new Character('b'));
    //以参数方式传入外部状态
    fly.operation("Second Call");
    //向工厂对象请求一个内部为’a’的享元对象
    fly = factory.factory(new Character('a'));
    //以参数方式传入外部状态
    fly.operation("Third Call");

  }
}
