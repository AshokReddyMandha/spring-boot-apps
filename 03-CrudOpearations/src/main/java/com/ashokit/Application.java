package com.ashokit;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.Products;
import com.ashokit.repo.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);

		ProductRepository repository = run.getBean(ProductRepository.class);

//		Products p1=new Products();
//		p1.setProductId(101);
//		p1.setProductName("mobile");
//		p1.setProductPrice(100.00);
//		
//		repository.save(p1);

//		Products p1 = new Products();
//		p1.setProductId(101);
//		p1.setProductName("redmi");
//		p1.setProductPrice(12000.00);
//
//		Products p2 = new Products();
//		p2.setProductId(102);
//		p2.setProductName("samsung");
//		p2.setProductPrice(76999.00);
//
//		Products p3 = new Products();
//		p3.setProductId(103);
//		p3.setProductName("apple");
//		p3.setProductPrice(10000.00);
//
//		Products p4 = new Products();
//		p4.setProductId(104);
//		p4.setProductName("lenovo");
//		p4.setProductPrice(20000.00);
//
//		List<Products> asList = Arrays.asList(p1, p2, p3, p4);
//
//		repository.saveAll(asList);
		
		
//		Optional<Products> findById = repository.findById(102);
//		
//		if(findById.isPresent())
//		{
//			System.out.println(findById);
//		}
		
		List<Integer> asList = Arrays.asList(101,104);
		
		Iterable<Products> findAllById = repository.findAllById(asList);
		findAllById.forEach(s->System.out.println(s));
		
		

	}

}
