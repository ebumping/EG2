package stock;

public class StockController {
	
	public static void main(String[] argz){
		
		//First object instance is created
		StockOb s1 = new StockOb(211.20, "APPL", 310.09, 120.89, 1000000);
		//Set Attribs
		s1.setCurrentPrice(211.20);
		s1.setSymbol("APPL");
		s1.setVolume(1000000);
		s1.setyHigh(310.09);
		s1.setyLow(120.89);
		
		System.out.println(s1);		
		
		StockOb s2 = new StockOb();
		s2.setCurrentPrice(150.11);
		s2.setSymbol("BLZRD");
		s2.setVolume(5000000);
		s2.setyHigh(178.01);
		s2.setyLow(100.00);
		
		System.out.println(s2);
		
		StockOb s3 = new StockOb(100.00, "TST", 200.00, 50.00, 1000000);
		System.out.println(s3);
		
		StockOb s4 = new StockOb(175.00, "PUP", 300.00, 15.00, 4000000);
		System.out.println(s4);
		
		StockOb s5 = new StockOb(300.00, "BThSDA", 189.00, 75.00, 1000000);
		System.out.println(s5);
	}

}
