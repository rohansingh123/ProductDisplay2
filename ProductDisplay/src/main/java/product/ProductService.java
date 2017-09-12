package product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	private ProductRepository ur;

	public List<ProductGetSet> getAllProducts() {
		List<ProductGetSet> users = new ArrayList<>();
		  ur.findAll().forEach(users::add);
		  return users;
	}

	public ProductGetSet getProduct(String id) {
		return ur.findOne(id);
	}

	public void addProduct(ProductGetSet user) {
		ur.save(user);
		
	}

	public void updateProduct(String id, ProductGetSet user) {
		ur.save(user);
		
	}

	public void deleteProduct(String id) {
		ur.delete(id);
		
	}

	
}
