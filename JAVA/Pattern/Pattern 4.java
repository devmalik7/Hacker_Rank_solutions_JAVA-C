
8 7 6 5 4 3 2 1
8 7 6 5 4 3 2 
8 7 6 5 4 3 
8 7 6 5 4
8 7 6 5
8 7 6
8 7
8
 
 
import java.util.Scanner;
 
public class MainClass
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        for (int i = 1; i <= rows; i++) 
        { 
            for (int j = rows; j >= i; j--)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
         
        //Closing the resources
         
        sc.close();
    }
}

