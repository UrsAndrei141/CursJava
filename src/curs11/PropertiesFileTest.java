package curs11;

public class PropertiesFileTest {

	public static void main(String[] args) {
		
		PropertiesFileProcessor obj = new PropertiesFileProcessor();
		obj.writePropertiesFile();
		
		obj.readPropertiesFile("hostname");
		obj.readPropertiesFile("username");
		obj.readPropertiesFile("browser");

	}

}
