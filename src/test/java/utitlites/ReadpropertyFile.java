package utitlites;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

//configuration to read a file

public class ReadpropertyFile {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\dell\\TestAoutomation_workspace\\TestAoutomation\\src\\test\\resources\\configfiles\\config.propreties");
		
		Properties p = new Properties();
		p.load(fr);
		
		System.out.println(p.getProperty("browser"));
		System.out.println(p.getProperty("testurl"));
	}

}
