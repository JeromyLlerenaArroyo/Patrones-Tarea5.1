package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.HighEndLineProduct;
import edu.patronesdiseno.srp.models.LineProduct;
import edu.patronesdiseno.srp.models.Maintenance;
import edu.patronesdiseno.srp.models.PremiumMaintenance;
import edu.patronesdiseno.srp.models.ConditionProduct;
import edu.patronesdiseno.srp.models.GoodCondition;

public class HighProductFactory implements IProductFactory {

    @Override
    public LineProduct getLineProduct() {
        
        return new HighEndLineProduct();
    }

    @Override
    public Maintenance getMaintenance() {
        
        return new PremiumMaintenance();
    }

    @Override
    public ConditionProduct getConditionProduct() {
        return new GoodCondition();
    }
}