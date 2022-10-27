public class Runner {
    public static void main(String[] args) {
        BooleanGames game1 = new BooleanGames(-435);
        System.out.println(game1.isNegative());
        System.out.println("----");
        System.out.println(game1.exceeds(-600));
        System.out.println(game1.exceeds(-500));
        System.out.println(game1.exceeds(0));
        System.out.println("----");
        System.out.println(game1.isEven());
        System.out.println(game1.isOdd());
        System.out.println("----");
        System.out.println(game1.isMultipleOf(1));
        System.out.println(game1.isMultipleOf(2));
        System.out.println(game1.isMultipleOf(3));
        System.out.println(game1.isMultipleOf(5));
        System.out.println(game1.isMultipleOf(35));
        System.out.println(game1.isMultipleOf(145));
        System.out.println(game1.isMultipleOf(435));
        System.out.println("----");
        System.out.println(game1.isOnesDigit(5));
        System.out.println(game1.isOnesDigit(3));
        System.out.println(game1.isOnesDigit(4));
        System.out.println(game1.isOnesDigit(0));
        System.out.println(game1.isOnesDigit(35));
        System.out.println("----");

    }
}
