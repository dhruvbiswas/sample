package com.sample.app.lib.base2;

import com.sample.app.lib.AppClass2;
import com.sample.app.lib.base.BaseClass;
import com.sample.app.lib.base.utils.UtilsBaseClass;
import com.sprung.core.annotations.AutoWired;

public class BaseBaseClass extends BaseClass {

    private int someBaseClassIntField = 70;

    @AutoWired
    protected AppClass2 appClass2;

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("BaseBaseClass someIntField: " + this.someBaseClassIntField + "|");
        builder.append("AppClass2: " + this.appClass2.toString());
        return builder.toString();
    }

}
