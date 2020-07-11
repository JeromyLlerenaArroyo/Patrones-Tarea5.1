package edu.patronesdiseno.srp.models.impl;

import edu.patronesdiseno.srp.models.interfaces.IDiscount;

public class CouponDiscount implements IDiscount    {

    private Double discount;
    private static CouponDiscount instance = null;
    protected CouponDiscount() {

        this.discount = 50.0;
    }

    public static CouponDiscount getInstance() {
        if (instance == null) {
            instance = new CouponDiscount();
        }

        return instance;
    }

    @Override
    public Double getDiscount() {
        
        return this.discount;
    }

    
}