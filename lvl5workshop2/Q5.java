package lvl5workshop2;
final class FinalClass {
    public void displayMessage() {
        System.out.println("This is a message from the final class.");
    }
}
class ParentClass {
    public final void finalMethod() {
        System.out.println("This is a final method in the ParentClass.");
    }

    public void nonFinalMethod() {
        System.out.println("This is a non-final method in the ParentClass.");
    }
}

class SubClass extends ParentClass {
    // Attempting to override a final method
    // @Override
    // public final void finalMethod() {
    //     System.out.println("Attempting to override the final method."); // Compilation error
    // }

    // Overriding a non-final method
    @Override
    public void nonFinalMethod() {
        System.out.println("This is an overridden non-final method in the SubClass.");
    }
}
public class Q5 {
	 public static void main(String[] args) {
	     
	        FinalClass finalClass = new FinalClass();
	        finalClass.displayMessage();
	        ParentClass obj = new SubClass();
	        obj.finalMethod();        
	        obj.nonFinalMethod();    
	    }

}
