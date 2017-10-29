package com.myLanguage.data_structures;

import com.myLanguage.data_structures.model.Symbol;

import java.util.Set;
import java.util.TreeMap;

public class SymbolTable {
    private TreeMap<Symbol<String>, Integer> symbolTreeMap;//symbol and codeTS

    public SymbolTable() {
        symbolTreeMap = new TreeMap<>();
    }
    public void put(Symbol<String> symbol,Integer code ) {
        symbolTreeMap.put(symbol,code);
    }
    public Integer getValue(Symbol<String> symbol) {
        return symbolTreeMap.get(symbol);
    }
    public Set<Symbol<String>> getKeys() {
        return symbolTreeMap.keySet();
    }

}
