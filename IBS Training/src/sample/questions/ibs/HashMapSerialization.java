package sample.questions.ibs;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;


public class HashMapSerialization {

	public static void main(String[] args) {
		
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("A","HP");
		hm.put("B", "Dell");
		hm.put("D", "Lenova");
		hm.put("C", "Asus");
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try{
			fos = new FileOutputStream("C:\\Users\\A-10563\\hashmap.ser");
			
			oos = new ObjectOutputStream(fos);
			oos.writeObject(hm);
		}
		catch (IOException e) {
            e.printStackTrace();
		}
		finally{
			if(fos!=null){
				try {
					fos.close();
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		}

	}

}
