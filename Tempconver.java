import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Tempconver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String not="";
                do{
		System.out.println("enter the temperature= ");
		Scanner in= new Scanner(System.in);
		float tem= in.nextFloat();
		double c;
		c=(tem-32)/1.8;
		System.out.println("after conversion = "+c);
		 System.out.println("type 'y'/'n' to continue");
                Scanner to=new Scanner(System.in);
                  not=to.next();
                
            }while(not.equals("y"));
        // TODO code application logic here
    }
    
}
