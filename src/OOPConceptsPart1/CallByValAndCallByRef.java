package OOPConceptsPart1;

public class CallByValAndCallByRef {
	int p;
	int q;
	public static void main(String[] args) {
		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		int x = 10;
		int y = 20;
		int z = obj.sum(x, y); //call by value or pass by value
		System.out.println(z);
		obj.p = 50;
		obj.q = 60;
		obj.swap(obj);
		//value after swap
		System.out.println(obj.p);
		System.out.println(obj.q);
	}
	public int sum(int a, int b) {
		a=30;
		b=40;
		int c=a+b;
		return c;
	}
	
	//call by reference or pass by reference
	public void swap(CallByValAndCallByRef t) {
		int temp;
		temp = t.p; // temp = 50
		t.p = t.q; // t.p = 60
		t.q = temp; // t.q = 50
	}
}
