package org.example.Epoli.repository;

import org.example.Epoli.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IProductoRepository extends JpaRepository<Producto, Integer> {

    @Query(value = "SELECT p.* FROM productos p LEFT JOIN usuarios u ON p.usuario_id = u.id", nativeQuery = true)
    List<Producto> findAllWithUsuario();
}
