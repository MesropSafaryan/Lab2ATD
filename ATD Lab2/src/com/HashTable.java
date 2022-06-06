package com;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ExecutionException;

public class HashTable {
    int key, val;
    Element[] list ;
    public void size(int size){
        list = new Element[size];
    }
    public boolean check(int key){
        for(int i = 0; i < list.length; i++){
            if(list[i] != null){
                if(list[i].getKey() == key){
                    return false;
                }
            }
        }
        return true;
    }
    public void addElement(Circle circle){
        Element element = new Element(circle);
        if(check(element.getKey()) == true){
            if(list[(int)(element.getKey() % 10)] == null){
                list[(int)(element.getKey() % 10)] = element;
            }
            else{
                for(int i = (int)(element.getKey() % 10); i < list.length; i++){
                    if(list[(int)(element.getKey() % 10)] == null)
                        list[element.getKey()] =  element;
                }
            }
        }
        else{
            int i = (int)(element.getKey() % 10);
            while(list[i] != null){
                i++;
            }
            list[i] = element;
        }
    }
    public Element[] getList(){
        return list;
    }
}
class Element{
    int key;
    Circle circle;
    public Element(Circle circle){
        this.circle = circle;
        circle.perimeterCircle();
        circle.areaCircle();
        key = (int)(circle.area * circle.perimeter);
    }
    public Element(Circle circle, int key){
        this.circle = circle;
        this.key = key;
    }
    public int getKey(){
        return key;
    }
    public Circle getCircle(){
        return circle;
    }
}
