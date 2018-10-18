import java.io.*;

public class Test{
	public static void main (String[] args){
	
		String fileName = "test.txt";
		String line = null;
			
		try {
			// Access to filesystem
			FileReader fileReader = new FileReader(fileName);
				
			// Buffer our reader
			BufferedReader bufferReader = new BufferedReader(fileReader);
				
			while ((line = bufferReader.readLine()) != null){
				System.out.println(line);
					
			}
			bufferReader.close();
			
		} 
		catch (FileNotFoundException ex){
			System.out.println("Unable to open file: " + fileName);
		}
		catch (IOException ex){
			System.out.println("Error reading file: " + fileName);
		}
	}

}