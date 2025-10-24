/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024_exam;

/**
 *
 * @author yusra
 */
public interface IMovieTickets {
    
    //Method that is taking in an array as a prameter and NOT just a variable and returning an int 
    int TotalMovieSales(int[] movieTicketSales); 
    
    //Method that is taking an arrays as a prameter and returning a String
    String TopMovie(String[] movies, int[] totalSales); 
}
