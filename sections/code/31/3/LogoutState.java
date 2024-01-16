public class LogoutState extends UserState {
  public LogoutState() {  }
  public boolean login(String userId, String password) {
    StringBuffer sql=new StringBuffer(50);
    sql.append("select count(*) from user_info where user_id='");
    sql.append(userId);
    sql.append("' and password='");
    sql.append(password);
    sql.append("'");
    int counting=DBManager.query(sql.toString());
    if (counting > 0) {
      this.setNextPage(UserState.PAGE_WELCOME);
      this.setCurrentState(new LoginState());
      return true;
    } else {
      this. setCurrentState(new LogoutState());
      setNextPage(UserState.PAGE_LOGIN);
      return false;
    }
  }
  public void logout() {
    this.setCurrentState(new LogoutState());
    setNextPage(UserState.PAGE_LOGIN);
  }
}
