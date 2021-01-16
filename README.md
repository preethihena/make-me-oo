So Shivam had just learned about OOP. He had written a program before that did two things,
- Find distance between two points
- Find direction (angle) between two points in Radians.

He has this code in the `org.procedural.DistanceAndDirectionCalculator` It looks like this for the reference - 

```java
public class DistanceAndDirectionCalculator {
    public static double distance(double x1, double y1, double x2, double y2) {
        double xDistance = x1 - x2;
        double yDistance = y1 - y2;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public static double direction(double x1, double y1, double x2, double y2) {
        double xDistance = x2 - x1;
        double yDistance = y2 - y1;
        return Math.atan2(yDistance, xDistance);
    }
}
```
He thought it'll be a good idea to convert this to Object Oriented Programming. So he wrote a new implementation in package `org.oop`, he got 2 classes - 
- `org.oop.DistanceAndDirectionCalculator`
- `org.oop.Point`

However, his trainer told him that what he did is not Object Oriented programming and asked Shivam to try again. 
- Try to articulate problems with Shivam's OOP solution. (Write it somewhere and share it with your trainer)
- Fork the project and fix the design related problem with Shivam's OOP solution. Share that with your trainer too.

------------------------------------------------------------------------------------
Problems with Shiva's OOPS solution:

-Shivam created "Point" class with out behaviours and "DistanceAndDirectionCalculator" class with out properties.It is a bad practice.
A class is complete only if it has both properties and behaviours.A class without properties is just procedural methods in class.
Encapsulation is not fulfilled because of this.

-Usage of setters and getters is a bad practice.

-Test methods are not written in AAA format.

-"Assertions.assertEquals" has made the code look clumsy, instead "Assertions" could have been imported.

-Fewer methods principle is not followed and intention is also not revealed.

-Static methods should not be used unless it is most needed.

-KISS (keep it Simple and stupid) is also not followed.

Solution:

It is best to encapsulate all methods and properties in "Point" class itself.


