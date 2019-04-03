import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Reverse_no {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,rev=0,rem,var;
        String not="";
        do{
        System.out.println("enter the number");
        Scanner in=new Scanner(System.in);
        num=in.nextInt();
        var=num;
        while(num>0){
           rem=num%10;
           rev=rev*10+rem;
           num/=10;
        }
        System.out.println("the number"+rev);
        System.out.println("type 'y'/'n' to continue");
                Scanner to=new Scanner(System.in);
                  not=to.next();
                
            }while(not.equals("y"));
    }
    
}
