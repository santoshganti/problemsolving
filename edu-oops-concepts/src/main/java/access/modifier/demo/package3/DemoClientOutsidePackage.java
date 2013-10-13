package access.modifier.demo.package3;

import access.modifier.demo.package1.AccessModifierDemoLib;

public class DemoClientOutsidePackage {
	public void demo(){
		AccessModifierDemoLib a = new AccessModifierDemoLib();
		//a.thisIsNoAccessSpecifierMethod();
		//a.thisIsProtectedMethod();
		a.thisIsPublicMethod();
		
	}
	public static void main(String[] args){
		DemoClientOutsidePackage d = new DemoClientOutsidePackage();
		d.demo();
		
	}
}
