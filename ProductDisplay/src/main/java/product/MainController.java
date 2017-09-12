package product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;





@RestController
public class MainController {

	 @Autowired
	 private ProductService us;
	 
	 @RequestMapping("/product")
	 public List<ProductGetSet> getAllUsers() {
		 
	  return us.getAllProducts();
	  
	 }
	 
	 @RequestMapping("/product/{id}")
	 public ProductGetSet getUser(@PathVariable String id){
	  return us.getProduct(id);
	 }
	 
	 @RequestMapping(method = RequestMethod.POST, value="/product")
	 public void addUser(@RequestBody ProductGetSet user) {
	   us.addProduct(user);
	 }
	 
	 @RequestMapping(method = RequestMethod.PUT, value="/product/{id}")
	 public void updateUser(@RequestBody ProductGetSet user, @PathVariable String id) {
	   us.updateProduct(id, user);
	 }
	 
	 @RequestMapping(method = RequestMethod.DELETE, value="/product/{id}")
	 public void deleteUser(@PathVariable String id){
	   us.deleteProduct(id);
	 }
}
