import java.io.*; 
import java.util.Scanner;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;


class Input{
Scanner scan = new Scanner(System.in);
int getChoice()
{
 System.out.format("Enter 1->Standard, 2->Above Standard, 3->Higly Standard, 4->Higly Standard and Automated");
 int ch=scan.nextInt();
 return ch;
}
double getArea()
{
System.out.format("Enter the area in square feet:");
 double area=scan.nextFloat();
 return area;
}
 }

class ConstructionCost extends Input{
int ch=getChoice();
double area=getArea();
void calculateCost()
{
  if(ch==1)
     System.out.format("Cost:%f INR",area*1200);
  else if(ch==2)
     System.out.format("Cost:%f INR",area*1500);
  else if(ch==3)
     System.out.format("Cost:%f INR",area*1800);
  else if(ch==4)
     System.out.format("Cost:%f INR",area*2500);
  else 
     System.out.format("Enter correct choice.");
}

}

class Logger2{
final Logger logger = Logger.getLogger(Logger2.class);
public static void main(String args[])
{
 logger.info("Here is your construction cost:");
ConstructionCost obj=new ConstructionCost();
obj.calculateCost();
}

}