package access.modifier.demo.package1;

public class DemoClient {
	public void demo(){
		AccessModifierDemoLib a = new AccessModifierDemoLib();
		a.thisIsNoAccessSpecifierMethod();
		a.thisIsProtectedMethod();
		a.thisIsPublicMethod();
		
	}
	public static void main(String[] args){
		DemoClient d = new DemoClient();
		d.demo();
		
	}
}
