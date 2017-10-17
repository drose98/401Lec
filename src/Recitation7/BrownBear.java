package Recitation7;

public class BrownBear implements Bear{
	public void eatRabbit() {
		System.out.println("Brown bears eat rabbits.");
	}
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("A brown bear makes sound like a brown bear.");
	}
	@Override
	public void crawl() {
		// TODO Auto-generated method stub
		System.out.println("Brown bears crawl on the ground.");
	}
}
