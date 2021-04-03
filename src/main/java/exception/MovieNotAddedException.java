package exception;

public class MovieNotAddedException extends  Exception{

  public MovieNotAddedException(){
    super();
  }

  public MovieNotAddedException(String msg){
    super(msg);
  }
}
