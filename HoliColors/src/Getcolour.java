
import java.util.Random;
class Colors{
public static void main(String args[]){
Random random = new Random();
//java.util.Scanner sc = new java.util.Scanner(System.in);
int Red = random.nextInt(255); 
int Green = random.nextInt(255); 
int Blue= random.nextInt(255);
if((Red==255)&&(Green==0)&&(Blue==0)){
System.out.println("The Color is Red");
}
else if((Red==255)&&(Green==255)&&(Blue==0)){
System.out.println("The Color is Yellow");
}
else if((Red==128)&&(Green==0)&&(Blue==0)){
System.out.println("The Color is  Lime");
}
else if((Red==0)&&(Green==255)&&(Blue==0)){
System.out.println("The Color is Green");
}
else if((Red==0)&&(Green==0)&&(Blue==255)){
System.out.println("The Color is blue");
}
else if((Red==0)&&(Green==0)&&(Blue==0)){
System.out.println("The Color is black");
}
else if((Red==255)&&(Green==255)&&(Blue==255)){
System.out.println("The Color is white");
}
else if((Red==128)&&(Green==255)&&(Blue==128)){
System.out.println("The Color is mint");
}
else if((Red==255)&&(Green==255)&&(Blue==128)){
System.out.println("The Color is Banana");
}
else if((Red==64)&&( Green==128)&&(Blue==128)){
System.out.println("The Color is Steel");
}
else if((Red==64)&&(Green==0)&&(Blue==64)){
System.out.println("The Color is Egg plant");
}
else if((Red==128)&&(Green==128)&&(Blue==64)){
System.out.println("The Color is Moss");
}
else if((Red==0)&&(green==255)&&(blue==128)){
System.out.println("The Color is Emerald");
}
else if((Red==128)&&(Green==64)&&(Blue==0)){
System.out.println("The Color is Caramel");
}
else if((Red==0)&&(Green==0)&&(Blue==160)){
System.out.println("The Color is Egyptian");
}
else if((Red==192)&&(Green==192)&&(Blue==192)){
System.out.println("The Color is Gray");
}
else if((Red==255)&&(Green==128)&&(Blue==255)){
System.out.println("The Color is Helio");
}
else if((Red==128)&&(Green==64)&&(Blue==0)){
System.out.println("The Color is Brown");
}
else if((Red==0)&&(Green==64)&&(Blue==128)){
System.out.println("The Color is Saphire");
}
else if((Red==255)&&(Green==0)&&(Blue==255)){
System.out.println("The Color is Floral");
}
else if((Red==255)&&(Green==128)&&(Blue==0)){
System.out.println("The Color is Orange");
}
else if((Red==255)&&(Green==0)&&(Blue==128)){
System.out.println("The Color is Pink");
}else {
System.out.println("The Color is not there in the above");
}
}
}
