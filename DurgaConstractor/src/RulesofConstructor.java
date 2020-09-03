
public class RulesofConstructor {
	
	void RulesofConstructor(){
		/**Same as class name
		 When constructor will be execute?
		 Whenever we create an object, constructor will be executed automatically
		 return type concept not applicable for constructor not even for void
		**/ 
		System.out.println("Hello");
	}
	
	public static void main(String[]args) {
		RulesofConstructor r1 = new RulesofConstructor();
		RulesofConstructor r2 = new RulesofConstructor();
		r1.RulesofConstructor();// without this line nothing will print because of this line it treated as method
		
	}
	
	/** we run the constructor with void which turns to a method
	 * that's why when we run the code nothing happened
	 * 
	 * 
	 * It is allowed to have same method name as class name but it is not a
	 * good practice because it is reserved for constructor
	 */
	
	/**
	 * Access Modifiers for Constructor
	 * Public(default), protected, private
	 * 
	 * if we don't write any constructor the COMPILER 
	 * will create a default constructor itself.
	 */
	
	/**
	 * super() & this()
	 * We can use only inside the constructors
	 * We should use only in the first line
	 * We can use only one but not both simultaneously
	 */
}
