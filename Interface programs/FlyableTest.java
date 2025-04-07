interface Flyable {
 void fly_obj();
}
class Jet implements Flyable {
 public void fly_obj() {
 System.out.println("The Jet is flying at a speed of 1500 km/h.");
 }
}
class Plane implements Flyable {
 public void fly_obj() {
 System.out.println("The Plane is flying at a speed of 900 km/h.");
 }
}
class Chopper implements Flyable {
 public void fly_obj() {
 System.out.println("The Chopper is flying at a speed of 300 km/h.");
 }
}
public class FlyableTest {
 public static void main(String[] args) {
 Flyable jet = new Jet();
 Flyable plane = new Plane();
 Flyable chopper = new Chopper();
 jet.fly_obj();
 plane.fly_obj();
 chopper.fly_obj();
 }
}
