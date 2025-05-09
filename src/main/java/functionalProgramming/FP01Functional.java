package functionalProgramming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {

        printAllNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
    }

    private static void printNumber(int number){
        System.out.println(number);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
//        //How will I loop the numbers? Traditional vs Enhanced for loop
//        for(int number:numbers){
//            System.out.println(number);
//        }
        //Convert the list into a stream of numbers then specify what to do with each of them
        numbers.stream()
                .forEach(FP01Functional::printNumber);
    }
}
