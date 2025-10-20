/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024_exam_q1;

public class MovieTickets implements IMovieTickets
{
    
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