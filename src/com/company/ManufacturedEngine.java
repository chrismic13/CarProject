package com.company;

import java.util.Date;

public class ManufacturedEngine implements Engine{

  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  public ManufacturedEngine(){
    this.engineManufacturer = "Generic";
    this.engineManufacturedDate = new Date();
    this.engineMake = "Generic";
    this.engineModel = "Generic";
    this.engineCylinders = 0;
    this.engineType = "Generic";
    this.driveTrain = "Generic";
  }

  public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate, String engineMake, String engineModel, int engineCylinders, String engineType, String driveTrain){
    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
    this.driveTrain = driveTrain;
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }

  public String getEngineManufacturer() {
    return engineManufacturer;
  }

  public Date getEngineManufacturedDate() {
    return engineManufacturedDate;
  }

  public String getEngineMake() {
    return engineMake;
  }

  public String getEngineModel() {
    return engineModel;
  }

  public int getEngineCylinders() {
    return engineCylinders;
  }

  public String getEngineType() {
    return engineType;
  }

  public String getDriveTrain() {
    return driveTrain;
  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    this.engineManufacturedDate = date;
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.engineManufacturer = manufacturer;
  }

  @Override
  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  @Override
  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }

  @Override
  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }

  @Override
  public void setEngineType(String fuel) {
    this.engineType = fuel;
  }

  @Override
  public String toString(){
    return "Engine Manufacturer : "+engineManufacturer
        + "\nEngine Manufactured : "+engineManufacturedDate
        + "\nEngine Make : "+engineMake
        + "\nEngine Model : " +engineModel
        + "\nEngine Type : "+engineType
        + "\nEngine Cylinders : "+engineCylinders
        + "\nDrive Train : "+driveTrain;
  }
}
