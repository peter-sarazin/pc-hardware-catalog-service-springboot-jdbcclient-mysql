package dev.petersarazin.pc_hardware_catalog_service.repository;

import dev.petersarazin.pc_hardware_catalog_service.model.Brand;
import dev.petersarazin.pc_hardware_catalog_service.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BrandRepositoryImpl implements BrandRepository {

    private final JdbcClient jdbcClient;

    @Autowired
    BrandRepositoryImpl( JdbcClient jdbcClient ) { this.jdbcClient = jdbcClient; }

    @Override
    public List<Brand> selectAll() {
        String sql = "select * from brand";

        return jdbcClient.sql(sql)
                .query(Brand.class)
                .list();
    }
}
