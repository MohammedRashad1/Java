package sample.questions.ibs;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashmapDeserialization {

	public static void main(String[] args) {
		HashMap<String,String> newHaspMap=null;
		
			FileInputStream fis=null;
			ObjectInputStream ois = null;
			try {
				fis = new FileInputStream("C:\\Users\\A-10563\\hashmap.ser");
				ois = new ObjectInputStream(fis);
				newHaspMap=(HashMap<String, String>) ois.readObject();
				fis.close();
				ois.close();
				
			} catch (FileNotFoundException e) {
				e.getMessage();
			} catch (IOException e) {
				System.out.println("IO Exception");
			} catch (ClassNotFoundException e) {
				System.out.println("Class not Found");
			}
			
			Set keys = newHaspMap.keySet();
			Iterator it = keys.iterator();
			while(it.hasNext()){
				String key = (String) it.next();
				System.out.println(key+":"+newHaspMap.get(key));
			}
			
			
		

	}

}
