package services.supplier;

import models.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.supplier.SupplierRepository;

@Service
public class UpdateSupplier {

    private SupplierRepository supplierRepository;

    @Autowired
    public UpdateSupplier(SupplierRepository supplierRepository){
        this.supplierRepository=supplierRepository;
    }

    public void execute(int supplierId, Supplier updatedSupplier){
        supplierRepository.update(supplierId,updatedSupplier);
    }
}
