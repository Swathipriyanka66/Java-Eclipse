/*Take an array of size 100 and store numbers from 1 to 100:
1) print every 4th element
2) print the numbers which are divisble by 8*/



public class Array {
     
	public static void main(String[] args) {
		
		int Array[] = new int[100];
		
		
		
		for(int i=0;i<=100;i+=4) {
			
			i=i+4;
			System.out.println(i);
			}
		for(int i=1;i<=100;i++) {
			if(i%8==0) {
				System.out.println(i);
			}
		
		}
	}}
