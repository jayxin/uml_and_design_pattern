public abstract class UserState {
  private UserState state;
  private String nextPage;
  protected static String  PAGE_WELCOME=
  "/javapatterns/state/welcome.html";
  protected static String PAGE_LOGIN=
  "/javapatterns/state/login.html";
  public UserState() { this.nextPage= PAGE_LOGIN; }
  /*行为方法*/
  public abstract boolean login(String userId,String password);
  public abstract void logout();
  /*设置状态*/
  public void setCurrentState(UserState state) { this.state=state; }
  /*获取当前状态*/
  public UserState getCurrentState() {
    if (this.state==null) {
      this.state=new LogoutState();
    }
    return this.state;
  }
  public String getNextPage() { return nextPage; }
  public void setNextPage(String nextPage) { this.nextPage=nextPage; }
}
