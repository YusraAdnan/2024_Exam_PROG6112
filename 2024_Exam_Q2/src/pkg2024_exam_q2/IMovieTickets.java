package pkg2024_exam_q2;

public interface IMovieTickets
{
    double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice); 
    
    /* This is according to the test paper but you are not required to
    follow the below method declaration as is because there is no marks
    for creating a class called MovieTicketData */
    
    boolean ValidateData(MovieTicketData movieTicketData);  
    
    //If you do not create a class to hold the MovieTicket Data separately you can make an alternate method like below
    boolean ValidateData2(String movieName, int numbOfTickets, double ticketPrice);  
}
