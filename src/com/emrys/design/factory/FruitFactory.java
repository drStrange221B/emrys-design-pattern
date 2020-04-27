package com.emrys.design.factory;

public class FruitFactory {

    public Fruits getFruits(String fruit)
    {
        if(fruit.trim().equalsIgnoreCase("apple"))
        {
            return new Apple();
        }else if(fruit.trim().equalsIgnoreCase("banana")){
            return new Banana();
        }else if(fruit.trim().equalsIgnoreCase("Grapes")){
            return new Grapes();
        }else if(fruit.trim().equalsIgnoreCase("orange"))
        {
            return new Grapes();
        }else
            return null;
    }

}
