package com.sample.app.lib;

import com.sprung.core.annotations.SprungComponent;
import com.sprung.core.annotations.Value;

@SprungComponent
public class AppClass2 {

    private String className = this.getClass().getName();

    @Value("some var that I annotated")
    private String somevar;

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("classname: " + className + "|");
        builder.append("somevar: " + this.somevar);
        return builder.toString();
    }

}
