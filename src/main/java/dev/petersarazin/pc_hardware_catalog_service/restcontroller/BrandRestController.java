package dev.petersarazin.pc_hardware_catalog_service.restcontroller;

import dev.petersarazin.pc_hardware_catalog_service.model.Brand;
import dev.petersarazin.pc_hardware_catalog_service.service.BrandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "/api/brand")
public class BrandRestController {
    Logger logger = LoggerFactory.getLogger( BrandRestController.class);

    private BrandService brandService;

    @Autowired
    public BrandRestController( BrandService brandService ) {
        this.brandService = brandService;
    }

    @GetMapping
    ResponseEntity<List<Brand>> findAll() {
        List<Brand> brandList = brandService.findAll();
        return new ResponseEntity<>( brandList, HttpStatus.OK );
    }

}
