public class RecursionBasics {

    public void nameRecursion(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Taarun");
        nameRecursion(n - 1);
    }
    public static void main(String[] args) {
        RecursionBasics example = new RecursionBasics(); // Create an object
        example.nameRecursion(5);

    }
}
