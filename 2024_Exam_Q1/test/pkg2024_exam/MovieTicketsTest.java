/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package pkg2024_exam;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author yusra
 */
public class MovieTicketsTest {
    
    public MovieTicketsTest() {
    }
    
    public static void setUpClass() {
    }
    
    public static void tearDownClass() {
    }
    
    public void setUp() {
    }
    
    public void tearDown() {
    }
    /*
    First thing to do when unit testing is ask:
    1. What is the actual method expecting as input (parameters)?
    2. You then make dummy data corresponding to the parameters
    3. You test the actual method by passing it the dummy data you created inside the test method
    4. You compare the returned result from the method with what the result should actually be */
    

    /*In this method we will test if the method does the correct actions when given the data it asks for*/
    @Test
    public void CalculateTotalSales_ReturnsExp() 
    {
        MovieTickets mt = new MovieTickets();
        
        //Method asks for an array so we create an array with actual dummy information
        int[] sales = {3000, 1500, 1700};
        
        /* Method returns total movies result and takes in a movie array 
         When we pass the dummy array to this method it returns a total we store the total*/
        int result = mt.TotalMovieSales(sales);
        
        //We check if the total returned by the method is right therefore we do assert equals which compares the result with the actual result
        assertEquals(6200, result);
    }

    /**
     * Test of TopMovie method, of class MovieTickets.
     */
    @Test
    public void TopMovieSales_ReturnsTopMovie()
    {
        MovieTickets mt = new MovieTickets();

        //The method we want to test asks for 2 arrays, we make dummy array matching the data type of the actual method parameters
        String[] movies = {"Napoleon", "Oppenheimer"};
        int[] totalSales = {6200, 6300};

        //Pass the dummy array to the method to test if the method is returning the correct top movie
        String result = mt.TopMovie(movies, totalSales);
        assertEquals("Oppenheimer", result);
    }
    
}
