
public class ChocolateFactory {

	public static void main(String[] args) {
		
		Chocolate cadburyDairyMilk = new Chocolate("DairyMilk",156.00,1999,"Paperbox",false);
		Chocolate fiveStar=new Chocolate("5Star New Soft Bar",25.00,10,"Silverfoil",false);
		Chocolate snickers = new Chocolate("PeanutFilled Chocolate",100.00,50,"Silverfoil",false);
		//Reflection API
		
		System.out.println(cadburyDairyMilk);
		System.out.println(fiveStar);
		System.out.println(snickers);
		
		boolean result = cadburyDairyMilk == fiveStar;
		System.out.println(result);
		
		result = cadburyDairyMilk == snickers;
		System.out.println(result);
		
		System.out.println(cadburyDairyMilk.hashCode());
		System.out.println(fiveStar.hashCode());
		System.out.println(snickers.hashCode());
		
		if(cadburyDairyMilk instanceof Chocolate && fiveStar instanceof Chocolate) {
			
			result = cadburyDairyMilk == snickers;
			System.out.println(result);
			
		}
		Chocolate chock = cadburyDairyMilk;
		//The reference of cadburyDairyMilk is assigned to Chock
		System.out.println("#check"+cadburyDairyMilk.hashCode());
		System.out.println("#check"+chock.hashCode());
		
		Chocolate chocolates[] = new Chocolate[3];
		chocolates[0] = cadburyDairyMilk;
		chocolates[1] = fiveStar;
		chocolates[2] = snickers;
		
		for(int i=0;i<chocolates.length;i++) {
			System.out.println("Chocolate@" +i+ " = " +chocolates[i]);
		}
		
			
	}

}
