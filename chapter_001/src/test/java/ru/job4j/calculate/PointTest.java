package ru.job4j.calculate;

import org.hamcrest.core.Is;
import org.hamcrest.number.IsCloseTo;
import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {

    @Test

    public void whenHasTwoPointThenReturnDistance() {
        final Point first = new Point(0, 0);
        final Point second = new Point(3, 4);
        double result = first.distanceTo(second);
        assertThat(result, Is(5.0));
    }
}