public class TypeCastingExample {

    public static void main(String[] args) {

        // Double to Int (Explicit Casting)
        double doubleValue = 45.78;
        int intValue = (int) doubleValue;

        System.out.println("Original Double Value: " + doubleValue);
        System.out.println("After Casting to Int: " + intValue);

        // Int to Double (Implicit Casting)
        int number = 25;
        double convertedDouble = number;

        System.out.println("Original Int Value: " + number);
        System.out.println("After Casting to Double: " + convertedDouble);
    }
}
