

public class Youtube {

	public static void main(String args[]) {
    System.out.println("HELLO Youtubre");

    Follower follower1 = new Follower("User 1");
    Follower follower2 = new Follower("User 2");
    Follower follower3 = new Follower("User 3");
    Channel channel = new Channel("PewPew", "No Videos");
    channel.registerObserver(follower1);
    channel.registerObserver(follower2);
    channel.registerObserver(follower3);
    channel.removeObserver(follower1);
    // update channel
    channel.setStatus("New video");

  }

}