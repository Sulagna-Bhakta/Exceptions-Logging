import java.io.*; 
import java.util.Scanner;
import org.apache.log4j.Logger;
import org.apache.log4j.LogManager;

class Interest {
void getSimpleInterest(double principal, double time, double rate )
{
  double simpleInterest = principal*time*rate/100;
  System.out.format(" Simple Interest is: %f",simpleInterest);

}
void getCompoundInterest(double principal, double time, double rate)
{
double compoundInterest = principal * (Math.pow((1 + rate / 100), time));
  System.out.format(" Compound Interest is: %f",compoundInterest);
}
}


class Logger1
{
final Logger logger = Logger.getLogger(Logger1.class);
 public static void main(String args[]) 
   {
     double principal, time, rate;
   Interest i = new Interest();     
Scanner scan = new Scanner(System.in);
    logger.info("Enter Principal, time, rate of interest:");

        principal = scan.nextFloat();
        
        time = scan.nextFloat();

        rate = scan.nextFloat();
    
               scan.close();
       i.getSimpleInterest(principal,time,rate);
       i.getCompoundInterest(principal,time,rate);
       
           
   }

}