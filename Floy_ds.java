import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Floy_ds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String not="";
        do{
        System.out.println("enter the no = ");

		Scanner in= new Scanner(System.in);
		int row= in.nextInt();
		
		int i,j;
		for(i=1;i<=row;i++)
		{
			for( j=1;j<=i;j++)
			{
             if((i+j)%2==0)
             {
			System.out.print("1");
		}
		else{
		System.out.print("0");	
		}
						//v++;
		     }
		System.out.println();
                }
                  System.out.println("type 'y'/'n' to continue");
                Scanner to=new Scanner(System.in);
                  not=to.next();
            }while(not.equals("y"));
            
    }
    
}