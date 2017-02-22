import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Merge {
 
	public static void main(String[] args) {
		String File1Path = "C:\\Users\\karth\\Desktop\\f1.txt";
		String File2Path = "C:\\Users\\karth\\Desktop\\f2.txt";
 		String mergedFilePath = "C:\\Users\\karth\\Desktop\\m.txt";
 
		File[] files = new File[2];
		files[0] = new File(File1Path);
		files[1] = new File(File2Path);
 		File mergedFile = new File(mergedFilePath);
 		mergeFiles(files, mergedFile);
	}
 
	public static void mergeFiles(File[] files, File mergedFile) {
 
		FileWriter fstream = null;
		BufferedWriter out = null;
		try {
			fstream = new FileWriter(mergedFile, true);
			out = new BufferedWriter(fstream);
			}catch (IOException e) {
			e.printStackTrace();
			}
 
		for (File f : files) {
			//System.out.println("Merging: " + f.getName());
			FileInputStream fis;
			try {
				fis = new FileInputStream(f);
				BufferedReader in = new BufferedReader(new InputStreamReader(fis));
				String aLine;
				while ((aLine = in.readLine()) != null) {
					out.write(aLine);
					//out.newLine();
				}
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Merging Done");
 
		try {
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
 
	}
}