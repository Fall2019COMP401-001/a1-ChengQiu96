package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		String[] fnames = new String [count];
		String[] lnames = new String [count];
		String[] fletter = new String [count];
		double[] totalp = new double [count];
		
		
		//first loop
		for (int i = 0; i< fnames.length; i++) {
			fnames [i] = scan.next();
			lnames [i] = scan.next();
			int count2 = scan.nextInt();
			//declare parameter
			String[] item = new String [count2];
			int[] quantity = new int [count2];
			double[] price = new double [count2];
			
			///second loop
			for (int i2 = 0; i2< item.length; i2++) {
				quantity [i2] = scan.nextInt();
				item [i2] = scan.next();
				price[i2] = scan.nextDouble();
				
									
			}
			double total = 0;
			/// loop to calculate total price for each person
			for (int i3 = 0;i3 < item.length;i3++) {
			   for(int j = 0; j < item.length;j++) {
			    if (i3==j){
				   total += quantity[i3]*price[j];
			    }
			   
			   }
			}
		totalp [i] = total; 
			
			
		}
		scan.close();
		for (int i =0; i < fnames.length;i++){
			 fletter[i] = Character.toString(fnames[i].charAt(0));
			 
		}
	
		for (int i =0; i< fnames.length;i++){
			System.out.println(fletter [i] +". "+ lnames [i] + ": " + String.format("%.2f", totalp[i]));
		
		}
	}
	
	
	
}
