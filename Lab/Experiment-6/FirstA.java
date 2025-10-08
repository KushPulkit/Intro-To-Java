class Animal {
	void eat(){
		System.out.println("Animal is Eating");
	}
}

interface Pet{
   void play();
}

interface Wild{
	void hunt();
}

class Dog extends Animal implements Pet, Wild {
  public void play(){
  	System.out.println("Dog is Playing");
  }
  public void hunt(){
  	System.out.println("Dog is hunting");
  }
  void DogDisplay(){
  	System.out.println("This is Dog");
  }
}

public class FirstA {
	public static void main(String args[]){
		System.out.println("Pulkit Kush, 24csu166");
		Dog ob = new Dog();
		ob.DogDisplay();
		ob.hunt();
		ob.play();
		ob.eat();
	}
}