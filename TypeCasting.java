public class TypeCasting{
	public static void main(String[] args) {
		
		//Widening
		double balance = 58585;
		System.out.printf("Your account balance is %c%f%n", '$', balance);
		
		//Narrowing
		char alpha = '?';
		
		int asciiCode = (char)alpha;
		
		System.out.printf("The asciiCode for ? is %d%n",asciiCode);
		
		double height = 5.8;
		int myHeight = (short)height;
		System.out.printf("My Faculty's height is %d%n", myHeight);
	
	}


}