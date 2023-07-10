package ReadPropertyData;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromeProperty {

	public static void main(String[] args) throws IOException {
		
		//read the data from config.properties.
		FileInputStream fis = new FileInputStream("./data/config.properties");
		
		//create a object for properties file
		Properties prop = new Properties();
		
		//To make the file ready to read.
		prop.load(fis);  //load method is parameterized method accept F variable F
		
		
		//read the perticular property from file
		String data= prop.getProperty("Password");//getProperty method is parameterized method accept string argument
	
         System.out.println(data);
         
	}

}
