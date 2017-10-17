package Recitation7;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	public static void main(String...args) {
		//Using makeSound() method
		List<Animal> listForSounds=new ArrayList<Animal>();
		listForSounds.add(new Bird());
		listForSounds.add(new BrownBear());
		listForSounds.add(new PolarBear());
		System.out.println("Animals are making sounds...");
		for(Animal a:listForSounds) {
			a.makeSound();
		}
		System.out.println("");
		//Using crawl() method
		List<Bear> listForCrawl=new ArrayList<Bear>();
		listForCrawl.add(new BrownBear());
		listForCrawl.add(new PolarBear());
		System.out.println("Bears are crawling.");
		for(Bear b:listForCrawl) {
			b.crawl();
		}
		System.out.println("");
		//Using fly(), sleepOnIce(), eatRabbit() methods
		Bird bird =new Bird();
		BrownBear brownBear=new BrownBear();
		PolarBear polarBear=new PolarBear();
		System.out.println("Different kinds of animals are doing different things.");
		bird.fly();
		brownBear.eatRabbit();
		polarBear.sleepOnIce();

	}
}
