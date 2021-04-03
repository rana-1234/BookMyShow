package objects;

import com.sun.istack.internal.NotNull;

public class Movie {

  private String id;
  private String movieName;
  private String shortVideoUrl;
  private String movieBannerUrl; // Everything in image
  private double ratingOutOf10;

  public Movie(@NotNull String id, @NotNull String movieName, @NotNull String movieBannerUrl, String shortVideoUrl, double ratingOutOf10){
    this.id = id;
    this.movieName = movieName;
    this.shortVideoUrl = shortVideoUrl;
    this.movieBannerUrl = movieBannerUrl;
    this.setRatingOutOf10(ratingOutOf10);

  }
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getMovieName() {
    return movieName;
  }

  public void setMovieName(String movieName) {
    this.movieName = movieName;
  }

  public String getShortVideoUrl() {
    return shortVideoUrl;
  }

  public void setShortVideoUrl(String shortVideoUrl) {
    this.shortVideoUrl = shortVideoUrl;
  }

  public String getMovieBannerUrl() {
    return movieBannerUrl;
  }

  public void setMovieBannerUrl(String movieBannerUrl) {
    this.movieBannerUrl = movieBannerUrl;
  }

  public double getRatingOutOf10() {
    return ratingOutOf10;
  }

  public void setRatingOutOf10(double ratingOutOf10) {
    this.ratingOutOf10 = ratingOutOf10;
  }
}
