
public class Follower implements Observer {

  private String name;

  public Follower(String name) {
    this.name = name;
  }

  public void update(String status) {
    System.out.println("Follower: " + name + " Updated. " + "Status: " + status);
  }

  public void play() {
    System.out.println("Play video");
  }

}