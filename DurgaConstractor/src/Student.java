/**
 * 
 */

/**
 * @author adnan
 *
 */
public class Student {

	/**
	 * @param args
	 */
	
	String name;
	int rollno;
	
	Student(String name, int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	
	/**
	 * For Every Object constructor will be created
	 * Perform initialization of an object
	 * @param args
	 */
	
	public static void main(String[] args) {
		Student s1 = new Student("Durga", 101);
		Student s2 = new Student("Ravi",102);
		System.out.println(s1.name+".."+s1.rollno);
		System.out.println(s2.name+".."+s2.rollno);
	}

}
