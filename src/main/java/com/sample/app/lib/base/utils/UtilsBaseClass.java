package com.sample.app.lib.base.utils;

public class UtilsBaseClass {

    private int utilsBaseClassInt = 70;

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("utilsBaseClassInt: " + this.utilsBaseClassInt);
        return builder.toString();
    }
}
