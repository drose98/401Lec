package Recitation7;

public class PolarBear implements Bear{
	public void sleepOnIce() {
		System.out.println("Polarbears can sleep on ice.");
	}
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("A polarbear makes sound like a polarbear.");
	}
	@Override
	public void crawl() {
		// TODO Auto-generated method stub
		System.out.println("Polarbears crawl on the ice.");
	}
}
