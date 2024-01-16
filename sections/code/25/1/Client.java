public class Client {
  static private Camera camera1, camera2;
  static private Light light1, light2, light3;
  static private Sensor sensor;
  static private Alarm alarm;
  public static void main(String[] args) {
    camera1.turnOn();
    camera2.turnOn();
    light1.turnOn();
    light2.turnOn();
    light3.turnOn();
    sensor.activate();
    alarm.activate();
  }
}
