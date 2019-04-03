import java.util.Scanner;
/**
 *
 * @author hp
 */
public class ForGreater {

     /* @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,n=0;
System.out.println("find sum of numbers divisible by 7 between 100 and 200: ");
    for( i=100;i<200;i++){
        if(i%7==0){
           n=n+i; 
        }
    }
    System.out.println("Sum= "+n);
    
    }
    
}