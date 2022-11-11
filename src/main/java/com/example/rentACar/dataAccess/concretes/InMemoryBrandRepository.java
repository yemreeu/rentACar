package com.example.rentACar.dataAccess.concretes;

import com.example.rentACar.dataAccess.abstracts.BrandRepository;
import com.example.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryBrandRepository implements BrandRepository {

    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>();
        brands.add(new Brand(1,"BMW"));
        brands.add(new Brand(2,"Ford"));
        brands.add(new Brand(3,"Fiat"));
        brands.add(new Brand(4,"Audi"));
        brands.add(new Brand(5,"Mercedes"));
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
