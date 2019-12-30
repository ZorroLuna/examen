package com.productos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
 
@Service
@Transactional
public class ProductService {
    @Autowired ProductRepository repo;
     
    public void save(Producto prod) {
        repo.save(prod);
    }
     
    public List<Producto> listAll() {
        return (List<Producto>) repo.findAll();
    }
     
    public Producto get(Long id) {
        return repo.findById(id).get();
    }
     
    public void delete(Long id) {
        repo.deleteById(id);
    }
    
    public List<Producto> search(String keyword) {
        return repo.search(keyword);
    }
     
}
