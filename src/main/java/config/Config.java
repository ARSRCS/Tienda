package config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import repositories.supplier.*;

@Configuration
public class Config {

    @Value("${spring.datasource.url}")
    private String connection;

    @Bean
    public SupplierRepository supplierRepository(){
        return new SupplierRepositorySql(connection);
    }
}
