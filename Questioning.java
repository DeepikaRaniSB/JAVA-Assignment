import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Questioning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Largest ocean?");
        int i =0;
        String ans="pacific";
        String answer="";
        //Scanner input= new Scanner(System.in);
        //answer=input.next();
        
        do{   
             Scanner input= new Scanner(System.in);
            answer=input.next();
              if(answer.equals(ans)){
              System.out.println("good");
              break;
              }
            i++;
         }while(i<3);
         
      System.out.println("correct answer  "+ans);
            
                                 
                        
              
        // TODO code application logic here
    }
    
}
