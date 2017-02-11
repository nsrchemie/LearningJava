class BasicsDemo {
  // Adapted from http://www.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html
  static void print() {
    System.out.println("\n\nInside print ...");
    System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
    System.out.println();                 // Print empty line
    System.out.print("Hello, world!!");   // Cursor stayed after the printed string
    System.out.println("Hello,");
    System.out.print(" ");                // Print a space
    System.out.print("world!!");
  }
  
  static void primitive() {
    System.out.println("\n\nInside Primitive");
    int intHex = 0x0041;
    System.out.println("IntHex: " + intHex);
    int intBinary = 0b1000001;
    System.out.println("IntBinary: " + intBinary);
    int intUnder = 6_5;
    System.out.println("intUnder: " + intUnder);
    int intChar = 'A';
    System.out.println("intChar: " + intChar);
    char charInt = 65;
    System.out.println("charInt: " + charInt);
    char charUnicode = '\u0041';
    System.out.println("charUnicode: " + charUnicode);
    char charHex = 0x41;
    System.out.println("charHex: " + charHex);
    char charBinary = 0b1000001;
    System.out.println("charBinary: " + charBinary);


  }

  public static void main(String[] args) {	
	   	// Language Basics 1
		primitive();				
  }       
}