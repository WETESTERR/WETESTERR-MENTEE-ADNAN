
public class Example2 implements InterfaceExample {
	
	public void sayHi() {
		System.out.println("Say Hi");
	}
	
	public static void main(String[] args) {
		Encapsulation e1 = new Encapsulation();
		e1.setFlavor("Beef");
		System.out.println(e1.getFlavor());
		e1.openBag();
	}

	@Override
	public void openBag() {	
		System.out.println("Bag Opened");
	}

}
