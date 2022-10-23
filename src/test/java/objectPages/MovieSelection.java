package objectPages;



import java.time.Duration;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MovieSelection {
	
	WebDriver ldriver;
	public JavascriptExecutor executor;
	public WebDriverWait wait20;
	
	public MovieSelection(WebDriver rdriver)
	{
	  this.ldriver=rdriver;
	  executor = (JavascriptExecutor)this.ldriver;
	  
	 

	  
	  PageFactory.initElements(rdriver,this);
		
		
	}
	
	
	
	//City Search Box 
	
	@FindBy (xpath="//input[@placeholder='Search for your city']")
	 
	 WebElement city;
	
	

	
	
	// Explore Movies.
	
	@FindBy(css="a[href*='explore/movies-pune']")
	WebElement exploreMovies;
	
	//Select Movie Language
	
	@FindBy(xpath="//div[@class='sc-7o7nez-0 iIDzvh'][normalize-space()='Marathi']")
	WebElement movieLanguage;
	
	// Select Movie 
	@FindBy(xpath="//div[contains(text(),'Shivpratap Garudjhep')]")
	WebElement movieSelection;
	
	//Submit Selected Movie
	
	@FindBy(xpath="//div[@class='sc-qswwm9-8 jayiEd']//span[contains(text(),'Book tickets')]")
	
	WebElement bookmoviesubmitbtn;
	
	//Movie Date Selection
	
	@FindBy(xpath="//div[normalize-space()='22']")
	
	WebElement MovieBookingDate;
	
	//Select Movie Theatare
	
	 @FindBy(linkText="INOX: Jai Ganesh, Akurdi")
	 
	  WebElement SelectMovieTheatre;
	 
	 //Select Movie Timing.
	 
	 @FindBy(xpath="//div[contains(text(),'10:15 PM')]")
	 
	  WebElement bookmovietiming;
	 
	 //Accept Movie Notification.
	 
	 @FindBy(xpath="//div[@id='btnPopupAccept']")
	 
	 WebElement acceptMovienotification;
	 
	 // Movie Quantity Selection Modal.
	 
	 @FindBy(id="qty-sel-title-text")
	 
	 WebElement QuantityModal;
	 
		
     // Movie Ticket Count Selection
	 
	 @FindBy(xpath="//li[@id='pop_2']")

	 WebElement TicketCount;
	 
	 // Ticket count Submit Button.
	 
	 @FindBy(id="proceed-Qty")
	 
	 WebElement SubmitTicketCount;
	 
	 
	 // Select Tickets from Ticket Table Layout.
	 
	 @FindBy(xpath="//div[@id='A_B_21']//a[@class='_available'][normalize-space()='21']")
	 
	 WebElement TableLayout;
	 
	 
	 // Payment Pay Submit button after Seat Selection.
	 
     @FindBy(id="btmcntbook")
	 
	 WebElement TicketBookingPayBtn;
     
     
     // Total Payment Pay Confirmation.
	 
      @FindBy(id="prePay")
	 
	 WebElement TotalPaymentConfirm;
      
      
  //Final Email insertion for Booked Ticket availability on Email.
      
      @FindBy(id="txtEmail")
      
      WebElement Email;
      
//Final Mobile insertion for Booked Ticket availability on Mobile.
      
      @FindBy(id="txtMobile")
      
      WebElement Mobile;
      
      // Final Contact Details Submit Button.
      
     @FindBy(xpath="//*[@id=\"dContinueContactSec\"]")
      
      WebElement ContactDetailsSubmitBtn;
     
     
     // Upi Payment Option Selection.
     
     @FindBy(id="dTUPI")
     
     WebElement UpiPayOption;
    


   // Select UPI Payment Option.
     
     @FindBy(xpath="//img[@alt='Paytm']")
     
     WebElement UpiPaytmSelection;
    

      // Paytm Payment UPI Id Selceted.
     
     //@FindBy(id="txtUPIId") 
     
 	 //WebElement PaytmUpiID;
     

	
  
     
		

// Paytm Bank Upi-Mobile Enter Details for payment.
     
     @FindBy(id="txtUPIId")

	 WebElement UpiPaytmConfirmNumber;
     
		
// Paytm Bank Upi-company id Enter Details for payment.
     
     @FindBy(id="dUPIVPADrop")

	 WebElement UpiPaytID;
     

	// Make UPI Payment Final Submission.
     
     @FindBy(xpath="//button[@onclick=\"pay.fnPayUPI('UPI');\"]")
     
     WebElement UpiMakePayment;
     
     

 	// Booking Process is not Completed Successfully.
      
      @FindBy(xpath="//*[@id=\"dRetryTimerOver\"]")
      
     WebElement BookingFailure;
      
     
   

		
		

    
	  
	 
	 
	 

	 
		

			 

	

	
	
	
	
	public void citysearchClear() {
	
		city.clear();
		
}
	
	 public void SendCityName(String Pu ) {
		  
		  city.sendKeys(Pu);
	  }
	 

	

	 public void SendEnterKeys(Keys Enterkeys ) {
		  
		  city.sendKeys(Enterkeys);
	  }

	
	public String ExploreMovies() {
		
	String urls =	(String)executor.executeScript("arguments[0].click()",exploreMovies);
		return urls;
		
	}
	
      public void MovieLanguage() {
		
		executor.executeScript("arguments[0].click()",movieLanguage);
		
	}
      
      public void movieSelection() {
  		
  		executor.executeScript("arguments[0].click()",movieSelection);
  		
  	}
      public void SubmitSelectedMovie() {
    		
    		executor.executeScript("arguments[0].click()",bookmoviesubmitbtn);
      }
      
      public void MovieDateSelection() {
  		
  		executor.executeScript("arguments[0].click()",MovieBookingDate);
  		
    }
      
      public void SelectMovieTheatre() {
    	  
    	  SelectMovieTheatre.click();
    		
      }

      public void MovieTimeSelection() {
    	  
      executor.executeScript("arguments[0].click()", bookmovietiming);
    	  
    		
      }
      
      public void AcceptNotification() {
    	  
      executor.executeScript("arguments[0].click()", acceptMovienotification);
        	  
        		
          }
      
      public void MovieCountSelectionModal() {
    	  
    	 wait20= new WebDriverWait(ldriver, Duration.ofSeconds(20));
    	  
    	 wait20.until(ExpectedConditions.visibilityOf(QuantityModal));
    			 
    		
           }
      
      
      public void TicketCountSelection() {
    	  
          executor.executeScript("arguments[0].click()", TicketCount);
            	  
            		
              }
      
       public void TicketCountSubmit() {
    	  
       executor.executeScript("arguments[0].click()",  SubmitTicketCount);
            	  
            		
              }
       
     public void TableLayoutSelection() {
    	  
   executor.executeScript("arguments[0].click()",TableLayout);
          
    	  
      }
      
       public void TicketPaymentSubmitBtn() {
    	  
    	   TicketBookingPayBtn.click();
    		
      }
       
       public void TotalPaymentConfirmation() {
     	  
    	   TotalPaymentConfirm.click();
    		
      }
       
       public void FinalEmailVerification() {
      	  
    	   Email.sendKeys("atulkondhare001@gmail.com");
    	   
    		
      }
       
       public void FinalMobileVerification() {
       	  
    		Mobile.sendKeys("7020490227");
    	   
    		
      }
       
       public void FinalContactDetailSubmitBtn() {
    	   
    	   ContactDetailsSubmitBtn.click();
       }
      
       

       public void UpiPaymentOptionSelection() {
    	   
    	   UpiPayOption.click();
       }
      
		
		
       
        public void PaytmUiOptionSelection() {
    	   
        	UpiPaytmSelection.click();
       }


        
	
      
       public void PaytmUpiMobileOption() {
     	   
    	   UpiPaytmConfirmNumber.sendKeys("7020490227");
      }


       public void PaytmUpiId() {
     	   
    		UpiPaytID.sendKeys("paytm");
      }
 
       
       public void PaytmUpiFinalSubmission() {
     	   
    	   UpiMakePayment.click();
      }
       
       
       public String BookingProcessFailure() {
    	   
    	   BookingFailure.getText();
    	   return null;
    	   
    	 // return BookingFailure;
       }
  	
    
      
          
      
      
    	}
 
