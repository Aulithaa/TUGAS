
package Polymorphism;

public class Polymorphism {

    
    public static void main(String[] args) {
      cetakObyek(new kucing());
      cetakObyek(new hewan());
      cetakObyek(new habitat());
      cetakObyek(new Object());
   }
    
   public static void cetakObyek(Object obyek) {
      System.out.println(obyek);
   }
 
} 
class kucing extends hewan {
   public String toString() {
      return "kucing hewan yang lucu";
   }
}
class hewan extends habitat{
   public String toString() {
      return "ia hewan berkaki 4,memiliki suara meow-meow,ia memiliki bulu";
   }
}
class habitat extends Object {
   public String toString() {
      return "hidup di daratan";
   
    }   
}
