package Exersice3;

public class Main {
   public static void main(String[] args) {
       double total = 0;
       Rouse ros1 = new Rouse(10, "Роза", "Красная");
       Rouse ros2 = new Rouse(7.5, "Роза", "Белая");
       Violet vio1 = new Violet(5, "Фиалка", "Желтая");
       System.out.println(Flower.total+" руб.");
   }
}
