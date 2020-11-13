package com.company;

public class PlaneService {
    //Task 1. (score 5)
    //Create function:
    //Parameter one Plane
    //Result: print all information of the plane
    public void PrintPlane(Plane p)
    {
        System.out.println(p.getCost());
        System.out.println(p.getCountry());
        System.out.println(p.getHours());
        System.out.println(p.getMilitary());
        System.out.println(p.getModel());
        System.out.println(p.getSeats());
        System.out.println(p.getTopSpeed());
        System.out.println(p.getWeight());
        System.out.println(p.getWingspan());
        System.out.println(p.getYear());

    }
    //Task 2. (score 5)
    //Create function:
   // Parameter one Plane
    //Result: print cost and topSpeed if the plane is military otherwise print model and country
    public void PrintPlane1 (Plane p){
        if(p.getMilitary()==true){
            System.out.println(p.getCost());
            System.out.println(p.getTopSpeed());
        }
        else{
            System.out.println(p.getModel());
            System.out.println(p.getCountry());
        }

    }
        // Task 3. (score 7)
       //Create function:
       // Parameter two Planes
       //Result: return the plane which one is newer (if they have the same age return first one).
    public Plane NewPlane(Plane plane1, Plane plane2){
        if(plane1.getYear()==plane2.getYear()){
            return plane1;
        }
        else if(plane1.getYear()<plane2.getYear()){
                return plane1;
        }
        else {
                return plane2;
        }

    }

    //Task 4. (score 7)
   // Create function:
   // Parameter two Planes
    //Result: return the model of the plane which has bigger wingspan (if they have the same - return second one).
    public Plane BiggerWingspanPlane (Plane plane1, Plane plane2){
        if(plane1.getWingspan()==plane2.getWingspan()){
            return plane2;
        }
        else if(plane1.getWingspan()>plane2.getWingspan()){
            return plane1;
        }
        else {
            return plane2;
        }

    }
    //Task 5. (score 7)
    //Create function:
   // Parameter three Planes
    //Result: print country of the plane with smallest seats count (if they have the same - print first).
    public void PrintPlaneCountry (Plane plane1, Plane plane2) {
        if (plane1.getSeats() == plane2.getSeats()) {
            System.out.println(plane1.getCountry());
        } else if (plane1.getSeats() < plane2.getSeats()) {
            System.out.println(plane1.getCountry());
        } else {
            System.out.println(plane2.getCountry());
        }
    }
    //Task 6. (score 7)
   // Create function:
    //Parameter array of Planes
    //Result: print all not military planes.
    public void NotMilitaryPlanes(Plane[] planes) {
        for (int i = 0; i < planes.length; i++) {
            if(planes[i].getMilitary() != true)
            {
                System.out.println(planes[i].getModel());
            }
        }
    }
    //Task 7. (score 10)
    //Create function:
    //Parameter array of Planes
    //Result: print all military planes which were in air more than 100 hours.
    public void MilitaryPlanes(Plane[] planes) {
        for (int i = 0; i < planes.length; i++) {
            if(planes[i].getMilitary() == true && planes[i].getHours()>100)
            {
                System.out.println(planes[i].getModel());
            }
        }
    }
}
