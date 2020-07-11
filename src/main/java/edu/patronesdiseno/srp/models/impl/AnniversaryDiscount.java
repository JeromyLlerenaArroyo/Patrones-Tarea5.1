package edu.patronesdiseno.srp.models.impl;

import edu.patronesdiseno.srp.models.interfaces.IDiscount;

public class AnniversaryDiscount implements IDiscount {

    private Double discount;
    private static AnniversaryDiscount instance = null;
    protected AnniversaryDiscount() {

        this.discount = 100.0;
    }

    public static AnniversaryDiscount getInstance() {
        if (instance == null) {
            instance = new AnniversaryDiscount();
        }

        return instance;
    }

    @Override
    public Double getDiscount() {
        
        return this.discount;
    }
    
}