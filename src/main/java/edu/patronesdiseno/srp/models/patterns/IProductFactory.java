package edu.patronesdiseno.srp.models.patterns;

import edu.patronesdiseno.srp.models.LineProduct;
import edu.patronesdiseno.srp.models.Maintenance;
import edu.patronesdiseno.srp.models.ConditionProduct;

public interface IProductFactory {

    public LineProduct getLineProduct();

    public Maintenance getMaintenance();

    public ConditionProduct getConditionProduct(); // Cambio propuesto
}