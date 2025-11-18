package org.example.Epoli.repository;

import org.example.Epoli.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}