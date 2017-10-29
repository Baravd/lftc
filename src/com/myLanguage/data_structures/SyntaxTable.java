package com.myLanguage.data_structures;

import java.util.HashMap;
import java.util.Map;

public class SyntaxTable {
    private Map<String, Integer> syntaxTable;

    public SyntaxTable() {
        syntaxTable = new HashMap<>();
        populateTable();
    }

    private void populateTable() {
    }

    private void put(String key, Integer value) {
        syntaxTable.put(key, value);
    }

    private Integer get(String key) {
        return syntaxTable.get(key);
    }
}
