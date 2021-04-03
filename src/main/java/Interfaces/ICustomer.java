package Interfaces;


import objects.SignInCredential;
import objects.SignUpDetails;

public interface ICustomer {
  boolean signUp(SignUpDetails details);
  boolean verifyEmail(String verificationCode);
  boolean verifyPhone(String verificationCode);
  boolean signIn(SignInCredential credential);
  boolean signInWithMobileOtp(String challengeId, String challenge);
  String getCustomerId();

}
