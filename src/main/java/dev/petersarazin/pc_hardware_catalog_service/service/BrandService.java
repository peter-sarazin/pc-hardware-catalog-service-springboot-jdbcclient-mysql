package dev.petersarazin.pc_hardware_catalog_service.service;

import dev.petersarazin.pc_hardware_catalog_service.model.Brand;
import java.util.List;

public interface BrandService {
    List<Brand> findAll();
}
