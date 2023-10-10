package com.sample.app.lib;

import com.sprung.core.annotations.AutoWired;
import com.sprung.core.annotations.Component;

@Component
public class AppClass4 {

    @AutoWired
    private AppClass2 appClass2;

    public String toString() {
        return "I autowired AppClass2 instance: " + appClass2.toString() + " inside AppClass4 instance";
    }
}
