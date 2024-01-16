public class StopCommand implements Command {
  private AudioPlayer myAudio;
  public StopCommand(AudioPlayer a) { myAudio=a; }
  public void execute() { myAudio.stop(); }
}
