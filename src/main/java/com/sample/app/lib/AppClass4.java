package com.sample.app.lib;

import com.sample.app.lib.AppClass2;
import com.sprung.core.annotations.AutoWired;
import com.sprung.core.annotations.SprungComponent;

@SprungComponent
public class AppClass4 {

    @AutoWired
    private AppClass2 appClass2;

    public String toString() {
        return "I autowired AppClass2 instance: " + appClass2.toString() + " inside AppClass4 instance";
    }
}
