package com.myLanguage.data_structures.model;

public class Constant implements Symbol<String> {

    private String name;
    private String value;

    public Constant(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String getSymbolName() {
        return null;
    }

    @Override
    public String getSymbolType() {
        return "const";
    }

    @Override
    public String getSymbolValue() {
        return value;
    }


}
