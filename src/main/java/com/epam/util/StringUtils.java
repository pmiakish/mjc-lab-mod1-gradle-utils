package com.epam.util;

import org.apache.commons.lang3.math.NumberUtils;
import java.math.BigDecimal;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try {
            BigDecimal number = NumberUtils.createBigDecimal(str);
            return (number != null && number.compareTo(BigDecimal.ZERO) > 0);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return false;
        }
    }
}
