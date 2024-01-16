abstract public class Account {
  protected String accountNumber;
  public Account() { accountNumber = null; }
  public Account(String accountNumber) {
    this.accountNumber = accountNumber;
  }
  final public double calculateInterest() {
    double interestRate = doCalculateInterestRate(); //计算利率
    String accountType = doCalculateAccountType(); //获得账户类型
    double amount = calculateAmount(accountType, accountNumber);
    return amount * interestRate;
  }
  abstract protected String doCalculateAccountType();
  abstract protected double doCalculateInterestRate();
  final public double calculateAmount(String accountType,
    String accountNumber) {
    //retrieve amount from database...here is only a mock-up
    return 7243.00D;
  }
}