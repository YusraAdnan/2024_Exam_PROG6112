package pkg2024_exam_q1;

public class Main {

   
    public static void main(String[] args) 
    {
        
        String[] MovieName = {"Napoleon", "Oppenheimer"};
        
        int[][] Sales = 
        {
            //[0] - ROW 1
            {3000, 1500, 1700}, //First row sales for Napoleon
            
            //[1] - ROW 2
            {3500, 1200, 1600}  //Second row sales for Oppenheimer
        };
        
        //Single array holding the totals of each row in the 2D array
        int[] totalSales = new int[MovieName.length];
        
        MovieTickets mt = new MovieTickets();
        
        // Calculate totals per movie
        for (int i = 0; i < MovieName.length; i++)
        {
            /*The method 'TotalMovieSales' takes in a 1D array calculate
            totals of it and returns the total to where the method is being called
            
            We calculate the total of each row in the 2D array and store the returned value
            in the respective index of the totalSales array */
            totalSales[i] = mt.TotalMovieSales(Sales[i]);
        }
        
        System.out.println("MOVIE TICKET SALES REPORT - 2024");
        System.out.println("\t\t\tJAN\tFEB\tMAR");
        System.out.println("------------------------------------------------------");

        //For every movie name we want to print out the Sales
        for(int i = 0; i < MovieName.length; i++ ) //prints out the row
        {
            System.out.printf("%-25s", MovieName[i]);
            
            for(int j = 0; j < Sales[i].length; j++)//prints out the column value
            {
                System.out.print(Sales[i][j] + "\t");
            }
            System.out.println();
        }            
        System.out.println();
        
        
        System.out.println("Total movie ticket sales for Napoleon " + totalSales[0]);
        System.out.println("Total movie ticket sales for Oppenhemier " + totalSales[1]);
        
        String topMovie = mt.TopMovie(MovieName, totalSales);
        
        System.out.println();
        System.out.println("Top performing movie: " + topMovie);
    }
    
}
