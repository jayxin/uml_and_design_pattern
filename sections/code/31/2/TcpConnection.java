public class TcpConnecion {
  private TcpState state;
  public void open() { state.open(); }
  public void setState(TcpState state) { this.state=state; }
  public void close() { state.close(); }
  public void acknowledge() { state.acknowledge(); }
}
