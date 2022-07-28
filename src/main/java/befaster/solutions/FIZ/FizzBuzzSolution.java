package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String result = "";
        boolean isFizz = false;
        boolean isBuzz = false;
        boolean isDeluxe = true;
        int tempNumber = number;
        int lastDigit = number % 10;

        if (number % 3 == 0 || number.toString().contains("3")) {
            result = "fizz";
            isFizz = true;
        }
        if (number % 5 == 0 || number.toString().contains("5")) {
            if(isFizz){
                result += " buzz";
            }
            isBuzz = true;
        }
        if(tempNumber > 10) {
            while (tempNumber != 0) {

                int digit = tempNumber % 10;
                tempNumber = tempNumber / 10;

                if (digit != lastDigit) {
                    isDeluxe = false;
                }
            }
        }

        if(isDeluxe && (isFizz || isBuzz)){
            return result + " deluxe";
        }else if (isDeluxe){
            return "deluxe";
        }else{
            return number.toString();
        }

    }

}



