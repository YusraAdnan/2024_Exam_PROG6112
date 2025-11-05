/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024_exam_q2;

/**
 *
 * @author yusra
 */
public class MovieTickets implements IMovieTickets
{
    @Override
    public double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice) //These 2 params will be user inputs from GUI
    {
        double price_VAT_Exclusive = ticketPrice * numberOfTickets;

        double VAT_Price = 0.14 * price_VAT_Exclusive;

        double final_Price = price_VAT_Exclusive + VAT_Price;
        
        return final_Price;
    }
    
    /* Option 1: This method shows how to validate data with the use of MovieTicketData 
       class and by passing different populated objects to this method to 
       validate each field systematically */
    @Override
    public boolean ValidateData(MovieTicketData movieTicketData)
    {
        if(movieTicketData.movieName.isEmpty())
        {
            return false;
        }
        if(movieTicketData.numberOfTickets <=0)
        {
            return false;
        }
        if(movieTicketData.ticketPrice <=0)
        {
            return false;
        }
        
        return true;
    }
    
    /*Option 2: This method shows how you can do validation WITHOUT making a class for MovieTicketData 
    (you will lose a few marks if you do this in you exam as this is not exactly implementing the interface as asked in the question paper
    This is just another way of how you can do the above method without a class) */
    @Override
    public boolean ValidateData2(String movieName, int numbOfTickets, double ticketPrice)
    {
        if(movieName.isEmpty())
        {
            return false;
        }
        if(numbOfTickets <=0)
        {
            return false;
        }
        if(ticketPrice <=0)
        {
            return false;
        }
        
        return true;
        
    }
}
