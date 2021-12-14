/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.C4G16.Reto3.interfaces;

import com.C4G16.Reto3.model.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author edgarchaparro
 */
public interface OrderInterface extends MongoRepository<Order, Integer> {
    
        Optional<Order> findTopByOrderByIdDesc();
        List<Order> findBySalesManZone(String zone);
        List<Order> findBySalesManId(Integer id);
        
    
}
