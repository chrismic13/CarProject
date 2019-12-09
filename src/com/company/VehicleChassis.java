package com.company;

public class VehicleChassis implements Chassis {

  private String chassisName;

  public VehicleChassis(){
    this.chassisName = Chassis.chassis;
  }
  public VehicleChassis(String chassisName){
    this.chassisName = chassisName;
  }

  @Override
  public String getChassisType() {
    return chassisName;
  }

  @Override
  public void setChassisType(String vehicleChassis) {
    this.chassisName = vehicleChassis;
  }

  @Override
  public String toString(){
    return "Chassis Name : "+chassisName;
  }
}
