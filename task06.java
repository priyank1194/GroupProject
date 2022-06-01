package groupProject;

public class task06 {

	public static void main(String[] args) {
		System.out.println("Before swapping numbers");
		int a=10;
		int b=20;
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
		System.out.println("After swapping numbers");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);
	}

}
