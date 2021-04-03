package objects;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

public class MovieTicket {

  //Properties a movie ticket should have
  private String id;
  private Movie movie;
  private Customer customer; // This ticket belongs to this customer
  private String qrImageUrl; //QR url image on this ticket, which can be scanned and verified
  private String barCodeUrl; //Bar code image url of this ticket
  private MovieSeat movieSeat; // Seat Details on ticket
  private MovieScreen movieScreen; // Movie Screen of the ticket

  public MovieTicket(@NotNull String id, @NotNull Movie movie , @NotNull Customer customer , @Nullable String qrImageUrl , @Nullable String barCodeUrl, @NotNull MovieSeat movieSeat, @NotNull MovieScreen movieScreen) {
    this.id = id;
    this.movie = movie;
    this.customer = customer;
    this.qrImageUrl = qrImageUrl;
    this.barCodeUrl = barCodeUrl;
    this.movieSeat = movieSeat;
    this.movieScreen = movieScreen;
  }

  //Accessors
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Movie getMovie() {
    return movie;
  }

  public void setMovie(Movie movie) {
    this.movie = movie;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public String getQrImageUrl() {
    return qrImageUrl;
  }

  public void setQrImageUrl(String qrImageUrl) {
    this.qrImageUrl = qrImageUrl;
  }

  public MovieSeat getMovieSeat() {
    return movieSeat;
  }

  public void setMovieSeat(MovieSeat movieSeat) {
    this.movieSeat = movieSeat;
  }

  public String getBarCodeUrl() {
    return barCodeUrl;
  }

  public void setBarCodeUrl(String barCodeUrl) {
    this.barCodeUrl = barCodeUrl;
  }

  public MovieScreen getMovieScreen() {
    return movieScreen;
  }

  public void setMovieScreen(MovieScreen movieScreen) {
    this.movieScreen = movieScreen;
  }
}
