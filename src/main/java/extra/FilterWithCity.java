package extra;

import com.sun.istack.internal.NotNull;

public class FilterWithCity extends  FilterWith{
  private String cityName;
  public FilterWithCity(@NotNull String cityName){
    this.setCityName(cityName);
  }

  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }
}

