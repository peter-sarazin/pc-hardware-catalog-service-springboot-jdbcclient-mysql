package dev.petersarazin.pc_hardware_catalog_service.service;

import dev.petersarazin.pc_hardware_catalog_service.model.Brand;
import dev.petersarazin.pc_hardware_catalog_service.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    private BrandRepository brandRepository;

    @Autowired
    BrandServiceImpl( BrandRepository brandRepository ) { this.brandRepository = brandRepository; }

    @Override
    public List<Brand> findAll() {
        return brandRepository.selectAll();
    }
}
