package repositories.supplier;

import org.springframework.stereotype.Repository;
import models.Supplier;

@Repository
public interface SupplierRepository {
    void add(Supplier supplier);

    void delete(int supplierId);

    void update(int supplierId, Supplier supplier);

    Supplier get(int supplierId);
}