import java.util.*;
public class IT24100565Lab7Q2B{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);

        for(int i=1;i<=5;i++){
            System.out.print(i+" - ");
           for(int j=1;j<=i;j++){  
            System.out.print("*");
           }       
           System.out.println();    
        }
    }
}
