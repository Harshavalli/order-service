package foo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {
	
	public List<Order>  getOrders(){
		return Stream.of(
				new Order(101,"Mobile",1,20000),
				new Order(102,"Book",2,2000),
				new Order(103,"Laptop",1,90000),
				new Order(104,"headSet",1,7000))
				.collect(Collectors.toList());
				
				
				
				
	}
	

}
