package lab8.exercise1;

import java.io.File;

public class FileProgram {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File sb_source=new File("D:\\capegemini\\JAVA_JA17\\LabBookModule1\\src\\lab8\\exercise1\\source.txt");
		File sb_target=new File("D:\\capegemini\\JAVA_JA17\\LabBookModule1\\src\\lab8\\exercise1\\target.txt");
		CopyDataThread cdt = new CopyDataThread(sb_source,sb_target);
		cdt.start();
	}

}
