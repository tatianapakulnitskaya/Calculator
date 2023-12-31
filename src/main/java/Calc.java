/* Class Calc with the method sum is used to calculate the sum of 2 String items,
the result is represented either in String format. To calculate Strings are converted to Integers,
check for unexpected value is included*/
public class Calc {
    public String sum(String a, String b) {
        String result = "";
        String message = "Unexpected value";
        if (a.matches("[0-9]+") && b.matches("[0-9]+")) {
            result = Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
            return result;
        } else return message;
    }
}
