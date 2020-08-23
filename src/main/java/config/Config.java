package config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repositories.supplier.*;

@Configuration
public class Config {

    @Value("jdbc:postgresql://localhost:5432/store_db")
    private String connection;

    @Bean
    public SupplierRepository supplierRepository(){
        return new SupplierRepositorySql(connection);
    }
}
