package myfirstproject;
import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args)  {
		try {
		File f=new File("myfile.txt");
		//FileWritter fw=new FileWritter("myfile.txt");
		if(f.createNewFile())
			System.out.println("File Created!");
		else {
			System.out.println("File not created!");
		}
		}
		catch(IOException e){
			System.out.println("Error Occured!!");
		}
		try {
			FileWriter w1 = new FileWriter("myfile.txt");
			w1.write("Siva 7639331179"+"\n"+"Rahul 34567948659");
			w1.close();
		} catch (IOException e) {
			System.out.println("An error occured!!");
			e.printStackTrace();
		}
		 try {
			 File f=new File("myfile.txt");
			Scanner s = new Scanner(f);
		      while (s.hasNextLine()) {
		        String data = s.nextLine();
		        String num[]=data.split(" ");
		       // s.close();
		        if(Pattern.matches("[6-9]{1}[0-9]{9}",num[1])) {
	
		        	try {
		        		File f1=new File(num[0]+".txt");
						if(f1.createNewFile()) {
							System.out.println("File created!");
							try{
							Calendar c=Calendar.getInstance();
							//String s1=c.getTime();
							FileWriter w2=new FileWriter(num[0]+".txt");
							 w2.write(c.getTime().toString());
							 w2.close();
							}catch (IOException e) {
								System.out.println("An error occured!!");
								e.printStackTrace();
							}
							
						}
						else
							System.out.println("File not created!");
					} catch (IOException e) {
						System.out.println("Error!!");
						e.printStackTrace();
					}
		        }
		       }
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

		
		
	}

}
