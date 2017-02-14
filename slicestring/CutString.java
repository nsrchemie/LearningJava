public class CutString {

	public static void main(String[] args) {
	System.out.println("Practicing slicing strings");
	String name = "Actaea Racemosa";
	System.out.println("The scientific binomial name for White Baneberry is: " + name);
	String genus = name.substring(0,name.indexOf( " " ));
	String species = name.substring(name.indexOf( " " )).trim();
	System.out.println("The genus is " + genus + " and the species is " + species);
}
}