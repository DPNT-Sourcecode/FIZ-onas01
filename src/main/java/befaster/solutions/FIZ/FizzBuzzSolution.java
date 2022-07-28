package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String result = "";
        String deluxe = " deluxe";
        boolean isFizz = false;
        boolean isBuzz = false;
        boolean isDeluxe = false;

        if (number % 3 == 0 || number.toString().contains("3")) {
            result = "fizz";
            isFizz = true;
            if(number % 3 == 0 && number.toString().contains("3")){
                isDeluxe = true;
            }
        }
        if (number % 5 == 0 || number.toString().contains("5")) {
            if(number % 5 == 0 && number.toString().contains("5")){
                isDeluxe = true;
            }
            if(isFizz){
                result += " buzz";
            }else {
                result = "buzz";
            }
            isBuzz = true;
        }

        if(number % 2 != 0){
            deluxe = " fake delux";
        }

        if(isDeluxe){
            return result + deluxe;
        }else if (isFizz || isBuzz){
            return result;
        }else{
            return number.toString();
        }

    }

}



