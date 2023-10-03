package com.sample.app.lib;

import com.sample.app.lib.base.BaseClass;
import com.sprung.core.annotations.SprungComponent;

@SprungComponent
public class AppClass1 extends BaseClass {

    private String className = this.getClass().getName();

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(className + "\n");
        builder.append(super.toString() + "\n");
        if(this.appClass2 != null) {
            builder.append("AppClass2 Inside AppClass1: " + this.appClass2);
        } else {
            builder.append("AppClass2 was not auto-wired");
        }
        return builder.toString();
    }

}
