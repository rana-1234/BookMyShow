package objects;

import com.sun.istack.internal.NotNull;

public class SignUpDetails{
  private String emailId;
  private String phone;
  private Address address;

  public SignUpDetails(@NotNull String emailId, @NotNull String phone, Address address){
    this.setEmailId(emailId);
    this.setPhone(phone);
    this.setAddress(address);
  }


  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
}
