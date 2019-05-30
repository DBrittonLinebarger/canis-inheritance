package edu.cnm.deepdive;

public abstract class Canis {

  public static final  int NUMBER_OF_LEGS = 4;

  private static int instancerCount = 0;

  public Canis() {
    instancerCount++;
  }

  public abstract void hunt();

  public static int getInstancerCount() {
    return instancerCount;
  }
}
