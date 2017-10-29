package com.myLanguage.data_structures.model;

public class Variable implements Symbol<String> {
    private String name;
    private String value;
    private String type;

    @Override
    public String getSymbolName() {
        return name;
    }

    @Override
    public String getSymbolType() {
        return type;
    }

    @Override
    public String getSymbolValue() {
        return value;
    }
}
