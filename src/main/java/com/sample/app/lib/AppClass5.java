package com.sample.app.lib;

import com.di.core.annotations.AutoWired;
import com.di.core.annotations.Component;
import com.di.core.container.DisposableBean;
import com.di.core.container.InitializingBean;

@Component("AppClass5Bean")
public class AppClass5 implements InitializingBean, DisposableBean {

    private String classname = AppClass5.class.getCanonicalName();

    @AutoWired
    private AppClass2 appClass2;

    public String toString() {
        return "I autowired AppClass2 instance: " +
                appClass2.toString() + " inside " + classname + " instance";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Called afterPropertiesSet bean-lifecycle method from inside " +
                classname + " instance");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Called destroy bean-lifecycle method from inside " +
                classname + " instance");
    }
}
