
package pkg2024_exam;

public class MovieTickets implements IMovieTickets
{
    //Method calculates total sales by looping through each element and adding it
    @Override
     public int TotalMovieSales(int[] movieTicketSales)
     {
         int total = 0;
         for (int sales: movieTicketSales)
         {
             total += sales;
         }
         return total;
     }

     
    @Override
    public String TopMovie(String[] movies, int[] totalSales)
    {
        //Start by assuming that max sales is at the first index
        int max = totalSales[0];
        String topMovie = movies[0];

        for(int i = 0; i < totalSales.length; i++)
        {
            if(totalSales[i] > max)
            {
                max = totalSales[i];
                topMovie = movies[i];
            }
        }
        return topMovie;
    }
}