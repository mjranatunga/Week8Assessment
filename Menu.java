package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "menu")
class Menu {

   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   private Long id;
   private String name;
   private String price;

   protected Menu() {}

   public Menu(String name, String price) {
       this.name = name;
       this.price = price;
   }

   @Override
   public String toString() {
       return String.format(
               "Menu[id=%d, name='%s', price='%s']",
               id, name, price);
   }
}
