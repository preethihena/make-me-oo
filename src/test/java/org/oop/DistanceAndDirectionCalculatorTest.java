package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DistanceAndDirectionCalculatorTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);

        double distanceBetweenSameCoordinates = origin.distance(origin);

        assertEquals(0, distanceBetweenSameCoordinates);
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(0, 1);

        double distanceFromOriginToPoint1 = origin.distance(point1);
        double distanceFromOriginToPoint2 = origin.distance(point2);

        assertEquals(1, distanceFromOriginToPoint1);
        assertEquals(1, distanceFromOriginToPoint2);
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);
        Point point2 = new Point(-1, 0);

        double distanceFromPoint1ToPoint2 = point1.distance(point2);

        assertEquals(2, distanceFromPoint1ToPoint2);
    }

    @Test
    void originAndPointOnPostiveXAxisShouldBeZeroRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(1, 0);
        Point point2 = new Point(3, 0);

        double directionBetweenOriginAndPoint1 = origin.direction(point1);
        double directionBetweenOriginAndPoint2 = origin.direction(point2);

        assertEquals(0, directionBetweenOriginAndPoint1);
        assertEquals(0, directionBetweenOriginAndPoint2);
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(-1, 0);
        Point point2 = new Point(-3, 0);

        double directionBetweenOriginAndPoint1 = origin.direction(point1);
        double directionBetweenOriginAndPoint2 = origin.direction(point2);

        assertEquals(Math.PI, directionBetweenOriginAndPoint1);
        assertEquals(Math.PI, directionBetweenOriginAndPoint2);
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);
        Point point1 = new Point(0, 1);
        Point point2 = new Point(0, 3);

        double directionBetweenOriginAndPoint1 = origin.direction(point1);
        double directionBetweenOriginAndPoint2 = origin.direction(point2);

        assertEquals(Math.PI / 2, directionBetweenOriginAndPoint1);
        assertEquals(Math.PI / 2, directionBetweenOriginAndPoint2);
    }
}
