package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int count = scan.nextInt();
		double[] price = new double [count];
		String[] item = new String [count];
		
		
		
		//loop for items
		for (int i = 0; i< item.length; i++) {
			item [i] = scan.next();
			price[i] = scan.nextDouble();
	
		}
		
		// declare variable customer loop
		int count2 = scan.nextInt();
		double[] totalp = new double [count2];
		String[] fnames = new String [count2];
		String[] lnames = new String [count2];
		
		// loop for customers
		for (int i = 0; i < fnames.length; i++) {
			fnames [i] = scan.next();
			lnames [i] = scan.next();
			int count3 = scan.nextInt();
			
			String[] cart = new String [count3];
			int[] quantity = new int [count3];
			//inner loop to each customers cart
			for (int j = 0; j< quantity.length; j++) {
				quantity [j] = scan.nextInt();
				cart [j] = scan.next();
			
				
			}
			double total = 0;
			// loop calculate total per customer 
			
			for (int i2 = 0; i2 < quantity.length;i2++) {
				   for(int k = 0; k < item.length;k++) {
				    if ( cart [i2].equals(item [k])){ // why does this not work?
					   total += quantity[i2];
				    }
				   
				   }
				}
			totalp [i] = total; 
			
			
		
		}
		
		for (int i = 0; i < item.length; i++) {
			for (int j =0; j<fnames.length; j++) {
			
			//can't access quantity
			
			
			}
			
			
			
			}
		}
	}

