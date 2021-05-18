/*
 * Exercise 5: Write a Java program that displays the number of characters, lines and words in a text? 
 */
package lab3;
import java.io.*;
public class CountStringValues {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("D:\\capegemini\\JAVA_JA17\\LabBookModule1\\src\\file\\file.txt");
		FileInputStream filestream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(filestream);
        BufferedReader reader = new BufferedReader(input);
        String line;
        int countWord = 0;
        int sentenceCount = 0;
        int characterCount = 0;
        
        while((line = reader.readLine()) != null)
        {
        	if(!line.equals(""))
        	{
        		 characterCount += line.length();
        		 String[] wordList = line.split("\\s+");
                 countWord += wordList.length;
                 String[] sentenceList = line.split("[!?.:]+");
                 sentenceCount += sentenceList.length;
                 
        	}
        }
        System.out.println("Total word count = " + countWord);
        System.out.println("Total number of sentences = " + sentenceCount);
        System.out.println("Total number of characters = " + characterCount);
	}

}
