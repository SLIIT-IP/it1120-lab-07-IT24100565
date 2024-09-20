
import java.util.*;
public class IT24100565Lab7Q3{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        double discount=0;
        double amount=0;

        for(int i=1;i<=5;i++){
            System.out.println("Customer "+i);

            System.out.print("Enter total bill amount:  ");
            double tot=input.nextDouble();

            System.out.print("Enter mode of payment( C for cash, O for other):  ");
            char mode=input.next().charAt(0);

            if(mode=='c' || mode=='C'){
                discount=tot*(5.0/100);
                System.out.println("Discount is :  "+discount);
                amount=tot-discount;
                System.out.println("Amount to be paid : "+amount);
            }else if(mode=='o' || mode=='O'){
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid : "+tot);
            }else{
                System.out.println("Payment Mode is Not Valid");
            }
            System.out.println();
        }
    }
}
