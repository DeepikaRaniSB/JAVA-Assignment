import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Vowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String not="";
        do{
        System.out.println("enter the string = ");
		Scanner n= new Scanner(System.in);
		String word= n.next();
		System.out.println("total number of vowels = "+countv(word));
		System.out.println("type 'y'/'n' to continue");
                Scanner to=new Scanner(System.in);
                  not=to.next();
                
            }while(not.equals("y"));

	

	}
	public static int countv(String word)
	{
		int count=0;
		for(int i=0;i<word.length()-1;i++)
		{
			if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u' ){
				count+=1;
			}
                }
       
    
    return count;
}
}