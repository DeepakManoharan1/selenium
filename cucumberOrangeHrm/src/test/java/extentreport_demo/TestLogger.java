package extentreport_demo;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class TestLogger {
	public static org.apache.logging.log4j.Logger log;
	public static void main(String[] args) throws InterruptedException {
		
	
	log = LogManager.getLogger(TestLogger.class);
	EdgeDriver driver = new EdgeDriver();
//	driver.manage().timeouts.implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(3000);
	driver.get("https://www.myntra.com/");
	log.info("logged in myntra");
	try {
		boolean text  = driver.findElement(By.linkText("Women")).isDisplayed();
		System.out.println(text);
	} catch (Exception e) {
		// TODO: handle exception
		log.error("Exception occured",new Exception("Element not found"));
	}
	finally {
		driver.quit();
		log.info("loged out");
	}
	}

}
