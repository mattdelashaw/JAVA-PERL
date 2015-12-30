import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.util.Scanner;

class FarmFinch {

	public String animal;

	Finch myFinch = new Finch();

	public String getAnimal() {
		return(animal);
	}

	public boolean setAnimal(String animal) {
		if (animal.equals("cow")||animal.equals("horse")||animal.equals("duck")||animal.equals("chicken")||animal.equals("sheep")||animal.equals("fox")) {
			return true;
		}else {
			return false;
		}
	}

	public void setRandomAnimal() {

	}

	void Cow() {
		myFinch.saySomething("mooooo");// i prefer the awful computer voice over .playClip
		System.out.println("mooooo");
		myFinch.setLED(255,140,0);
	}

	void Horse() {
		myFinch.saySomething("neigh");
		System.out.println("neigh");
		myFinch.setLED(139,69,19);
	}

	void Duck() {
		myFinch.saySomething("quack");
		System.out.println("quack");
		myFinch.setLED(255,255,0);
	}

	void Chicken() {
		myFinch.saySomething("cockadoodledoo");
		System.out.println("cockadoodledoo");
		myFinch.setLED(255,255,255);
	}

	void Sheep() {
		myFinch.saySomething("baaaaah");
		System.out.println("baaaaah");
		myFinch.setLED(255,255,255);
	}

	void Fox() {
		myFinch.saySomething("wa-pa-pa-pa-pa-pa-pow!");
		System.out.println("wa-pa-pa-pa-pa-pa-pow!");
		myFinch.setLED(255,0,0);
	}
}
