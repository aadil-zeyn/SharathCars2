package com.UST.SharathCars2.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
     @Id
    @GeneratedValue
    private int carid;
     private String carname;
     private String manyear;
     @ElementCollection
     private List<String> colors;
     private String model;
    @ElementCollection
      private List<String>accessories;
    @ElementCollection
     private List<String> payments;
    @ElementCollection
     private List<String> cities;

}
