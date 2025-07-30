import java.util.stream.IntStream;

public class AllMethods {

//    public int evenNumbers (int number){
//        return IntStream.rangeClosed(1, number).filter(x -> x % 2 ==0 ).forEach(x -> System.out::print);
//    }

    public int streamSum (int number){
        return IntStream.rangeClosed(1, number).sum();
    }

    public boolean streamSquareNumber (int number){
        return IntStream.rangeClosed(1, number).anyMatch(square -> square * square == number);
    }
}
