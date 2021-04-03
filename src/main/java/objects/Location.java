package objects;

import com.sun.istack.internal.NotNull;

public class Location {
  private String id;
  private String xCord;
  private String yCord;

  public Location(@NotNull String id, @NotNull String xCord, @NotNull String yCord){
    this.id = id;
    this.xCord = xCord;
    this.yCord = yCord;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getxCord() {
    return xCord;
  }

  public void setxCord(String xCord) {
    this.xCord = xCord;
  }

  public String getyCord() {
    return yCord;
  }

  public void setyCord(String yCord) {
    this.yCord = yCord;
  }
}
