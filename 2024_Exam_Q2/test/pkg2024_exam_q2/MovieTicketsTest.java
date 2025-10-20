package pkg2024_exam_q2;

import org.junit.Test;
import static org.junit.Assert.*;


public class MovieTicketsTest 
{
    
    public MovieTicketsTest() 
    {
    }

    @Test
    public void CalculateTotalTicketPrice_CalculatedSuccessfully()
    {
        MovieTickets mt = new MovieTickets();
        
        int numberOfTickets = 3;
        
        double price = 100.00;
        
        double result = mt.CalculateTotalTicketPrice(numberOfTickets, price);
        
        // we add the delta number there to allow java just to read the first 2 decimals of the calculated number
        assertEquals(result, 342.0, 0.001);
    }

    @Test
    public void testValidation() 
    {
       MovieTickets mt = new MovieTickets();
       MovieTicketData data = new MovieTicketData("Napoleon", 2, 250);
       
       boolean result = mt.ValidateData(data);
       assertTrue(result);
    }
    
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
    
}
