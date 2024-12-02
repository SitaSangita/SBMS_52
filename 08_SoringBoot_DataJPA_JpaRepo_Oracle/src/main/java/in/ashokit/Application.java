package in.ashokit;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Product;
import in.ashokit.repo.ProductRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				SpringApplication.run(Application.class, args);
		ProductRepo bean = 
				context.getBean(ProductRepo.class);
		Product p=new Product();
		p.setOderByName("Miller");
		p.setOrderPlaceDate(new Date());
		Product product = bean.save(p);
		System.out.println(product);
		context.close();
	}

}
