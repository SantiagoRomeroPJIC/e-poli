package org.example.Epoli.repository;

import org.example.Epoli.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IProductoRepository extends JpaRepository<Producto, Integer> {

    @Query("SELECT p FROM Producto p JOIN FETCH p.usuario")
    List<Producto> findAllWithUsuario();
}
