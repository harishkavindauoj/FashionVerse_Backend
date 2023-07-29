package lk.ac.vau.FashionVerse.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import lk.ac.vau.FashionVerse.Model.CartItem;
import lk.ac.vau.FashionVerse.Model.Product;

@Service
public interface CartItemService {
    List<CartItem> getAllCartItems();
    CartItem getCartItemById(Long id);
    CartItem addToCart(Product product, int quantity);
    CartItem updateCartItem(Long id, int quantity);
    boolean removeCartItem(CartItem cartItem);
}
