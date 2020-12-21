package Asgm1;

import java.util.Scanner;

public class Asgm1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		double laptopprice = 0.00;
		double serviceprice = 0.00;
		double totalprice = 0.00;
		
		System.out.println("Brand of Laptop We Sell: 1.hp 2.ASUS 3.Acer 4.Lenovo");
		System.out.println("Services of Laptop We Provide: 1.Buy Laptop 2.Screen Repair 3.System Repair");
		
		System.out.println();
		System.out.print("Enter Your Name: ");
		String custName = in.next();
		System.out.print("Enter Your Phone No.: ");
		String custPhone = in.next();
		System.out.print("Enter Your IC No.: ");
		String custIC = in.next();
		
		System.out.println();
		System.out.print("Which Brand of Laptop You Want to Buy: ");
		int custLaptop = in.nextInt();	
		System.out.print("Quantity You Want To Buy: ");
		int quantity = in.nextInt();
		
		if (custLaptop == 1) {
			laptopprice = 3600.00 * quantity;
		}
			
		else if (custLaptop == 2) {
			laptopprice = 5600.00 * quantity;
		}
		
		else if (custLaptop == 3) {
			laptopprice = 4500.00 * quantity;
		}
		
		else if (custLaptop == 4) {
			laptopprice = 2800.00 * quantity;
		}
		
		else if (custLaptop >=5) {
			System.out.print("Invalid");
		}
		
		System.out.println();
		System.out.print("Which Service You Want: ");
		int custService = in.nextInt();
		System.out.print("Service Hours Needed: ");
		int hour = in.nextInt();
		
		if (custService == 1) {
			serviceprice = 50.00 * hour;
		}
		
		else if (custService == 2) {
			serviceprice = 300.00 * hour;
		}
		
		else if (custService == 3) {
			serviceprice = 200.00 * hour;
		}
		
		else if (custService >=3) {
			System.out.print("Invalid");
		}
		
		totalprice = laptopprice  + serviceprice;
		
		System.out.println();
		System.out.println("Customer Name: " + custName);
		System.out.println("Customer Phone No.: " + custPhone);
		System.out.println("Customer IC No.: " + custIC);
		System.out.println("Price Need To Be Paid by Customer: RM" + totalprice);
	
	}

}
