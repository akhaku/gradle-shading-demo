package com.akhaku.mylibrary;

import mylibrary.shading.curator2.org.apache.curator.framework.CuratorFramework;

public class MyLibrary {
    public static void main(String[] args) {
        System.out.println("This is how we import our shaded class: " + CuratorFramework.class.getName());
    }
}
