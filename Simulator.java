public class Simulator {

  public static void main(String[] args) {
    DogDoor door = new DogDoor();
    Remote remote = new Remote(door);

    System.out.println("Fido barks to go outside....");
    remote.buttonPressed();

    System.out.println("Fidon has gone outside....");
    System.out.println("Fido is done with business....");

    try {
      Thread.currentThread().sleep(10000);
    } catch (Exception ex) {ex.printStackTrace();}

    System.out.println("He is stuck outside!");

    System.out.println("Fido started barking....");
    System.out.println("Gina pressed the button on the remote...");
    remote.buttonPressed();

    System.out.println("Fido is back again...");
  }
}
