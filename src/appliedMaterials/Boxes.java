package appliedMaterials;

public class Boxes {
    public static void main(String[] args) {

    	  int n = 10;

          int boxes = 0;

          while (n > 0) {
              if (n >= 3) {
                  n -= 3;
                  boxes++;
              } else {
                  n -= 1;
                  boxes++;
              }
          }

          System.out.println(boxes);
      
    }
}
