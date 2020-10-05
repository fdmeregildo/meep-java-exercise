package com.meep.exercise.bean;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Resource implements Serializable {

    private String id;
    private String name;
    private Integer x;
    private Integer y;
    private String licencePlate;
    private Integer range;
    private Integer batteryLevel;
    private Integer seats;
    private String model;
    private String resourceImageId;
    private Boolean realTimeData;
    private String resourceType;
    private Integer companyZoneId;

    @Override
    public String toString() {
        return "Resource{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", licencePlate='" + licencePlate + '\'' +
                ", range=" + range +
                ", batteryLevel=" + batteryLevel +
                ", seats=" + seats +
                ", model='" + model + '\'' +
                ", resourceImageId='" + resourceImageId + '\'' +
                ", realTimeData=" + realTimeData +
                ", resourceType='" + resourceType + '\'' +
                ", companyZoneId=" + companyZoneId +
                '}';
    }
}
