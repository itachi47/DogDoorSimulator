public class DogDoor {

  private boolean open;

  public DogDoor() {
    this.open = false;
  }

  public boolean isOpen() {
    return open;
  }
  
  public void open() {
    System.out.println("Openning the door");
    open = true;
  }

  public void close() {
    System.out.println("Closing the door");
    open = false;
  }

}
