package sample.questions.ibs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileAppend {

	public static void main(String[] args) {
		
		FileWriter fw = null;
		
		try {
			String content = "This is my content which would be appended";
			
			fw = new FileWriter("C:\\Users\\A-10563\\myFile.txt",true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			
				try {
					if(fw!=null)
						fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}

	}

}
