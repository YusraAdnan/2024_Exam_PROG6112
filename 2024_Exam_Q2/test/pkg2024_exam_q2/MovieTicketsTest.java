package pkg2024_exam_q2;

import org.junit.Test;
import static org.junit.Assert.*;


public class MovieTicketsTest 
{
    
    public MovieTicketsTest() 
    {
    }

    /*First thing to do when unit testing is ask:
    1. What is the actual method expecting as input (parameters)?
    2. You then make dummy data corresponding to the parameters
    3. You test the actual method by passing it the dummy data you created inside the test method
    4. You compare the returned result from the method with what the result should actually be */
    @Test
    public void CalculateTotalTicketPrice_CalculatedSuccessfully()
    {
        MovieTickets mt = new MovieTickets();
        
        //Dummy user input data
        int numberOfTickets = 3;
        
        double price = 100.00;
        
        double result = mt.CalculateTotalTicketPrice(numberOfTickets, price);
        
        // we add the delta number there to allow java just to read the first 2 decimals of the calculated number
        assertEquals(result, 342.0, 0.001); 
    }
    //The following test is for Option 1: if you chose to do the Method in the interface that passes an object of MovieTicketData class
    @Test
    public void testValidation() 
    {
       MovieTickets mt = new MovieTickets();
       MovieTicketData data = new MovieTicketData("Napoleon", 2, 250);
       
       boolean result = mt.ValidateData(data);
       assertTrue(result);
    }
    
    //The following test is for Option 2: if you chose to do the Method in the interface without passing an object to it
    @Test
    public void testValidName() 
    {
       MovieTickets mt = new MovieTickets();
       String name = "Napolian";
       int price = 100;
       int totalTickets = 2;
       
       boolean result = mt.ValidateData2(name, price, totalTickets);
       assertTrue(result);
    }
    
/* Keypoints: 
    1. assertEquals is used to check if the actual value returned by a method matches the expected value.
    2. assertTrue / assertFalse are used when a method returns a boolean value.
*/    
    
}
