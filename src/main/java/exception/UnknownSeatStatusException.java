package exception;

public class UnknownSeatStatusException extends Exception{

  public UnknownSeatStatusException(){
    super();
  }

  public UnknownSeatStatusException(String message){
    super(message);
  }
}
