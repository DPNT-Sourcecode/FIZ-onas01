package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String result = "";
        boolean isFizz = false;
        if (number % 3 == 0 || number.toString().contains("3")) {
            result = "fizz";
            isFizz = true;
        }
        if (number % 5 == 0 || number.toString().contains("5")) {
            if(isFizz){
                return result + " buzz";
            }
            return "buzz";
        }else if(isFizz){
            return result;
        }else{
            return number.toString();
        }

    }

}



