import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Asorting {
    public static void main(String[] args) {
        String not="";
       do{
           System.out.println("enter the word");
       
        Scanner n= new Scanner(System.in);
        String word= n.next();
        Asorting.after(word);
       // System.out.println("the word =  "+after(word));
        System.out.println("type 'y'/'n' to continue");
        Scanner to=new Scanner(System.in);
          not=to.next();
          
        }while(not.equals("y"));  
    }
    public static void after(String word){
        int i;
        char temp;
       char[] v=word.toCharArray();
               for(i=0;i<word.length();i++){
            for(int j=0;j<word.length()-1;j++){
                        
            if(v[j]>v[j+1]){
                temp=v[j+1];
                v[j+1]=v[j];
                v[j]=temp;                                                              
            }            
            } 
         }  
       String Alpha= new String(v);
        System.out.println(Alpha);
        
            
        }  
    
    }
    