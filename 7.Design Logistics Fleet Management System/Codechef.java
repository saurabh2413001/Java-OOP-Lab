import java.util.*;

// ================= DELIVERY PARTNER =================
/*
Responsibilities:
- Represent generic delivery behavior
*/

/*
Complete interface declaration using proper keyword
*/
interface DeliveryPartner {

    /*
    Complete method declaration:

    - return type should allow no return value
    - method name should be deliver
    - parameter datatype should store text data and name should be `packageName`
    */
    void deliver(String packageName);
}


// ================= BIKE PARTNER =================
/*
Responsibilities:
- Deliver packages using bike
*/

/*
Complete class declaration:
- use proper keyword for interface implementation
- implement DeliveryPartner interface properly
*/
class BikePartner implements DeliveryPartner {

    /*
    Complete implementation details:
    - override deliver() method properly

    Print exact format:

    Bike Partner delivered package: Mobile Phone
    */
    @Override
    public void deliver(String packageName) {
        System.out.println("Bike Partner delivered package: " + packageName);
    }
}


// ================= TRUCK PARTNER =================
/*
Responsibilities:
- Deliver packages using truck
*/

/*
Complete class declaration:
- use proper keyword for interface implementation
- implement DeliveryPartner interface properly
*/
class TruckPartner implements DeliveryPartner {

    /*
    Complete implementation details:
    - override deliver() method properly

    Print exact format:

    Truck Partner delivered package: Washing Machine
    */
    @Override
    public void deliver(String packageName) {
        System.out.println("Truck Partner delivered package: " + packageName);
    }
}


// ================= DRONE PARTNER =================
/*
Responsibilities:
- Deliver packages using drone
*/

/*
Complete class declaration:
- use proper keyword for interface implementation
- implement DeliveryPartner interface properly
*/
class DronePartner implements DeliveryPartner {

    /*
    Complete implementation details:
    - override deliver() method properly

    Print exact format:

    Drone Partner delivered package: Medicine Box
    */
    @Override
    public void deliver(String packageName) {
        System.out.println("Drone Partner delivered package: " + packageName);
    }
}


// ================= DELIVERY SERVICE =================
/*
Responsibilities:
- Coordinate delivery workflow
- Delegate delivery execution
*/
class DeliveryService {

    /*
    Execute delivery workflow

    Flow:
    1. receive delivery partner abstraction
    2. delegate delivery responsibility

    Important:
    - avoid partner-specific conditions
    - use abstraction and polymorphism

    Parameters:
    - partner should support DeliveryPartner abstraction
    - packageName should store delivery package name
    */
    public void processDelivery(DeliveryPartner partner, String packageName) {
            partner.deliver(packageName);
    }
}


// ================= MAIN =================
public class Codechef {

    public static void main(String[] args) {

        DeliveryService service = new DeliveryService();

        DeliveryPartner bike = new BikePartner();

        DeliveryPartner truck = new TruckPartner();

        DeliveryPartner drone = new DronePartner();

        service.processDelivery(bike, "Mobile Phone");

        service.processDelivery(truck, "Washing Machine");

        service.processDelivery(drone, "Medicine Box");
    }
}