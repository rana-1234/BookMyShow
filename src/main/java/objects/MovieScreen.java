package objects;

import com.sun.istack.internal.NotNull;
import exception.UnknownSeatStatusException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MovieScreen {

  private String id ;
  private MovieTheater movieTheater;
  private Movie movie;
  private Date startTime;
  private Date endTime;
  private List<MovieSeat> availableSeats, occupiedSeats, gettingBookedSeat;
  private List<MovieOffer> offers;

  public MovieScreen(@NotNull String id, @NotNull MovieTheater mt, @NotNull Movie m, @NotNull Date startTime , @NotNull Date endTime){
    this.setId(id);
    setMovieTheater(mt);
    setMovie(m);
    this.setStartTime(startTime);
    this.setEndTime(endTime);
    availableSeats = new ArrayList<>();
    occupiedSeats = new ArrayList<>();
    gettingBookedSeat = new ArrayList<>();
  }

  public boolean doesCollideWithScreen(MovieScreen ms){
    if ( this.startTime.getTime() > ms.getEndTime().getTime() || this.endTime.getTime() < ms.getStartTime().getTime()){
      return true;
    }
    return false;
  }

  public void addSeat(MovieSeat ms) throws UnknownSeatStatusException {
    if ( ms.getSeatStatus() == SeatStatus.EMPTY){
      availableSeats.add(ms);
    }
    else if ( ms.getSeatStatus() == SeatStatus.OCCUPIED){
      occupiedSeats.add(ms);
    }
    else if(ms.getSeatStatus() == SeatStatus.GETTING_BOOKED){
      gettingBookedSeat.add(ms);
    }
    else{
      throw new UnknownSeatStatusException("Seat status found " + ms.getSeatStatus() + " which is invalid (expected OCCUPIED or EMPTY)");
    }
  }

  public List<MovieSeat> getAvailableSeats(){
    return availableSeats;
  }

  public List<MovieSeat> getOccupiedSeats(){
    return occupiedSeats;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MovieTheater getMovieTheater() {
    return movieTheater;
  }

  public void setMovieTheater(MovieTheater movieTheater) {
    this.movieTheater = movieTheater;
  }

  public Movie getMovie() {
    return movie;
  }

  public void setMovie(Movie movie) {
    this.movie = movie;
  }

  public Date getStartTime() {
    return startTime;
  }

  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  public Date getEndTime() {
    return endTime;
  }

  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }
}
