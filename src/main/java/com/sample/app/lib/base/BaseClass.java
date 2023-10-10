package com.sample.app.lib.base;

import com.sample.app.lib.AppClass2;
import com.sample.app.lib.base.utils.UtilsBaseClass;
import com.di.core.annotations.AutoWired;

public class BaseClass extends UtilsBaseClass {

    private int someBaseClassIntField = 50;

    @AutoWired
    protected AppClass2 appClass2;

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("BaseClass someIntField: " + this.someBaseClassIntField);
        return builder.toString();
    }

}
