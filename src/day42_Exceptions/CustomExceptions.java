package day42_Exceptions;

class FadyException extends RuntimeException { //custom unchecked exception

    public FadyException() {
        super("It is default constructor's message");
    }

    public FadyException(String message) {
        super(message);
    }
}

class NoBreakException extends Exception { //custom checked exception

    public NoBreakException(String message) {
        super(message);
    }
}

public class CustomExceptions {

    public static void main(String[] args) {

        //throw new FadyException();

        //throw new FadyException("It's time for short break");
        try {
            throw new NoBreakException("There is no break");
        } catch (NoBreakException e) {
            e.printStackTrace();
        }


    }
}
