package a1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int count = scan.nextInt();
		double[] price = new double [count];
		String[] item = new String [count];
	
		ArrayList<Integer> globalquantity = new ArrayList<Integer>();
		ArrayList<String> globalcart = new ArrayList<String>();
		ArrayList<String> globalname = new ArrayList<String>();
		
		//loop for items
		for (int i = 0; i< item.length; i++) {
			item [i] = scan.next();
			price[i] = scan.nextDouble();
	
		}
		
		// declare variable customer loop
		int count2 = scan.nextInt();
		String[] fnames = new String [count2];
		String[] lnames = new String [count2];
		
		// loop for customers
		for (int i = 0; i < fnames.length; i++) {
			fnames [i] = scan.next();
			lnames [i] = scan.next();
			int count3 = scan.nextInt();
			
			
			int[] quantity = new int [count3];
			//inner loop to each customers cart
			for (int j = 0; j< quantity.length; j++) {				
				globalquantity.add(scan.nextInt());
				globalcart.add(scan.next());
				globalname.add(fnames [i]);
				
			}
				
		}
		
		int[] itemquantity = new int [count];
		int[] customerquantity = new int [count];
		
		for (int i = 0; i < item.length; i++) {
			int itemtotal =0;
			int customertotal =0;
			for (int j =0; j<globalquantity.size(); j++) {
				if (item [i].equals(globalcart.get(j))) {
					itemtotal += globalquantity.get(j);
					
					
					if (valuecheck(globalcart,globalname,j)==true)
						
						customertotal +=1;
						
					
			
			}
				itemquantity [i]= itemtotal;
				customerquantity [i]= customertotal;
			}
			
			}
		
	
		
		for (int i =0; i< count;i++) {
			if(customerquantity[i]==0) {
				System.out.println("No customers bought "+ item[i]);
			} else
				System.out.println(customerquantity[i]+" customers bought "+ itemquantity [i]+ " "+ item[i]);
			
		}
		}
	
	public static boolean valuecheck(ArrayList<String> arr, ArrayList<String> name,int index) {
		boolean variable=true;
		for(int i=0; i< index; i++){		
				if (  arr.get(i).equals(arr.get(index))&& i!=index &&  name.get(index).equals(name.get(i)) ) {
					variable = false;	
				}
		 }
		return variable;
	}


}

