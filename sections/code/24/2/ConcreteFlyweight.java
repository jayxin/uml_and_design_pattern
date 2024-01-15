public class ConcreteFlyweight extends Flyweight {
  private Character innerState = null;
  //构造函数,内部状态作为参数传入
  public ConcreteFlyweight(Character state) {
    this.innerState = state;
  }
  //外部状态作为参数传入到方法中
  public void operation(String state) {
    System.out.print("\nInternal State = " + innerState
      + " Extrinsic State = " + state);
  }
}
