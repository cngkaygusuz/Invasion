package com.hackastory.app.utility;

import com.hackastory.app.modules.gamelogic.base.AbstractGameState;

import java.util.TreeMap;


public class ObjectContainer {
    public static TreeMap<String, Object> map;

    static {
        map = new TreeMap<String, Object>();
    }

    public static void put(String key, Object value) {
        map.put(key, value);
    }

    public static Object get(String key) {
        Object retval = map.get(key);
        map.remove(key);
        return retval;
    }
}
