package pkg2024_exam_q2;

public interface IMovieTickets
{
    double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice); 
    
    /* This is according to the test paper but you are not required to
    follow the below method declaration as is because there is no marks
    for creating a class called MovieTicketData */
    
    /* Option 1: */
    boolean ValidateData(MovieTicketData movieTicketData);  
    
    /*Option 2: If you do not create a class to hold the MovieTicket Data separately you can make an alternate method like below
    (you will lose a few marks if you do this in you exam as this is not exactly implementing the interface as asked in the question paper
    This is just another way of how you can do the above method without a class) */
    
    boolean ValidateData2(String movieName, int numbOfTickets, double ticketPrice);  
}
