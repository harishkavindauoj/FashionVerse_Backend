package lk.ac.vau.FashionVerse.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.ac.vau.FashionVerse.Model.CartItem;
import lk.ac.vau.FashionVerse.Model.Product;

import java.util.List;

@Repository
public interface CartItemRepo extends JpaRepository<CartItem, Long> {
    // Find all cart items
    List<CartItem> findAll();

    // Find cart item by id
    CartItem findById(long id);

    // Find cart items by product
    List<CartItem> findByProduct(Product product);

    // Find cart items with quantity greater than a given value
    List<CartItem> findByQuantityGreaterThan(int quantity);

    // Find cart items with quantity less than a given value
    List<CartItem> findByQuantityLessThan(int quantity);

    // Find cart items with quantity between two given values
    List<CartItem> findByQuantityBetween(int minQuantity, int maxQuantity);
}

