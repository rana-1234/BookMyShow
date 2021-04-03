package Interfaces;

import objects.Owner;

public interface ITheater {
  boolean register();
  boolean deregister();
  String getId();
  Owner getOwnerWhoAdded();
}
