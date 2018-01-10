package com.test.cinema.cinema;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Movies rambo = new Movies("Rambo", "Action", 18);
        Movies starWars = new Movies("Star Wars", "Sci-Fi", 12);
        
        Service service;
        service = new Service(rambo);
        service.addMovie(starWars);
        service.deleteMovie(1);
        service.printMap();
        System.out.print(service.toJson());
    }
}
