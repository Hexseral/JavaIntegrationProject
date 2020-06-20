
/**
 * A class to demonstrate constructors, getters & setters.
 * 
 * @author Jordan Tatum
 *
 */
class Car {

  private String carMake;
  private String carModel;
  private int carTopSpeed;

  /**
   * An empty constructor to return objects with no Data.
   * 
   * @Car
   */
  public Car() {
    carMake = "Unkown Make";
    carModel = "Unkown Model";
    carTopSpeed = 0;
  }

  /**
   * A constructor to take in our Make, Model, and Top Speed.
   * 
   * @param make The cars Make.
   * @param model The cars Model.
   * @param topSpeed The cars Top Speed
   */
  public Car(String make, String model, int topSpeed) {

    carMake = make;
    carModel = model;
    carTopSpeed = topSpeed;
  }

  /** Getter.
   * @return returns car Make.
   */
  public String getCarMake() {
    return carMake;
  }

  /** Getter.
   * @return returns car Model.
   */
  public String getcarModel() {
    return carModel;
  }

  /** Getter.
   * @return returns car Top Speed.
   */
  public int getCarTopSpeed() {
    return carTopSpeed;
  }

  /** Setter.
   * @param carMake Sets Make.
   */
  public void setCarMake(String carMake) {
    this.carMake = carMake;
  }

  /** Setter.
   * @param carTopSpeed Sets Top Speed.
   */
  public void setcarTopSpeed(int carTopSpeed) {
    this.carTopSpeed = carTopSpeed;
  }

  /** Method to style ArrayList of Objects.
   * @toString Formats our output for our ArrayList.
   */
  public String toString() {
    return carMake + ", " + carModel + ", " + carTopSpeed + " Mph";
  }
}
