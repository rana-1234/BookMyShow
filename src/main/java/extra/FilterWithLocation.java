package extra;

import com.sun.istack.internal.Nullable;
import objects.Location;

public class FilterWithLocation extends FilterWith{
  private Location location;
  public FilterWithLocation(@Nullable Location location){
    this.setLocation(location);
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }
}
