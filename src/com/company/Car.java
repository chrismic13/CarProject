package com.company;

import java.util.Date;

public class Car extends Vehicle {

  private Feature[] feature = new Feature[10];
  private int carAxle;

  public Car(){
    super();
    carAxle = 2;
  }

  public Car(Date vehicleManufacturedDate, String vehicleManufacturer,
      String vehicleMake, String vehicleModel, Chassis vehicleFrame, String vehicleType,
      String driveTrain, ManufacturedEngine vehicleEngine, Feature[] feature, int carAxle){
    super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake, vehicleModel, vehicleFrame, vehicleType,
        driveTrain, vehicleEngine);
    this.feature = feature;
    this.carAxle = carAxle;
  }

  public String getInteriorFeatures(Feature[] feature){
    String intFeats = "";
    for(Feature f : feature){
      if(f instanceof InteriorFeature){
        intFeats += f.toString();
      }
    }
    if(intFeats.isEmpty()){
      intFeats += "Interior [No Interior Features]\n";
    }
    return intFeats;
  }
  public String getExteriorFeatures(Feature[] feature){
    String extFeats = "";
    for(Feature f : feature) {
      if (f instanceof ExteriorFeature) {
        extFeats += f.toString();
      }
    }
    if(extFeats.isEmpty()){
      extFeats += "Exterior [No Exterior Features]\n";
    }
    return extFeats;
  }

  @Override
  public String toString(){
    return super.toString()+"\nFeatures : \n"+getInteriorFeatures(feature)+getExteriorFeatures(feature)+"Car Axle : "+carAxle;
  }

}
