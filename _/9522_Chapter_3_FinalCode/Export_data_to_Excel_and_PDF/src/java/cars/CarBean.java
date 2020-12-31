package cars;

public class CarBean {

  private Integer carNumber;
  private String carName;

  public CarBean() {}

  public CarBean(Integer carNumber, String carName){
      this.carNumber=carNumber;
      this.carName=carName;
  }

  public Integer getCarNumber(){
      return this.carNumber;
  }

  public void setCarNumber(Integer carNumber){
      this.carNumber=carNumber;
  }

  public String getCarName(){
      return this.carName;
  }

  public void setCarName(String carName){
      this.carName=carName;
  }   
}

