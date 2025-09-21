package com.ndk.lldpractice.problems;

import java.util.LinkedHashMap;

public class LRUCache {

    private LinkedHashMap<String, String> cache = new LinkedHashMap<>();

    public String get(String key) {
        return cache.get(key);
    }

    public void put(String key, String value) {
    }

    public static void main(String[] args) {

    }
}
