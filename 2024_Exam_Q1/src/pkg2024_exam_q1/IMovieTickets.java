package pkg2024_exam_q1;

public interface IMovieTickets 
{
    //Method that is taking in an array as a prameter and NOT just a variable and returning an int 
    int TotalMovieSales(int[] movieTicketSales); 
    
    //Method that is taking an arrays as a prameter and returning a String
    String TopMovie(String[] movies, int[] totalSales); 
}
