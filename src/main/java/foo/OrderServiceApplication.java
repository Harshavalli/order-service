package foo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
@Component("foo.OrderDao")

public class OrderServiceApplication {
	
	@Autowired
	OrderDao orderDao;

	public static void main(String[] args) {
		SpringApplication.run(OrderServiceApplication.class, args);
	}

	
	@GetMapping("/getOrders")
	public List<Order> fetchOrders(){
		return orderDao.getOrders();
	}
	
}
