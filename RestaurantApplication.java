package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.*;
import java.util.List;
import Menu.MenuRepo;

//Spring Boot Application
@SpringBootApplication
public class RestaurantApplication implements CommandLineRunner {

   @Autowired
   MenuRepo repository;

   public static void main(String[] args) {
       SpringApplication.run(RestaurantApplication.class);
   }

   @Override
   public void run(String... args) throws Exception {

       repository.save(new Menu("Chilli Fries", "4.80"));
       repository.save(new Menu("Fried Chicken", "7.99"));
       repository.save(new Menu("Fish Sticks", "5.99"));
       repository.save(new Menu("Fries", "2.99"));
       repository.save(new Menu("Soda", "1.39"));

       
       System.out.println("Menus found with findAll():");
       System.out.println("-------------------------------");
       for (Menu menu : repository.findAll()) {
           System.out.println(menu);
       }
       System.out.println();

       
       System.out.println("Menu found with findByName('Chilli Fries'):");
       System.out.println("--------------------------------");
       System.out.println(repository.findByName("Chilli Fries"));

       System.out.println("Menus found with findByPrice(4.80):");
       System.out.println("--------------------------------");
       for (Menu menu : repository.findByPrice("4.80")) {
           System.out.println(menu);
       }
   }
}


