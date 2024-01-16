public class User {
  private static Keypad keypad;
  private static AudioPlayer myAudio = new AudioPlayer();
  public static void main(String[] args) { test1(); }
  private static void test1() {
    Command play=new PlayCommand(myAudio);
    Command stop=new StopCommand(myAudio);
    Command rewind=new RewindCommand(myAudio);
    keypad=new Keypad(play,stop,rewind);
    kepad.play();
    kepad.stop();
    kepad.rewind();
    kepad.stop();
    kepad.play();
    kepad.stop();
  }
}
