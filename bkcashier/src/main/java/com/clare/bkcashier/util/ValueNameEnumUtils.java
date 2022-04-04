package com.clare.bkcashier.util;

import com.clare.bkcashier.enums.BaseEnum;

public class ValueNameEnumUtils {

    private ValueNameEnumUtils() {
    }

    public static <E extends BaseEnum> E valueOf(Class<E> enumClass, String value) {
        E[] enumConstants = enumClass.getEnumConstants();
            for (E e : enumConstants) {
                if (e.getValue() == value) {
                return e;
                }
            }
                return null;
    }

}
