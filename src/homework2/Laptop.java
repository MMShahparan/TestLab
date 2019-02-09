package homework2;

public class Laptop {

	private String name;
	private String opSystem;
	private int storage;
	private	static double screenSize;
	private	String ram;
	private static String screenResolution;
	private static double price = 0.0;
	
	
	Laptop () {
		
		System.out.println("My Laptop: ");
		
	}
	
	Laptop (String name, String os) {
		
		this.name = name;
		this.opSystem = os;
	}
		
	
	public Laptop(int strg,  String ram) {

		this.storage = strg;
		this.ram = ram;
		
	
	}
	
	public Laptop(String sr, double ss) {
		
		sr = screenResolution;
		ss = screenSize;
		
	}


	public void basicsInfo() {
		
		System.out.println("The brand is " + name + "\nOperation System is " + opSystem);
	}


	public void  laptopMemory() {
		
		System.out.println("RAM: " + ram + "GB," + " " + "Storage " + storage + "GB");
	
	}


	public static void laptopScreen(String sr, double ss) {
		
		System.out.println("Screen resoloution and size is " + sr + "and " + ss);
	}

	public static double  getPrice(double price) {
		
		return price;
			
	}
	
	public static void main(String[] args) {
	
		System.out.println("price: USD" + Laptop.getPrice(2000.0));
		Laptop obj = new Laptop();
		 obj.laptopScreen("FHD 2160x1440", 12.5);
	
		
	}

	

}
