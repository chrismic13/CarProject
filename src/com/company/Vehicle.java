package com.company;

import java.util.Date;

public class Vehicle implements Engine, Chassis {

  private Date vehicleManufacturedDate;
  private String vehicleManufacturer;
  private String vehicleMake;
  private String vehicleModel;
  private Chassis vehicleFrame;
  private String vehicleType;
  private String driveTrain;
  private ManufacturedEngine vehicleEngine;

  public Vehicle() {
    this.vehicleManufacturedDate = new Date();
    this.vehicleManufacturer = "Generic";
    this.vehicleMake = "Generic";
    this.vehicleModel = "Generic";
    this.vehicleFrame = new VehicleChassis();
    this.vehicleType = "Generic";
    this.driveTrain = "Generic";
    this.vehicleEngine = new ManufacturedEngine();
  }

  public Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer,
      String vehicleMake, String vehicleModel, Chassis vehicleFrame, String vehicleType,
      String driveTrain, ManufacturedEngine vehicleEngine) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.driveTrain = driveTrain;
    this.vehicleEngine = vehicleEngine;
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {

  }

  @Override
  public void setEngineManufacturedDate(Date date) {

  }

  @Override
  public void setEngineManufacturer(String manufacturer) {

  }

  @Override
  public void setEngineMake(String engineMake) {

  }

  @Override
  public void setEngineModel(String engineModel) {

  }

  @Override
  public void setDriveTrain(String driveTrain) {

  }

  @Override
  public void setEngineType(String fuel) {

  }

  public void setVehicleManufacturedDate(Date vehicleManufacturedDate) {
    this.vehicleManufacturedDate = vehicleManufacturedDate;
  }

  public void setVehicleManufacturer(String vehicleManufacturer) {
    this.vehicleManufacturer = vehicleManufacturer;
  }

  public void setVehicleMake(String vehicleMake) {
    this.vehicleMake = vehicleMake;
  }

  public void setVehicleModel(String vehicleModel) {
    this.vehicleModel = vehicleModel;
  }

  public void setVehicleFrame(Chassis vehicleFrame) {
    this.vehicleFrame = vehicleFrame;
  }

  public void setVehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
  }

  public void setVehicleEngine(ManufacturedEngine vehicleEngine) {
    this.vehicleEngine = vehicleEngine;
  }

  @Override
  public String getChassisType() {
    return null;
  }

  @Override
  public void setChassisType(String vehicleChassis) {

  }

  @Override
  public String toString(){
    return "Manufacturer Name : "+vehicleManufacturer
        + "\nManufactured Date : "+vehicleManufacturedDate
        + "\nVehicle Make : "+vehicleMake
        + "\nVehicle Model : "+vehicleModel
        + "\nVehicle Type : "+vehicleType
        + "\nEngine Manufacturer : "+vehicleEngine.getEngineManufacturer()
        + "\nEngine Manufactured : "+vehicleEngine.getEngineManufacturedDate()
        + "\nEngine Make : "+vehicleEngine.getEngineMake()
        + "\nEngine Model : "+vehicleEngine.getEngineModel()
        + "\nEngine Type : "+vehicleEngine.getEngineType()
        + "\nEngine Cylinders : "+vehicleEngine.getEngineCylinders()
        + "\nDrive Train : "+vehicleEngine.getDriveTrain();
  }
}
