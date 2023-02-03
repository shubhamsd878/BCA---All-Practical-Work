// package _05_Abstract_class_and_methods;
abstract class MotorBike {
abstract void brake();
}

class SportsBike extends MotorBike {

// implementation of abstract method
public void brake() {
System.out.println("SportsBike Brake");
}
}

class MountainBike extends MotorBike {

// implementation of abstract method
public void brake() {
System.out.println("MountainBike Brake");
}
}

public class _02_abstract_method {
public static void main(String[] args) {
MountainBike obj1 = new MountainBike();
obj1.brake();
SportsBike obj2 = new SportsBike();
obj2.brake();
}
}
