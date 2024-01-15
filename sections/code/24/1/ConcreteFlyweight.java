public class ConcreteFlyweight extends Flyweight {
  private Character innerState = null;
  // 构照函数，内部状态作为参数传入
  public ConcreteFlyweight(Character state) {
    this.innerState = state;
  }
  //外部状态作为参数传入方法中，改变方法的行为
  //但并不改变对象的内部状态
  public void operation(String state) {
    System.out.print( "\nIntrinsic State = " + innerState +
      ", Extrinsic State = " + state);
  }
}
