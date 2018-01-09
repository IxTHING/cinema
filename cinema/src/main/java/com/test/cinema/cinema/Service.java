package com.test.cinema.cinema;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Service {
	private Map<Integer, Movies> movieList = new HashMap<Integer, Movies>();
	
	private static int count = 0;
	
	public Service (Movies movie)
	{
		addMovie(movie);
	}
	
	public void addMovie(Movies movie)
	{
		count++;
		movieList.put(count, movie);
	}
	
	public void deleteMovie(int key)
	{
		movieList.remove(key);
	}
	
	public void printMap()
	{
		Set set = movieList.entrySet();
		Iterator iterator = set.iterator();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }
	}
	
}
