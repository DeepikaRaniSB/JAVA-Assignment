public class Test {
	public static void main (String[] args) {
		
		int sum;
     if(args.length<3){
	System.out.println("not 3");
	return;
}
	//for(int i =0;i<args.length;i++){
	//System.out.println(args[i]);
	sum=Integer.parseInt(args[0])+Integer.parseInt(args[1])+Integer.parseInt(args[2]);
		System.out.println(sum);
	
}
}