package com.krafttech.steps_defs;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("\tThis is coming from Before method");
    }

    @After
    public void tearDown(){
        System.out.println("\tThis is coming from After method");
    }

    @Before ("@db")
    public void setUpDB(){
        System.out.println("\tConnecting DB");
    }
    @After ("@db")
    public void tearDownDB(){
        System.out.println("\tDisconnecting DB");
    }


}
