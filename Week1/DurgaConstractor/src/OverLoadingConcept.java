
public class OverLoadingConcept {
	
	OverLoadingConcept(double d){
		this(10);
		System.out.println("Double Args Constructor");
	}
	
	OverLoadingConcept(int d){
		this();
		System.out.println("Int Args Constructor");
	}
	
	OverLoadingConcept(){
		System.out.println("No Args Constructor");
	}
	
	

	public static void main(String[] args) {
		OverLoadingConcept o1 = new OverLoadingConcept(10.5);
		//OverLoadingConcept o2 = new OverLoadingConcept(10);
		//OverLoadingConcept o3 = new OverLoadingConcept();
	}

}
