import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;



public class test1 {

	@Test
	
	public void regular()
	
	{
	ArrayList<String> names  = new ArrayList<>();
	
	names.add("Abhijeet");
	names.add("Don");
	names.add("Alekhya");
	names.add("Adam");
	names.add("Ram");
	
	int count=0;
	
	for(int i=0;i<names.size();i++)
	{
		
	String actual = names.get(i);
	if(actual.startsWith("A"))
	{
		count++;
	}
	}
	System.out.println(count);
			}
	
	@Test 
	
	public void streamFilter() {
		
		ArrayList<String> names  = new ArrayList<>();
		
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		
		//there is no life for intermediate op if there is no terminal op
		//terminal operation will execute only if inter op(filter) returns true
		//we can create stream 
		//how to use filter in Stream API 
		
		Long c =names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		long d=Stream.of("Abhijeet)","Don","Alekhya","Adam","Ram").filter(s->
		
		
		{
			
			s.startsWith("a");
			return true;
			}).count();

		System.out.println(d);
		
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
	
	}
		
		@Test
		public void streamMap()
		{
			ArrayList<String> names = new ArrayList<String>();
			names.add("Woman");
			names.add("Don");
			names.add("man");
			//print names which have last letter as "a" with Uppercase
			Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).
	                forEach(s->System.out.println(s));
			//print names which have first letter as a with uppercase and sorted
			
			List<String>names1=Arrays.asList("Abhijeet","Don","Alekhya","Adam","Ram");
			names1.stream().filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//merging 2 different lists	 
			Stream<String> newStream= Stream.concat(names.stream(),names1.stream());
			
			boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
			Assert.assertTrue(flag);
			
			
		}
		@Test
		public void streamcollect()
		{
			List<String> ls= Stream.of("Abhijeet","Don","Alekhya","Adam","Ram").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).
            collect(Collectors.toList());
			System.out.println(ls.get(0));
			
			List<Integer>values=Arrays.asList(3,2,4,5,6,7,2,2);
			//print unique number from this array
			//sort the array 
			values.stream().distinct().forEach(s->System.out.println(s));
			
			List<Integer> li =values.stream().distinct().sorted().collect(Collectors.toList());
			
			System.out.println(li.get(2));
            		
            		
            
			
		}
	
	
	
}