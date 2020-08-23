package repositories.supplier;

import models.Supplier;
import org.sql2o.Sql2o;


public class SupplierRepositorySql implements SupplierRepository{

    private final Sql2o sql2o;

    private Sql2o sql2o(String connection){
        return new Sql2o(connection);
    }
    public SupplierRepositorySql(String connection){
        this.sql2o=sql2o(connection);
    }

    @Override
    public void add(Supplier supplier) {

    }

    @Override
    public void delete(int supplierId) {

    }

    @Override
    public void update(int supplierId, Supplier supplier) {

    }

    @Override
    public Supplier get(int supplierId) {
        return null;
    }
}
