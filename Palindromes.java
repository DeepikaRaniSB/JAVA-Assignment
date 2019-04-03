import java.util.Scanner;
public class Palindromes{
	public static void main(String[]args){
            String not="";
		do{
                    System.out.println("enter the word = ");
               
		Scanner d= new Scanner(System.in);
		String word= d.next();
		
                String b="";
            for(int i=word.length()-1;i>=0;i--)
            {
                 b=b+word.charAt(i);
            }
        if(word.equals(b))
         {
         System.out.println(" it is a palindrome");	
         }
         else
         {
         System.out.println("not a palindrome");
         }
        System.out.println("type 'y'/'n' to continue");
                Scanner to=new Scanner(System.in);
                  not=to.next();
                
            }while(not.equals("y"));
        }
        
    
}