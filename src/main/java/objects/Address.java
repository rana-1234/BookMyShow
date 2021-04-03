package objects;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

enum AddressType{
  PERMANENT,
  CURRENT
}

class Address{
  private String doorAddress;
  private String postalCode;
  private String country;
  private String state;
  private String city;
  private AddressType type;

  public Address(@Nullable String doorAddress, @NotNull String postalCode , @NotNull String country, @NotNull String state, @NotNull String city, @Nullable AddressType type){
    this.setDoorAddress(doorAddress);
    this.setPostalCode(postalCode);
    this.setCountry(country);
    this.setState(state);
    this.setCity(city);
    if (type == null){
      this.setType(AddressType.CURRENT);
    }
    else{
      this.setType(type);
    }
  }


  public String getDoorAddress() {
    return doorAddress;
  }

  public void setDoorAddress(String doorAddress) {
    this.doorAddress = doorAddress;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public AddressType getType() {
    return type;
  }

  public void setType(AddressType type) {
    this.type = type;
  }
}
