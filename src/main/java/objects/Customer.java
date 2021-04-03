package objects;

import Interfaces.ICustomer;
import com.sun.istack.internal.NotNull;
import extra.FilterWith;
import extra.FilterWithCity;
import extra.FilterWithLocation;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class Customer implements ICustomer {
  private String id;
  private List<MovieTicket> tickets;

  public Customer(@NotNull String id){
    this.id = id;
    tickets = new ArrayList<>();
  }

  public List<MovieTheater> listMoviesAroundMe(List<FilterWith> filers){
    List<MovieTheater> movieTheaters= new ArrayList<>();
    //Apply the filter criteria here
    for ( FilterWith f : filers){
      if ( f instanceof FilterWithCity){
        FilterWithCity fCity = (FilterWithCity) f;
        movieTheaters.stream().filter(new Predicate<MovieTheater>() {
          @Override
          public boolean test(MovieTheater movieTheater) {
            for (MovieScreen sc : movieTheater.getScreens()){
              if ( sc.getMovie().getMovieName() == fCity.getCityName()){
                return true;
              }
            }
            return false;
          }
        });
      }
      else if ( f instanceof FilterWithLocation){
        FilterWithLocation fLocation = (FilterWithLocation) f;
        movieTheaters.stream().filter(new Predicate<MovieTheater>() {
          @Override
          public boolean test(MovieTheater movieTheater) {
            if(movieTheater.getLocation() == fLocation.getLocation()){
              return true;
            }
            return false;
          }
        });
      }
    }
    return movieTheaters;
  }

  public boolean bookSeat(MovieScreen sc, MovieSeat seat){
    seat.setSeatStatus(SeatStatus.GETTING_BOOKED);
    try {
      sc.addSeat(seat);
    }
    catch (Exception e){

    }
    //Redirect Customer to Payment Page and after confirmation, change the seat status and accordingly.
    //At the end it will get an ticket assigned to this seat
    //Add that into tickets of customer
    tickets.add(
      new MovieTicket(
        "id1",
         new Movie("movie1", "CODING", "https://google.com/imaages?id=1", null , 10.0),
        this,
        null,
        null,
        seat,
        sc
        )
    );
    return true;
  }

  public boolean cancelTicket(){
    //Check if this ticket can be cancelled or not
    //Keep the service charges, undo the offers, and refund the same amount with PG
    return false;
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
