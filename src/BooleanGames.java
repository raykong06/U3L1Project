public class BooleanGames {
    private int number;
    private int numberDisplay;

    public BooleanGames(int number) {
        this.number = number;
    }

    /* Returns true if the instance variable, number, is negative;
       returns false otherwise
     */
    public boolean isNegative() {
        return (number < 0);
    }

    /* Returns true if the instance variable, number, is greater than num
     */
    public boolean exceeds(int num) {
        return (number > num);
    }


    /* Returns true if the instance variable, number, is even;
       returns false otherwise
     */
    public boolean isEven() {
        return (number % 2 == 0);
    }


    /* Returns true if the instance variable, number, is odd; returns false
       otherwise; needs to be able to handle case when number is negative
     */
    public boolean isOdd() {
        numberDisplay = number;
        if (number * -1 >= 0)
        {
            numberDisplay = number * -1;
        }
        return (numberDisplay % 2 == 1);
    }

    /* Returns true if the instance variable, number, is a multiple of x;
       returns false otherwise
     */
    public boolean isMultipleOf(int x)
    {
        return (number / x == 1);
    }

    /* Returns true if the ones digit of the instance variable, number, is equal
       to num; e.g. if number is 437, then isOnesDigit(7) would return true and
       isOnesDigit(5) would return false; needs to be able to handle case when
       number is negative, so if the number is -123, then isOnesDigit(3) should
       return true.

       PRECONDITION:  num >= 0
     */
    public boolean isOnesDigit(int num)
    {
        numberDisplay = number;
        if (number * -1 >= 0)
        {
            numberDisplay = number * -1;
        }
        String stringForm = Integer.toString(numberDisplay);
        String lastChar = stringForm.substring(stringForm.length()-1);
        int lastDigit = Integer.parseInt(lastChar);
        return lastDigit == num;
    }
}
