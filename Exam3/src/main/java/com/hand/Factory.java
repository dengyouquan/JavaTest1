package com.hand;

enum FactoryMethod{
    STREAM,CUSTOM;
}

public class Factory {
    public SortFactory getFactory(FactoryMethod name){
        if(name==FactoryMethod.STREAM){
            return StreamSortFactory.getInstance();
        }
        else if(name==FactoryMethod.CUSTOM){
            return TraditionSortFactory.getInstance();
        }
        return null;
    }
}
