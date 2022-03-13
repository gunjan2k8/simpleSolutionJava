package exceptionhandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Throws1 {
	
	public static void writeToAFile() throws IOException {
	    BufferedWriter bw = new BufferedWriter(new FileWriter("testfile.txt"));
	    bw.write("Test");
	    bw.close();
	}

		public static void main(String args[])
		{
			try {
				writeToAFile();
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		}
	}


