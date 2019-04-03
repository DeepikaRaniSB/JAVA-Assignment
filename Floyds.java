import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Floyds {

   	public static void main(String[]args){
            String not="";
            do{
		System.out.println("enter the no = ");
		Scanner in= new Scanner(System.in);
		int row= in.nextInt();
		
		int i,j,v=1;
		for(i=1;i<=row;i++)
		{
			for( j=1;j<=i;j++)
			{
             
			System.out.print(v+" ");
			v++;
		     }
		System.out.println();
	   }
                System.out.println("type 'y'/'n' to continue");
                Scanner to=new Scanner(System.in);
                  not=to.next();
                
            }while(not.equals("y"));
	}
}