package com.myLanguage.data_structures.model;

public interface Symbol<T> {
    String getSymbolName();
    String getSymbolType();
    T getSymbolValue();
}
