package com.company;

public class VehicleFrame implements Chassis{

  private String vehicleFrameType;

  public VehicleFrame(){
    this.vehicleFrameType = "Unibody";
  }

  public VehicleFrame(String vehicleFrameType){
    this.vehicleFrameType = vehicleFrameType;
  }

  @Override
  public String getChassisType() {
    return vehicleFrameType;
  }

  @Override
  public void setChassisType(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  @Override
  public String toString(){
    return "Chassis : "+chassis
        + "\nVehicle Frame : "+vehicleFrameType;
  }
}
