package com.sample.app.lib;

import com.sample.app.lib.base2.BaseBaseClass;
import com.di.core.annotations.AutoWired;
import com.di.core.annotations.Component;
import com.di.core.annotations.Value;

@Component
public class AppClass3 extends BaseBaseClass {

    private String className = this.getClass().getName();

    private int intvar;
    private long longvar = 10l;
    private float floatvar = 1.0f;
    private boolean booleanvar = false;

    @Value("sampletestvalue")
    private String propvalue = "";

    @Value("10")
    private String someothervalue = "";

    @AutoWired
    private AppClass2 appClass2_instance2;

    public String toString() {
        return "intvar:" + intvar +
                "|longvar:" + longvar +
                "|floatvar:" + floatvar +
                "|boolvar:" + booleanvar +
                "|propvalue:" + propvalue +
                "|someothervalue:" + someothervalue +
                "|AppClass2 inside AppClass3:" + this.appClass2_instance2.toString();
    }

}
