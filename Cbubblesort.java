import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Cbubblesort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
          int n, temp;
          String not="";
          do{
              
          Scanner inp = new Scanner(System.in);
        System.out.print("Enter no. of elements ");
        n = inp.nextInt();
        int num[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
        {
            num[i] = inp.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (num[i] > num[j]) 
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.print("After sorting= ");
        for (int i = 0; i < n ; i++) 
        {
          System.out.print(num[i]+",");
        }
        System.out.println("max=    "+num[n-1]+"   min =  "+num[0]); 
    
          System.out.println("type 'y'/'n' to continue");
                Scanner to=new Scanner(System.in);
                  not=to.next();
                
            }while(not.equals("y"));
    } 
}