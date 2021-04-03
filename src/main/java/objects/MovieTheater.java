package objects;

import Interfaces.ITheater;
import com.sun.istack.internal.NotNull;
import exception.MovieNotAddedException;
import exception.MovieNotFoundException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MovieTheater implements ITheater {
  private List<MovieScreen> screens;
  private String id;
  private Owner owner;
  private boolean registered ;
  private Date allowedEndTime;
  private MovieTheaterInfo movieInfo;
  private Location location;
  private Address address;
  private MovieTheaterStatus status;

  public MovieTheater(@NotNull String id, @NotNull Owner owner , Date allowedEndTime, MovieTheaterInfo info, @NotNull Location location , @NotNull Address address, MovieTheaterStatus status){
    this.id = id;
    this.setOwner(owner);
    setScreens(new ArrayList<>());
    setRegistered(false);
    this.setAllowedEndTime(allowedEndTime);
    if ( allowedEndTime == null){
      this.setAllowedEndTime(null);// Set here 9 pm
    }// Get time till 8 PM here by default
    this.setAddress(address);
    this.setLocation(location);
    movieInfo = info;
    this.status = status;
    if( status == null){
      this.status = MovieTheaterStatus.IDLE;
    }
  }

  public void addScreen(MovieScreen sc) throws MovieNotAddedException {
    //Check here if this screen can be added or not
    //Conditions:
      /*
        Screen.startTime > currentTime
        Screen.endTime <= allowedEndTime
        There should not be any colliding screen already present
       */
    if ( status == MovieTheaterStatus.UNDER_MAINTENANCE){
      throw new MovieNotAddedException("Movie can't be added as theater is under maintenance");
    }

    if (possible(sc)){
      getScreens().add(sc);
    }
    throw new MovieNotAddedException("Movie can't be added since some movie is already playing or not allowed for this interval");
  }

  public boolean removeScreen (MovieScreen ms) throws MovieNotFoundException{
    if ( getScreens().contains(ms)){
      getScreens().remove(ms);
      return true;
    }
    else{
      throw new MovieNotFoundException("The given Screen Not found in current theater");
    }
  }

  private boolean possible(MovieScreen sc){
    long currentTime = new Date().getTime();
    if ( currentTime < sc.getStartTime().getTime()){
      return false;
    }
    if ( getAllowedEndTime().getTime() < sc.getEndTime().getTime()){
      return false;
    }

    for (MovieScreen ms : getScreens()){
      if ( ms.doesCollideWithScreen(sc)){
          return false;
      }
    }
    return true;
  }

  @Override
  public boolean register(){
    //Register here the theater against owner info
    setRegistered(true);
    return true;
  }

  @Override
  public boolean deregister() {
    //Deregister here the theater against owner info
    setRegistered(false);
    return true;
  }

  @Override
  public String getId() {
    return id;
  }

  @Override
  public Owner getOwnerWhoAdded() {
    return getOwner();
  }

  public List<MovieScreen> getScreens() {
    return screens;
  }

  public void setScreens(List<MovieScreen> screens) {
    this.screens = screens;
  }

  public Owner getOwner() {
    return owner;
  }

  public void setOwner(Owner owner) {
    this.owner = owner;
  }

  public boolean isRegistered() {
    return registered;
  }

  public void setRegistered(boolean registered) {
    this.registered = registered;
  }

  public Date getAllowedEndTime() {
    return allowedEndTime;
  }

  public void setAllowedEndTime(Date allowedEndTime) {
    this.allowedEndTime = allowedEndTime;
  }

  public MovieTheaterInfo getMovieInfo() {
    return movieInfo;
  }

  public void setMovieInfo(MovieTheaterInfo movieInfo) {
    this.movieInfo = movieInfo;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public MovieTheaterStatus getMovieTheaterStatus(){
    return status;
  }
  public void setMovieTheaterStatus(MovieTheaterStatus ms){
    status = ms;
  }
}
