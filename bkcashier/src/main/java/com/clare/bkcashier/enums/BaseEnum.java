package com.clare.bkcashier.enums;

import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;

public interface BaseEnum<K, V> extends Serializable {

    V desc() ;

    @JsonValue
    K getValue();

}


