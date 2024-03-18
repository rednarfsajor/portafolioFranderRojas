package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;

public interface ProductoService {

    public List<Producto> getProductos(boolean activo);

    public Producto getProducto(Producto producto);
    
    public void save(Producto producto);
    
    public void delete(Producto producto);
}
