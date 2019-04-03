import java.util.Scanner;

/**
 *
 * @author hp
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                String not="";
        
            do{   
	   System.out.println("hello");
                System.out.println("type 'y'/'n' to continue");
                Scanner to=new Scanner(System.in);
                  not=to.next();
                
            }while(not.equals("y"));
}
	
    }
    