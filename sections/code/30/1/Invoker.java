public class Invoker {
  private Command command;
  public Invoker(Command command) { this.command=command; }
  public void action() { /* 行动方法 */
    command.execute();
  }
}
