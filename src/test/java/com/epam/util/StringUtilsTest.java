package com.epam.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class StringUtilsTest {

    @Test
    public void testPositiveNumber() {
        assertTrue(StringUtils.isPositiveNumber("0.00000000000000001"));
        assertTrue(StringUtils.isPositiveNumber("+1"));
    }

    @Test
    public void testNegativeNumber() {
        assertFalse(StringUtils.isPositiveNumber("-0.00000000000000001"));
        assertFalse(StringUtils.isPositiveNumber("-1"));
    }

    @Test
    public void testZero() {
        assertFalse(StringUtils.isPositiveNumber("-0.000"));
        assertFalse(StringUtils.isPositiveNumber("+0.000"));
        assertFalse(StringUtils.isPositiveNumber("0.000"));
        assertFalse(StringUtils.isPositiveNumber("0"));
    }

    @Test
    public void testIncorrectNumber() {
        assertFalse(StringUtils.isPositiveNumber("0 00000000000000001"));
        assertFalse(StringUtils.isPositiveNumber("e1"));
        assertFalse(StringUtils.isPositiveNumber("NotANumber"));
    }
}
