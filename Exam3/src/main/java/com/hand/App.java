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
        System.out.println("传统："+TraditionSortFactory.getInstance().getList(50,100));
        System.out.println("流："+StreamSortFactory.getInstance().getList(50,100));

    }


}
