public class Keypad {
  private Command playCmd;
  private Command rewindCmd;
  private Command stopCmd;
  public Keypad(Command play, Command stop, Command rewind) {
    playCmd=play;
    stopCmd=stop;
    rewindCmd=rewind;
  }
  public void play() { // 具体action方法
    playCmd.execute();
  }
  public void stop() { stopCmd. execute(); }
  public void rewind() { rewindCmd. execute(); }
}
