
public class TestArray {

	public static void main(String[] args) {
		int scores[]=new int[10];//size is must
		//java.util.Scanner scanner=new java.util.Scanner(Syatem.in);
		for(int i=0;i<scores.length;i++){
			System.out.println("Enter score: "+(i+1));
		//int score=scanner.nextInt();
			scores[i]=(int)(Math.round(Math.random())*100);
		}
		  System.out.println("-------the elements are------");
		 for(int i=0;i<scores.length;i++){
			//total=total+scores[i];
			System.out.println(scores[i]);
		}
		//total,min,max and avg
		System.out.println("-------the stats are------");
			int total=0;
		for(int i=0;i<scores.length;i++){

			total=total+scores[i];
		}
		System.out.println(total);
			int avg=0;
			avg=total/scores.length;
		System.out.println(avg);

		//System.out.println(The score @ ["+i+"]=+scores[i]);
		}

	}


