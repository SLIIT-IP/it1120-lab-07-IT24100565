import java.util.*;
public class IT24100565Lab7Q1A{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        double tot=0;
        double avg;

        System.out.println("Enter Marks for 4 subject: ");

        System.out.print("Enter Subject Mark 1: ");
        int mark1=input.nextInt();
        tot+=mark1;

        System.out.print("Enter Subject Mark 2: ");
        int mark2=input.nextInt();
        tot+=mark2;

        System.out.print("Enter Subject Mark 3: ");
        int mark3=input.nextInt();
        tot+=mark3;

        System.out.print("Enter Subject Mark 4: ");
        int mark4=input.nextInt();
        tot+=+mark4;

        avg=tot/4;
        String grade;

        if(avg>=75){
            grade="Distinction";
        }else if (avg>=50){
            grade="Credit";
        }else{
            grade="Fail";
        }

        System.out.println("Average is : "+avg);
        System.out.println("Overall Grade is : "+grade);
    }
}
