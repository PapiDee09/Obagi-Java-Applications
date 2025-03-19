public class PrintMethod{
	public static void main(String[] args){
		//using the print()
		System.out.print("\"Learning Java is fun\"\n");
		System.out.print(" Hey,come and learn Java with me");
		
		
		//using the print.ln()
		System.out.println();
		System.out.println("I want to tell you that Java is different from JavaScript");
		
		System.out.println("\t this is an idented text");
		
		
		//using the print f
		System.out.printf("My name is %s and I love %s. Good day everyone %n","Donald", "Java");
		System.out.printf("I am %d years old%n",25);
		System.out.printf("I bought Java JDK with %f naira%n",159.345);
		System.out.printf("I bought Java JDK with %.2f naira%n",159.345);
		System.out.printf("I bought Java JDK with %c%.2f naira%n",'$',159.345);
		
		boolean isJavaFun = true;
		System.out.printf("is Java fun? %b%n",isJavaFun);
	}
}