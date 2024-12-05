package in.ashokit.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.Product;
import in.ashokit.repo.ProductRepo;
@Component
public class ProductRunner implements CommandLineRunner{

	@Autowired
	private ProductRepo productRepo;
	@Override
	public void run(String... args) throws Exception {
		File f=new File("D:\\Images\\Apollo.jpg");
		
		 byte[] img=new byte[(int) f.length()];
		 FileInputStream fis=new FileInputStream(f);
		 fis.read(img);
		    Product p = new Product(104, "watch", 4526.25, img);
		    productRepo.save(p);
		    
		    
		    List<Product> all = productRepo.findAll();
		    Product product = all.get(0);
		    byte[] image = product.getImage();
		    
		    File f2= new File("D:\\AshokIT\\watch32.jpg");
		    
		    FileOutputStream fos= new FileOutputStream(f2);
		    fos.write(image);
	}

}
