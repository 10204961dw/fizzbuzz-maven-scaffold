public class FizzBuzz {

    public String numOff(int param) {
        if (param % 3 == 0) {
            return "fizz";
        } else if (param % 5 == 0) {
            return "buzz";
        } else if (param % 3 == 0 && param % 5 == 0) {
            return "fizzbuzz";
        }
        return String.valueOf(param);
    }
}
