package Menu;

import java.awt.Menu;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface MenuRepo extends JpaRepository {
	   Menu searchByName(String name);
	   List FindByPrice(String price);
	}
