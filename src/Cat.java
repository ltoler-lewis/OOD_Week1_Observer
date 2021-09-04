public class Cat implements Observer, Pet {

	private Owner owner;
	
	
	public Cat(Owner owner) {
		this.owner = owner;
		owner.registerObserver(this);
	}
	
	public void behavior(String status) {
		//Use a switch statement to decide the cat's action. Again, should use enums not plain Strings in the future
		switch(status) {
		case "food":
			System.out.println("The cat comes running into the kitchen and winds around his feet,"
					+ " nearly tripping him\n ");
			break;
		case "play": 
			System.out.println("The cat comes running over to play. She jumps after the toy until "
					+ "the both of them are exhausted\n");
			break;
		case "sleep":
			System.out.println("The cat jumps onto the bed and starts attack his feet underneath the covers. "
					+ "\nBecause 11pm is clearly playtime.");
			break;
		
		}
	}

	@Override
	public void update(String status) {
		//When update is called, pass the status to behavior
		//Keeping as separate functions for now
		behavior(status);
	}

}