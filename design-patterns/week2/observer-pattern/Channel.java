import java.util.ArrayList;

public class Channel implements Subject {

  private ArrayList<Observer> observers = new ArrayList<>();
  private String channelName;
  private String status;

  public Channel(String channelName, String status) {
    this.channelName = channelName;
    this.status = status;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
    notifyObservers();
  }

  public String getChannelName() {
		return channelName;
	}
	
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  public void notifyObservers() {
    for (Observer o : observers) {
      o.update(this.status);
    }
  }

}