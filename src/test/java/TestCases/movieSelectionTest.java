package TestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import BaseTest.BaseClass;
import objectPages.MovieSelection;

public class movieSelectionTest extends BaseClass {
	MovieSelection movie;
	
	//extent.createTest("MyFirstTest")
	  //.log(Status.PASS, "This is a logging event for MyFirstTest, and it passed!");
	//extent.flush();
	
	
	@BeforeTest
	public void StartTest() {
		
		initializeReport();
	}
	
	

	@Test
	public void MovieBooking() throws InterruptedException {
		

		String methodName = new Exception().getStackTrace()[0].getMethodName();
        test = extent.createTest(methodName,"MovieBooking");
        test.log(Status.INFO,"starting");
        test.assignCategory("P0");
		
		MovieSelection movie = new MovieSelection(driver);
		movie.citysearchClear();
		movie.SendCityName("Pu");
		Thread.sleep(3000);
		movie.SendEnterKeys(Keys.ENTER);
		
		 movie.ExploreMovies();
		
		String urlTest="https://in.bookmyshow.com/explore/movies-pune";
		String GetUrl=driver.getCurrentUrl();
		if(urlTest.equalsIgnoreCase(GetUrl)) {
			
			test.log(Status.PASS,"Test is Passed Successfully.");
		}
		else {
			

			test.log(Status.FAIL,"Test is Not Passed.");
			
		}
		
	
		
			
			
		movie.MovieLanguage();
		System.out.println("Movie Language is Selected.");
		
		

		
		
		movie.movieSelection();
        System.out.println("Movie is Selected.");
        
        movie.SubmitSelectedMovie();
        System.out.println("Selected Movie Submitted.");
        
        movie.MovieDateSelection();
    	System.out.println("Selected Movie Date");
    	
    	movie.SelectMovieTheatre();
    	System.out.println("" + driver.getTitle()+ "Movie is Theatre Selected");
    	
    	
        movie.MovieTimeSelection();
		System.out.println("Selected Movie Timing");
		
		movie.AcceptNotification();
		System.out.println("Notification Accepted.");
		
		movie.MovieCountSelectionModal();
        System.out.println("Movie Quantity Modal Selected.");
        
        movie.TicketCountSelection();
        System.out.println("Movie Ticket Count Selected.");
        
        
        movie.TicketCountSubmit();
		System.out.println("Confirmed Ticket Count.");
		
		movie.TableLayoutSelection();
        System.out.println("Theatre Seat Selected.");
        
        movie.TicketPaymentSubmitBtn();
        System.out.println("Payment Submit Button Clicked.");
        
        movie.TotalPaymentConfirmation();
        System.out.println("Final Payment Confirmation.");
        
        movie.FinalEmailVerification();
        System.out.println("Final Email Confirmation.");
        
        movie.FinalMobileVerification();
        System.out.println("Final Mobile Confirmation.");
        
        movie.FinalContactDetailSubmitBtn();
        System.out.println("Final Contact Details Submitted.");
        
        movie.UpiPaymentOptionSelection();
        System.out.println("Upi Payment Option Selected.");
        
     
        
        

        movie.PaytmUiOptionSelection();
        System.out.println("Paytm Upi Option Selected.");
        
        
	
        


        movie.PaytmUpiMobileOption();
        System.out.println("Paytm Upi Mobile Entered.");
        
        
        movie.PaytmUpiId();
        System.out.println("Paytm Upi Id Entered.");
       
        movie.PaytmUpiFinalSubmission();
        System.out.println("Upi Payment Final Payment Submit Button.");
        
        Thread.sleep(15000);
        
        
        String MovieStatus = movie.BookingProcessFailure();
         
        String BookingFailureMSG ="Sorry, your booking could not be completed!";
        		
        
        if(MovieStatus.equalsIgnoreCase(BookingFailureMSG)) {
        	
        	System.out.println("Your Booking is Failed");
        	
        }else {
        	
        	System.out.println("Your Booking is Successfull.");
            
      	
        	
        }
        
        
        
        		
	     }
    }

