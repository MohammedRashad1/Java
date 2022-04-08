package sample.questions.ibs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FileAppendPrintWriter {

	public static void main(String[] args) {
		
		
			try {
				FileWriter fw = new FileWriter("C:\\Users\\A-10563\\myFile2.txt",true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter pw = new PrintWriter(bw);
				pw.println(" ");
				pw.print("This line is appended");
				pw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

	}

}
