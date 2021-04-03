package objects;

import Interfaces.ISeat;
import com.sun.istack.internal.NotNull;

public class MovieSeat implements ISeat {
  private String id;
  private double price;
  private String seatNumber;
  private MovieTheater movieTheater;
  private SeatStatus seatStatus;
  private MovieScreen movieScreen;

  public MovieSeat(@NotNull String id, @NotNull String seatNumber, double price, @NotNull MovieTheater movieTheater, SeatStatus status, @NotNull MovieScreen movieScreen){
    this.id = id;
    this.seatNumber = seatNumber;
    this.price = price;
    this.movieTheater = movieTheater;
    seatStatus = status;
    if( status == null){
      seatStatus = SeatStatus.EMPTY;
    }
    this.movieScreen = movieScreen;
  }

  @Override
  public double getSeatPrice() {
    return price;
  }

  @Override
  public boolean setSeatPrice(double price) {
    this.price = price;
    return true;
  }

  @Override
  public boolean setSeatStatus(SeatStatus status) {
    this.seatStatus = status;
    if ( status == null) {
      seatStatus = SeatStatus.EMPTY;
    }
    return true;
  }

  @Override
  public SeatStatus getSeatStatus() {
    return seatStatus;
  }

  @Override
  public String getSeatId() {
    return id;
  }

}
