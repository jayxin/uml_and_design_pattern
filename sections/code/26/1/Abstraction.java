abstract public class Abstraction {
  protected Implementor imp;
  //某业务逻辑方法
  public void operation() { imp.operationImp(); }
}
