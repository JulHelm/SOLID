package solid;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Persistence {
	
	public void saveToFile(ArrayList<String> list, File filename) {
		PrintWriter pw;
		try {
			pw = new PrintWriter(new FileWriter(filename));
			for(Object o : list) {
				pw.println(o);
			}
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
