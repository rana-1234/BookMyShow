package exception;

public class UnknownTheaterStatusException extends Exception{

  public UnknownTheaterStatusException(){
    super();
  }

  public UnknownTheaterStatusException(String msg){
    super(msg);
  }
}
