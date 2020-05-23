import java.util.*;

public class Lab13 {

	public static void main(String[] args) {
		sales();
		System.out.println();
		
		int[] a1 = {11, 42, -5, 27, 0, 89}; 
		int[] a2 = {10, 20, 30, 40, 50, 60}; 
		
		swapAll(a1,a2);
	}

	public static void sales() {

		final int SALESPEOPLE = 5;

		Scanner scan2 = new Scanner(System.in);
		System.out.print("Enter the number of sales people: ");
		Integer salesnum = scan2.nextInt();

		Integer[] sales = new Integer[salesnum];
		int sum;

		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < sales.length; i++) {
			System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
			sales[i] = scan.nextInt();
		}

		System.out.println("\nSalesperson   Sales");
		System.out.println("--------------------");
		sum = 0;
		int maxy = Collections.max(Arrays.asList(sales));
		int miny = Collections.min(Arrays.asList(sales));

		int bs = 0;
		int ws = 0;
		for (int i = 0; i < sales.length; i++) {
			System.out.println("     " + (i + 1) + "         " + sales[i]);
			sum += sales[i];
			if (sales[i] == maxy) {
				bs = i;
			}
			if (sales[i] == miny) {
				ws = i;
			}
		}

		System.out.println("\nTotal sales: " + sum);
		System.out.println("\nAverage sales: " + (sum / sales.length));
		System.out.println("\nSales person " + (bs + 1) + " had the highest sale with " + maxy);
		System.out.println("\nSales person " + (ws + 1) + " had the highest sale with " + miny);

		Scanner scan1 = new Scanner(System.in);
		System.out.print("Enter a value: ");
		Integer enternum = scan1.nextInt();
		int counter = 0;
		int totalsalesabove = 0;

		for (int n : sales) {
			counter++;

			if (n > enternum) {
				System.out.println("\nSalesperson " + counter + " and their sales amount was: " + n);

				totalsalesabove++;

			}

		}
		System.out.println("\nThere was " + totalsalesabove + " id(s) above the numer entered.");

	}
	
	public static void swapAll(int[]a, int[]b) {
		
		
		
		for(int i = 0; i< b.length; i++) {
			int temp = a[i];
			
			a[i]= b[i];
			
			b[i] = temp;
		}
		
		
		System.out.println("Array a is now: "+Arrays.toString(a));
		System.out.println("Array b is now: "+Arrays.toString(b));


		
	}
}
