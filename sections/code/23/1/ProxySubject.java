public class ProxySubject extends Subject {
  private RealSubject realSubject;
  public ProxySubject() {  }
  public void request() { // 实现请求方法
    preRequest();
    if (realSubject == null) {
      realSubject = new RealSubject();
    }
    realSubject.request();
    postRequest();
  }
  // 请求前的操作
  private void preRequest() {  }
  //请求后的操作
  private void postRequest() {  }
}
