package objects;

import com.sun.istack.internal.NotNull;

public class SignInCredential{
  private String userName;
  private String password;
  public SignInCredential(@NotNull String userName , @NotNull String password){
    this.setUserName(userName);
    this.setPassword(password);
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
