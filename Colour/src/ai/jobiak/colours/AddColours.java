package ai.jobiak.colours;

import java.util.*;
public class AddColours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String, Integer>balls=new HashMap<String,Integer>();

Random r= new Random();
balls.put("white", 0);
balls.put("red", 0);
balls.put("blue", 0);
balls.put("green", 0);
String colors[]= {"white", "red", "blue", "green"};
String bag[]=new String[1000];

for(int i=0;i<1000; i++) {
	bag[i]=colors[r.nextInt(4)];
	
}
for(int i =0; i<1000;i++) {
	balls.replace(bag[i], (balls.get(bag[i])+1));
}
System.out.println(balls);
	}
	

}
