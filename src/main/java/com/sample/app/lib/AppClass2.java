package com.sample.app.lib;

import com.sprung.core.annotations.SprungComponent;

@SprungComponent
public class AppClass2 {

    private String className = this.getClass().getName();

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(className);
        return builder.toString();
    }

}
