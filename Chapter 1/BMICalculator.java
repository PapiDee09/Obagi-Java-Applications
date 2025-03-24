import java.util.Scanner;


public class BMICalculator{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("=== Body Mass Index (BMI) Calculator ===");
	System.out.println("Let's calculate your BMI.\n");
	
	System.out.println("Which units would you like to use?");
	System.out.println("1. Metric (kg and meters)");
	System.out.println("2. Imperial (Pounds and Inches)");
	System.out.print("Enter 1 or 2: ");
	int unitChoice = scanner.nextInt();
	
	double weight, height, bmi;
	
	if(unitChoice == 1){
		System.out.print("Enter your weight in kg: ");
		weight = scanner.nextDouble();
		System.out.print("Enter your height in meters (e.g.,1.78): ");
		height = scanner.nextDouble();
		bmi = calculateBMIMetric(weight,height);
	}
	else if (unitChoice == 2){
		System.out.print("Enter your weight in pounds: ");
		weight = scanner.nextDouble();
		System.out.print("Enter your height in inches(e.g., 70 for 5'10\"): ");
		height = scanner.nextDouble();
		bmi = calculateBMIImperial(weight,height);
	}
	else{
		System.out.println("Invalid choice.Exiting.");
		
		
		scanner.close();
		return;
	}
	System.out.printf("\nYour BMI is: %.1f%n", bmi);
	System.out.println("Category: "+ getBMICategory(bmi));
	
	scanner.close();
	}
	
	public static double
	calculateBMIMetric(double weight, double height) {
		return weight / (height * height);
	}
	
	public static double
	calculateBMIImperial(double weight, double height){
		return (weight * 703) / (height * height);
	}
	
	public static String
	getBMICategory(double bmi) {
		if (bmi < 18.5) {
			return "Underweight";
		}
		else if (bmi < 25) {
			return "Normal Weight";
		}
		else if (bmi < 30) {
			return "Overweight";
		}
		else {
			return "Obese";
		}
	}
	
}
		
		
		
	
	
	