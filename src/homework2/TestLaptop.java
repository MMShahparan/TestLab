package homework2;

public class TestLaptop {

	public static void main(String[] args) {
		
		Laptop obj1 = new Laptop();
		
		
		Laptop obj2 = new Laptop("Mac Pro","iOS");
		obj2.basicsInfo();
		
		Laptop obj3 = new Laptop(256, "8");
		
		obj3.laptopMemory();


	}

}
