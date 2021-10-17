/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*import java.util.Scanner;
import java.io.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

*/
/**
 *
 * @author kenne
 */


/*public class main {
    public static void main(String[] args) {
        
        System.out.print("Enter the file name: ");
       
         // Scanner for user input
        Scanner user = new Scanner( System.in ); 
        String  inputFileName, outputFileName;

    // prepare the input file
        inputFileName = user.nextLine().trim();
        File input = new File( inputFileName );      
        try {Scanner scan = new Scanner( input ); }
        catch(IOException exception){
        System.out.println("here1");
    }
    System.out.println("here2");
    // prepare the output file 
        
        /*BufferedReader reader;
        
        try {
			reader = new BufferedReader(new FileReader("processes.txt"));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

    }
}
*/

import java.util.Scanner;
import java.io.*;

class main
{
  public static void main (String[] args) throws IOException
  { 
       

    // Scanner for user input
    
    String  inputFileName, outputFileName;

    // prepare the input file
    System.out.print("Input File Name: ");
    Scanner user = new Scanner( System.in ); 
    inputFileName = user.nextLine().trim();
    File input = new File( inputFileName );      
    Scanner scan = new Scanner( input );      

    // prepare the output file
    System.out.print("Output File Name: ");
    outputFileName = user.nextLine().trim();
    PrintWriter output = new PrintWriter( outputFileName );      

    // processing loop
    while( scan.hasNextInt() )    
    {
      num = scan.nextInt();
      square = num * num ;      
      output.println("The square of " + num + " is " + square);
    }

    // close the output file
    output.close();
  }
}
