interface T{
	public void method(int n);
}

interface V{
	public int add(int n1, int n2);
}

public class LambdaMain {

	public static void main(String[] args) {
		T ob1 = n ->{
			System.out.println("n:" + n);
		};
		
		ob1.method(10);
		
		
		V ob = (n1, n2) ->{
			return n1+n2;
		};
		
		System.out.println(ob.add(100,3000));
		
		
		
	}

}
