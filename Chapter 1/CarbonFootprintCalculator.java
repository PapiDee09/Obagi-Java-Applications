import java.util.Scanner;


public class CarbonFootprintCalculator{
	private static final double
		Emission_Factor_Gasoline = 0.404;
	private static final double
		Emission_Factor_Electricity = 0.42;
	private static final double
		Emission_Factor_Beef = 27.0;
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("===Carbon Footprint Calculator");
	
		System.out.println("Let's calculate your annual carbon footprint based on driving, electricity, and diet%n");
	
		System.out.print("How many miles do you drive per year?");
		double milesDriven =
		scanner.nextDouble();
		double drivingEmissions =
		calculateDrivingEmission(milesDriven);
		
		System.out.print("How many kW/h of electricity do you use per month?");
			double monthlyElectricity =
			scanner.nextDouble();
			double electricityEmissions =
			calculateElectricityEmissions(monthlyElectricity);
			
		System.out.print("How many kg of beef do you eat per year?");
		double beefConsumption =
		scanner.nextDouble();
		double dietEmissions =
		calculateDietEmissions(beefConsumption);
		
		double totalEmissions = drivingEmissions + electricityEmissions + dietEmissions;
		double totalTonsC02 = totalEmissions / 1000;
		
		System.out.println("\n=== Your Carbon Footprint ===");
		System.out.printf("Driving: %.2f kg C02%n",drivingEmissions);
		System.out.printf("Electricity: %.2f kW/h C02%n",electricityEmissions);
		System.out.printf("Diet(Beef): %.2f kg C02%n",dietEmissions);
		System.out.printf("Total Carbon Footprint: %.2f metric tons C02e per year%n",totalTonsC02);
		
		if (totalTonsC02 > 20){
			System.out.println("Your carbon footprint is above the global average(around 4-6 tons per person).Consider reducing your emissions!");
		}
		else if (totalTonsC02 > 6){
			System.out.println("Your carbon footprint is moderate. There's room for improvement!%n");
		}
		else{
			System.out.println("Your carbon footprint is low. Great job!%n");
		}
		scanner.close();
	}
		public static double
		calculateDrivingEmission(double milesDriven) {
		return milesDriven * Emission_Factor_Gasoline;
		}
	
		public static double
		calculateElectricityEmissions(double monthlyElectricity){
		double annualElectricity = monthlyElectricity * 12;
		return annualElectricity * Emission_Factor_Electricity;
		}
	
		public static double
		calculateDietEmissions(double beefConsumption) {
		return beefConsumption * Emission_Factor_Beef;
		}
			
			
			
	}
