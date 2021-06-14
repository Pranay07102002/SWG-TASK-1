package basics;

public class Part2 {

	public static void main(String[] args) {
		
		Truck x1 = new Truck();
		x1.speed = 100.54;
		x1.regularPrice = 1500000;
		x1.color ="orange";
		x1.weight = 3000;
		
		Truck y1 = new Truck();
		y1.speed = 110.84;
		y1.regularPrice = 1600000;
		y1.color ="yellow";
		y1.weight = 2000;
		
		System.out.println("Price of Truck T1 is: " + x1.getSalePrice());
		System.out.println("Price of Truck T2 is: " + y1.getSalePrice());
		
		
	}
}
 

 class car{
	double speed;
	float regularPrice;
	String color;
	
	float getSalePrice() {
		return regularPrice;
	}
	
	
}
 
 class Truck extends car{
	 float weight;
	 
	 float getSalePrice() {
		 if(weight>2300) 
			 {return (float) (0.9*regularPrice);}
		 else
		 { return (float) (0.8*regularPrice);}
		 
	 }
 }