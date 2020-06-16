
 class Car {
  
  private String carMake;
  private String carModel;
  private int carTopSpeed;
  
  public Car() {
   carMake = "Unknown Make";
   carModel = "Unknown Model";
   carTopSpeed = 0;
 }
  
  public Car(String make, String model, int topSpeed) {
    
    carMake = make;
    carModel = model;
    carTopSpeed = topSpeed;
  }

  public String getCarMake() {
    return carMake;
  }
  
  public String getcarModel() {
    return carModel;
  }
  public int getCarTopSpeed() {
    return carTopSpeed;
  }
  public void setCarMake(String carMake) {
    this.carMake = carMake;
  }
  public void setcarTopSpeed(int carTopSpeed) {
    this.carTopSpeed = carTopSpeed;
  }
  
}
