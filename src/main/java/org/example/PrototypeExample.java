package org.example;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PrototypeExample {
   public static void main(String[] args){

       //Create a prototype sheep

       Sheep originalSheep = new Sheep("Dolly");

       //clone the original sheep

       Sheep clonedSheep = (Sheep) originalSheep.clone();

       //Customize the cloned sheep

       clonedSheep.setName("Molly");

       //Print the name of both sheep
       System.out.println("Original sheep name: " + originalSheep.getName());
         System.out.println("Cloned sheep name: " + clonedSheep.getName());
   }
}