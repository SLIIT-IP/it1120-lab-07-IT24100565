import java.util.*;
public class IT24100565Lab7Q1B{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        
        double avg;
        String grade;


        for(int i=1;i<=3;i++){
            System.out.println("Student "+i);
            System.out.print("Enter Marks : ");
            int sub1=input.nextInt();
            int sub2=input.nextInt();
            int sub3=input.nextInt();
            int sub4=input.nextInt();
        
            avg=(sub1+sub2+sub3+sub4)/4;
            if(avg>=75){
                grade="Distinction";
            }else if (avg>=50){
             grade="Credit";
            }else{
                grade="Fail";
            }

            System.out.println("Average is : "+avg);
            System.out.println("Overall Grade is : "+grade+"\n");
        
        }
    }
}
