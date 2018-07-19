package com.hand;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Factory factory = new Factory();
        System.out.println("传统："+factory.getFactory(FactoryMethod.CUSTOM).getList(50,100));
        System.out.println("流："+factory.getFactory(FactoryMethod.STREAM).getList(50,100));

    }


}
