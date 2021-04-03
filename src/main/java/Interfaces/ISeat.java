package Interfaces;

import objects.SeatStatus;

public interface ISeat {

  double getSeatPrice();
  boolean setSeatPrice(double price);
  boolean setSeatStatus(SeatStatus status);
  SeatStatus getSeatStatus();
  String getSeatId();
}
