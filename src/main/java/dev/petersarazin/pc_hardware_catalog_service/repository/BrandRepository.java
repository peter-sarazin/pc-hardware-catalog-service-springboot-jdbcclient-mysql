package dev.petersarazin.pc_hardware_catalog_service.repository;

import dev.petersarazin.pc_hardware_catalog_service.model.Brand;

import java.util.List;

public interface BrandRepository {
    List<Brand> selectAll();
}
