package extentreport_demo;

public class dataCheck {
public static void main(String[] args) {
	DataProperties data = new DataProperties();
	
//	System.out.println(data.url);
//	System.out.println(data.username);
//	System.out.println(data.password);
	HelperClass.openPage(data.url);
}
}
