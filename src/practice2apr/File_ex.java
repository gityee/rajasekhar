package practice2apr;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.testng.annotations.Test;

public class File_ex 
{
@Test
	public static void excel() throws IOException
	{
	
	File f = new File("C:\\Users\\s8\\Desktop\\raj","abc.txt");
	FileWriter fw  = new FileWriter(f); 
	//fw.write("hello");
	//fw.flush();
	//fw.close();
	
	BufferedWriter	bw = new BufferedWriter(fw);
	bw.write("test 123");
	bw.flush();
	bw.close();
	
	PrintWriter pw = new PrintWriter(f);
	pw.write("rajasekhar");
	pw.flush();
	pw.close();
	
	}
	
	
}
