package com.sample.app;

import com.sample.app.lib.AppClass1;
import com.sample.app.lib.AppClass3;
import com.sprung.core.SprungApplication;
import com.sprung.core.annotations.SprungComponentScan;
import com.sprung.core.runners.CommandLineRunner;

import java.io.IOException;

@SprungComponentScan(pkg = "com.sample.app.lib")
public class Main extends CommandLineRunner {

    public static void main(String[] args) throws IOException {
        SprungApplication.run(Main.class, args);
    }

    @Override
    public void run(String[] args) throws Exception {
        System.out.println("Executing main class.....");
        System.out.println("Dumping Container Classes.....");
        System.out.println(SprungApplication.getSprungContainer().toString());
        AppClass1 appClass1 = (AppClass1) SprungApplication.getSprungContainer().getObject(
                "com.sample.app.lib.AppClass1");
        System.out.println("I got an autowired class inside the container...." + appClass1.toString());
        AppClass3 appClass3 = (AppClass3) SprungApplication.getSprungContainer().
                getObject("com.sample.app.lib.AppClass3");
        System.out.println(appClass3.toString());
    }

}
