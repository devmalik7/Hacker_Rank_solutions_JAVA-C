

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
16 17 18 19 20 21


import java.util.Scanner;
  
public class MainClass 
{    
    public static void main(String[] args) 
    {
        System.out.println("How many rows you want in this pattern?");
         
        Scanner sc = new Scanner(System.in);
         
        int noOfRows = sc.nextInt();
         
        int value = 1;
         
        System.out.println("Here is your pattern :");
         
        for (int i = 1; i <= noOfRows; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(value+"\t");
                 
                value++;
            }
             
            System.out.println();
        }
    }    
}
