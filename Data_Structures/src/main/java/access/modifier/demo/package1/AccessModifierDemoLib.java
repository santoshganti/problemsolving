package access.modifier.demo.package1;

public class AccessModifierDemoLib {
	public void thisIsPublicMethod() {
		System.out.println("Public Method Called");
	}

	private void thisIsPrivateMethod() {
		System.out.println("Private method called");
	}

	protected void thisIsProtectedMethod() {
		System.out.println("Protected method called");
	}

	void thisIsNoAccessSpecifierMethod() {
		System.out.println("This method has no access specifier mentioned");
	}
}
