package filehandling;
import java.io.*;

public class Filepro {
	public static void createFileUsingFileClass() throws IOException
	{
		
		File file= new File("C:\\files\\file.txt");
		
		if(file.createNewFile()) {
			System.out.println("File is created");
		}
		else {
			System.out.println("File  is already exist");
		}
		
		
		FileWriter  writer= new  FileWriter(file,false);
		
		writer.write("Hello");
		writer.close();
		
		
	}
	public static void readFileReaderClass() throws IOException
	{ 
		FileReader reader= new FileReader("C:\\files\\File.txt");
		
		int data;
		
		while((data=reader.read())!=-1){
			
			System.out.print((char)data);
		}
	}
	public static void AppendToFile() throws IOException
	{
		 
         
         FileWriter fileWritter = new FileWriter("C:\\files\\File.txt",true);
         fileWritter.write("\nEveryone");
         fileWritter.close();
         System.out.println("\nAppend done");
	}
	public static void main(String[] args) {
		try {
			 createFileUsingFileClass();
			 readFileReaderClass();
			 AppendToFile();
			 } catch (IOException e) {
			 e.printStackTrace();
		}
	}
}




