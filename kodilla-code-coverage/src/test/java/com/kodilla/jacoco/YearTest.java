package com.kodilla.jacoco;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class YearTest {

    @Test
    public void shouldBeLeapYearIfDivisibleBy400() {
        //given
        Year year = new Year(1600);
        //when
        boolean isLeapYear = year.isLeap();
        //then
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldBeLeapYearIfDivisibleBy4ButNotBy100() {
        Year year = new Year(1504);
        boolean isLeapYear = year.isLeap();
        assertTrue(isLeapYear);
    }

    @Test
    public void shouldnotBeLeapYearIfNotDivisibleByEither100or4() {
        Year year = new Year(1673);
        boolean isLeapYear = year.isLeap();
        //then
        assertFalse(isLeapYear);
    }

    @Test
    public void shouldNotBeLeapYearIfDivisibleBy100ButNotBy400() {
        Year year = new Year(2100);
        boolean isLeapYear = year.isLeap();
        assertFalse(isLeapYear);
    }


}