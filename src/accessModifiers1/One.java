package accessModifiers1;

public class One {
	public void publicFunc() {
		System.out.println("This is a public function");
	}
	void defaultFunc1() {
		System.out.println("This is a default function");
	}
	private void privateFunc() {
		System.out.println("This is a private function");
	}
	protected void protectedFunc() {
		System.out.println("This is a protected function");
	}
	private void privateFuncwithArg(String s, int i) {
		System.out.println(s+i);
	}
}
class Two{ // default access specifier
	void defaultFunc() {
		System.out.println("This is a default function in Two");
	}
	
}
class Six{}//multiple default classes can be created within the same package
//public class Five {}//within the same package public class can be created only once

//private class Three{} //illegal modifier for class three -- private access modifier not allowed for class
//protected class Four{} // protected access modifier not allowed for class