package BaseTest;

import java.time.Duration;

import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	protected WebDriver driver;
	public static ExtentReports extent;
	public static ExtentSparkReporter htmlReporter;
	 public static ExtentTest test;
	public static Logger logger;
	
	@BeforeMethod
	public void Setup() {
		
		
	    WebDriverManager.chromedriver().setup();
	    
	    ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		
		
		driver.get("https://in.bookmyshow.com/");
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		

		
		/*
		 * city.clear();
		 * 
		 * city.sendKeys("pu"); Thread.sleep(2000); city.sendKeys(Keys.ARROW_DOWN);
		 * city.sendKeys(Keys.ENTER);
		 * 
		 * WebElement SignIn =
		 * driver.findElement(By.xpath("//div[normalize-space()='Sign in']"));
		 * 
		 * SignIn.click();
		 * 
		 * WebElement Emailid =
		 * driver.findElement(By.xpath("//div[contains(text(),'Continue with Email')]"))
		 * ; JavascriptExecutor EmailLogin = (JavascriptExecutor) driver;
		 * EmailLogin.executeScript("arguments[0].click()", Emailid);
		 * 
		 * WebElement EmailidInput = driver.findElement(By.id("emailId"));
		 * 
		 * EmailidInput.sendKeys("atulkondhare001@gmail.com");
		 * 
		 * Thread.sleep(10000);
		 * 
		 * WebElement SubmitBtn =
		 * driver.findElement(By.xpath("//*[text()='Continue']"));
		 * 
		 * SubmitBtn.click();
		 */		
		
		
	}
	
	
	 public void initializeReport(){
		 
		 ExtentSparkReporter htmlReporter =  new ExtentSparkReporter(System.getProperty("user.dir")+"/Reports/BmsExtentReport.html");
		    htmlReporter.config().setDocumentTitle("Automation Report BookMyshow Test");
		    htmlReporter.config().setReportName("BookMyShow Test Report");
		    htmlReporter.config().setTheme(Theme.STANDARD);
		    htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
		    extent = new ExtentReports();
		 
		    extent.attachReporter(htmlReporter);   
		}
	 
	
	@AfterMethod
	public void tearDown() {
		
		//driver.close();
		
		extent.flush();
		
	}

}
