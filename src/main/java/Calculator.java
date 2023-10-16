/* Class Calculator with the method sum is used to calculate the sum of 2 String items,
the result is represented either in String format*/
public class Calculator {
    public String sum(String a, String b) {
        String result = "";
        String message = "Unexpected value";
        if (a.matches("[0-9]+") && b.matches("[0-9]+")) {
            result = Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
            return result;
        } else return message;
    }
}
