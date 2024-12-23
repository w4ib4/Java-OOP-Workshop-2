package lvl5workshop2;
class Parent {
    private int privateVar = 10;     
    protected int protectedVar = 20; 
    public int publicVar = 30;      

    public int getPrivateVar() {
        return privateVar;
    }
}

class Child extends Parent {
    public void accessParentVariables() {

        System.out.println("Private Variable (via getter): " + getPrivateVar());

        System.out.println("Protected Variable: " + protectedVar);

        System.out.println("Public Variable: " + publicVar);
    }
}
public class Q4 {
	 public static void main(String[] args) {  
	        Child child = new Child();
	        child.accessParentVariables();
	    }

}
