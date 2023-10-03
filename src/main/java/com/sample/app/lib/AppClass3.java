package com.sample.app.lib;

import com.sample.app.lib.base2.BaseBaseClass;
import com.sprung.core.annotations.AutoWired;
import com.sprung.core.annotations.SprungComponent;

@SprungComponent
public class AppClass3 extends BaseBaseClass {

    private String className = this.getClass().getName();

    private int intvar = 0;
    private long longvar = 10l;
    private float floatvar = 1.0f;
    private boolean booleanvar = false;

    // @Configuration("xyz")
    private int propvalue = 0;

    @AutoWired
    private AppClass2 appClass2_instance2;

    public String toString() {
        return "intvar:" + intvar +
                "|longvar:" + longvar +
                "|floatvar:" + floatvar +
                "|boolvar:" + booleanvar +
                "|AppClass2 inside AppClass3:" + this.appClass2_instance2.toString();
    }

}
