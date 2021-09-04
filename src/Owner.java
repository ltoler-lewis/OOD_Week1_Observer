import java.util.*;


public class Owner implements Human {

	//List of subscribers
	private List<Observer> observers;
	//String to represent current action. Should be replaced with defined enums later
	private String status = "nothing";
	

	public Owner() {
		observers = new ArrayList<Observer>();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(status);
		}
	}
	
	public void feedPet() {
		System.out.println("The owner is filling the  food bowl!");
		status = "food";
		notifyObservers();
	}
	
	public void playTime() {
		System.out.println("The owner just picked up a wand toy!");
		status = "play";
		notifyObservers();
	}
	
	public void goToBed() {
		System.out.println("The owner just went to bed.");
		status = "sleep";
		notifyObservers();
	}

}