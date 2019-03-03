package math.problems;


import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int maxnum = 1000000;
		int[] array = new int[maxnum];
		System.out.println("List of the prime number between 1 - " + maxnum);

		for (int num = 2; num <= maxnum; num++) {
			boolean isPrime = true;
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime == true)
				System.out.println(num);
			ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
			List<String> lowestValue = new ArrayList<String>();
			try {
				connectToSqlDB.insertDataFromArrayToSqlTable(array, "tbl_primeNumber", "column_primeNumber");
				lowestValue = connectToSqlDB.readDataBase("tbl_primenumber", "column_primeNumber");

			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
			for (String st : lowestValue) {
				System.out.println(st);
			}
		}
	}
}



