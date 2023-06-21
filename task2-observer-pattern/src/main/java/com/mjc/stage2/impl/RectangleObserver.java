package com.mjc.stage2.impl;

import com.mjc.stage2.Observer;
import com.mjc.stage2.entity.Rectangle;
import com.mjc.stage2.entity.RectangleValues;
import com.mjc.stage2.event.RectangleEvent;
import com.mjc.stage2.warehouse.RectangleWarehouse;

public class RectangleObserver implements Observer {
    @Override
    public void handleEvent(RectangleEvent event) {
Rectangle rect = event.getSource();
double sideA = rect.getSideA();
double sideB = rect.getSideB();
        RectangleWarehouse ware = RectangleWarehouse.getInstance();
        ware.put(rect.getId(),new RectangleValues(sideB*sideA,2*(sideA+sideB)));
    }
    // Write your code here!
}
