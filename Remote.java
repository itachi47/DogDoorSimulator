import java.util.Timer;
import java.util.TimerTask;

public class Remote {

  private DogDoor door;

  public Remote(DogDoor door) {
    this.door = door;
  }

  public void buttonPressed() {
    System.out.println("Button is pressed on the remote...");
    if(door.isOpen()) {
      door.close();
    } else {
      door.open();
      final Timer timer = new Timer();
      timer.schedule(new CloseDoorAutomatically(timer), 5000);
    }
  }

  public class CloseDoorAutomatically extends TimerTask {

    private Timer timer;

    public CloseDoorAutomatically(Timer timer) {
      this.timer = timer;
    }

    public void run() {
      door.close();
      timer.cancel();
    }
  }
}
