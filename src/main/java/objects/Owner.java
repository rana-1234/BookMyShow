package objects;

import Interfaces.ICustomer;
import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Owner implements ICustomer {
  private String id;
  private List<MovieTheater> theater;

  public Owner(@NotNull String id){
    this.id = id;
    theater = new ArrayList<>();
  }

  public void addMovieTheater(MovieTheater theater){
    //Will make a post request to add Movies in theater
    this.theater.add(theater);
  }

  public void removeMovieTheater(MovieTheater t){
    //Will make a post request to server to create a theater
    this.theater.remove(t);
  }

  public void addScreensOn(List<MovieTheater> ct, MovieScreen sc){
    for ( MovieTheater t : ct){
      if ( theater.contains(ct)){
        try {
          t.addScreen(sc);
        }
        catch (Exception e){

        }
      }
    }
  }

  @Override
  public boolean signUp(SignUpDetails details) {
    return false;
  }

  @Override
  public boolean verifyEmail(String verificationCode) {
    return false;
  }

  @Override
  public boolean verifyPhone(String verificationCode) {
    return false;
  }

  @Override
  public boolean signIn(SignInCredential credential) {
    return false;
  }

  @Override
  public boolean signInWithMobileOtp(String challengeId, String challenge) {
    return false;
  }

  @Override
  public String getCustomerId() {
    return id;
  }
}
