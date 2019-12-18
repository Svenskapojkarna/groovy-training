package com.alhytone.service;

public interface IPersonService {
    default public void doSomething(){
        System.out.println("Do Something...");
    }
}
