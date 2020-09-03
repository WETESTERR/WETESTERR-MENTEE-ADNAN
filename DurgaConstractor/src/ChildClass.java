
public class ChildClass extends ParentClass {
	
	String s = "Child Variable";
	
	public void m1() {
		System.out.println(s);// it will print child class
		System.out.println(this.s);// it will print child class
		System.out.println(super.s);// it will print parent class
	}
	
	/*
	 * public static void m1() { // We can not use static, if we do compiler will throw an error
	 * System.out.println(s);// it will print child class
	 * System.out.println(this.s);// it will print child class
	 * System.out.println(super.s);// it will print parent class }
	 */
}
	class Try {
		public static void main(String[] args) {
			ChildClass c = new ChildClass();
			c.m1();	

		}
	}


