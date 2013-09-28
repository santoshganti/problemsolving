package access.modifier.demo.package3;

import access.modifier.demo.package1.AccessModifierDemoLib;

public class DemoClientOutsidePackage2 extends AccessModifierDemoLib {
	public void demo(){
		
		//thisIsNoAccessSpecifierMethod();
		thisIsProtectedMethod();
		thisIsPublicMethod();
		
	}
	public static void main(String[] args){
		DemoClientOutsidePackage2 d = new DemoClientOutsidePackage2();
		d.demo();
		
	}
}
