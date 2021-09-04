
//Laura Toler


import java.io.IOException;

public class PetOwnership{
	 public static void main(String []args) throws InterruptedException{
		 
		 Owner owner = new Owner();
		 Cat kitty = new Cat(owner);
		 
		 //Its time to feed the cat
		 owner.feedPet();
		 
		 //Pause
		 Thread.sleep(2000);
		 
		 //Play with the cat
		 owner.playTime();
		 
		//Pause
		 Thread.sleep(2000);
		 
		 //Go to bed (or try to)
		 owner.goToBed();
		 
		 
	 }
}
