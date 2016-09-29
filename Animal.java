abstract class Animal {
	private int order;
	protected String name;

	public Animal(String n) {
		name = n;
	}

	public void setOrder(int ord) {
		order = ord;
	}

	public int getOrder() {
		return order;
	}

	/* Compare orders of animals to return the older item */
	public boolean isOlderThan(Animal a) {
		return this.order < a.getOrder();
	}
}

class AnimalQueue {

	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();

	private int order = 0; // act as a timestamp  

	public void enqueue(Animal a) {
		/* Order is used as a sort of timestamp, so we can compare the 
		 * insertion order of a dog to a cat */

		a.setOrder(order);
		order++;

		if (a instanceof Dog) dogs.addLast((Dog) a);
		else if (a instanceof Cat) cats.addLast((Cat) a);
	}
	public Animal dequeueAny() {
		if (dogs.size() == 0) {
			return dequeueCats();
		} else if (cats.size() == 0) {
			return dequeueDogs();
		}
		Dog dog = dogs.peek();
		Cat cat = cats.peek();
		if (dog.isOlderThan(cat)) {
			return dequeueDogs();
		} else {
			return dequeueCats();
		}
 	}

 	public Dog dequeueDogs() {
 		return dog.poll();
 	}

 	public Cat dequeueCats() {
 		return cats.poll();
 	}
}

public class Dog extends Animal {
	public Dog(String n) { super(n); }
}

public class Cat extends Animal {
	public Cat(String n) { super(n);}
}
























