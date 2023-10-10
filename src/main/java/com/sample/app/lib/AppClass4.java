package com.sample.app.lib;

import com.sprung.core.annotations.AutoWired;
import com.sprung.core.annotations.Component;
import com.sprung.core.container.DisposableBean;
import com.sprung.core.container.InitializingBean;

@Component
public class AppClass4 implements InitializingBean, DisposableBean {

    @AutoWired
    private AppClass2 appClass2;

    public String toString() {
        return "I autowired AppClass2 instance: " + appClass2.toString() + " inside AppClass4 instance";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Called afterPropertiesSet bean-lifecycle method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Called destroy bean-lifecycle method");
    }
}
