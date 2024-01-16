public class LoginState extends UserState {
  public LoginState() {  }
  public boolean login(String userId, String password) {
    setNextPage(UserState.PAGE_WELCOME);
    setCurrentState(new LoginState());
    return true;
  }
  public void logout() {
    setNextPage(UserState.PAGE_LOGIN);
    setCurrentState(new LogoutState());
  }
}
