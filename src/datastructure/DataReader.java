package datastructure;

import databases.ConnectToSqlDB;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		String textFile = System.getProperty("user.dir") + "C:/Users/fazli/MidtermJanuary2019/src/data/self-driving-car";

		FileReader fr = null;
		BufferedReader br = null;

		//ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		//connectToSqlDB.createTableFromStringToMySql("tbl_selfDrivingCar","data_values" );

		try {
			fr = new FileReader(textFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("We could not find the file..");
		}
		String data;
		br = new BufferedReader(fr);
		Stack newStack = new Stack();  // Create Stack
		LinkedList<String> newLinkedList = new LinkedList<>();
		try {
			while ((data = br.readLine()) != null) {
				System.out.println(data);
				String[] str1 = data.split(" ");
				for (int i = 0; i < str1.length; i++) {
					//Demonstrated push() method for Stack
					newStack.push(str1[i]);
					newLinkedList.add(str1[i]);
				}
				//connectToSqlDB.insertDataFromStringToSqlTable(data, "tbl_selfDrivingCar", "data_values");
			}
		} catch (IOException ioe1) {
			ioe1.printStackTrace();
			System.out.println("We could not read the file..");
		} finally {
			if (fr != null) {
				fr = null;
			}
			if (br != null) {
				br = null;
			}
		}
	}
}



