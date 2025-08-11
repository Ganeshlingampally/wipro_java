package Assignment_1;

public class Calculator {
	
	void add(int a,int b) {
		int res = a + b;
		System.out.println("Addition : "+res);
	}
	
	void sub(int a,int b) {
		int res = a - b;
		System.out.println("Subtraction : "+res);
	}
	
	void mul(int a,int b) {
		int res = a * b;
		System.out.println("Multiplication : "+res);
	}
	
	void div(int a,int b) {
		int res = a / b;
		System.out.println("Division : "+res);
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator cal = new Calculator();
		int num1 = 20;
		int num2 = 10;
		cal.add(num1, num2);
		cal.sub(num1, num2);
		cal.mul(num1, num2);
		cal.div(num1, num2);
	}

}
