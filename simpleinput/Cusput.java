import java.io.*;

class CusPut {
	public static void main( String[] args) {
	// int n1 = Integer.parseInt(args[0]);
	// System.out.println(n1);
		InputStreamReader isr = new InputStreamReader( System.in);
		BufferedReader br = new BufferedReader(isr);
	try{
		System.out.println("Enter your number");
		String n0 = br.readLine();
		int n1 = Integer.parseInt(n0);
		System.out.println("You typed " + n1);
}
	catch(Exception ex){
		System.out.println("You need to type a number!");
		// ex.printStackTrace();
	}
	}
}