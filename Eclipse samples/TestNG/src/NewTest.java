import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
  //@Test
  public void normal() { // TODO Auto-generated method stub
	  	 
	  	 ArrayList<String> list = new ArrayList<String>(); 
	  	 list.add("jeff");
	  	 list.add("Ship"); 
	  	 list.add("Vinay");
	  	 list.add("Pavi");
	  	 
	  	 int count = 0;
	  	 
	  	 for(int i=0;i<list.size();i++){ 
	  		 if(list.get(i).startsWith("j")) {
	  		 count++; 
	  		 }
	  	 }
	  	  
	  	 System.out.println(count);
	  	 
	  	
	  	 }
	  	 
	@Test
	  		public void streamFilter() {
	  			ArrayList<String> list = new ArrayList<String>();
	  			list.add("jef");
	  			list.add("Ship");
	  			list.add("Vinayi");
	  			list.add("Pavi");
	  			
	  		//	long c = list.stream().filter(s->s.startsWith("j")).count(); //Terminal operator will execute only if intermediate is returned true
	  		//	System.out.println(c);
	  			
	  			//Create a Stream
	  			
	  			Stream.of("Jeff","Vinay","Nive","Pavi","JR");
	  	//		list.stream().filter(s->s.length()>3).forEach(s->System.out.println(s)); // Prints string having length greater than 4
	  	//		list.stream().filter(s->s.length()>3).map(s->s.toUpperCase()).forEach(s->System.out.println(s));// Prints in uppercase - string having length greater than 4
	  			Stream<String> names =list.stream().filter(s->s.endsWith("i")).sorted().map(s->s.toUpperCase()); //sorting //Map
	  	//		names.forEach(s->System.out.println(s));
	  			Stream<String> newStream = Stream.concat(list.stream(), names);  // Stream concat
	  	//		newStream.forEach(s->System.out.println(s));
	  	//		boolean flag =newStream.anyMatch(s->s.equalsIgnoreCase("i")); //boolean to use assert // 
	  	//		Assert.assertTrue(flag);
	  			
	  			newStream.limit(1).forEach(s->System.out.println(s)); //limit using stream
	  		}
	  	
 // @Test
  public void streamCollect() {
	  List<String> col =Stream.of("Jeff","Vinay","Nive","Pavi","JR").filter(s->s.contains("i")).map(s->s.toUpperCase()).collect(Collectors.toList());
	 System.out.println(col.get(1));
  }
  

  @AfterTest
  public void afterTest() {
  }

}
