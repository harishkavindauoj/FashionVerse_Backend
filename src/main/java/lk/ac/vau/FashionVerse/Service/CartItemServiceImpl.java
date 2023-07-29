package lk.ac.vau.FashionVerse.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import lk.ac.vau.FashionVerse.Model.CartItem;
import lk.ac.vau.FashionVerse.Model.Product;
import lk.ac.vau.FashionVerse.Repo.CartItemRepo;

@Service
public class CartItemServiceImpl implements CartItemService {

    private final CartItemRepo cartItemRepository;

    public CartItemServiceImpl(CartItemRepo cartItemRepository) {
        this.cartItemRepository = cartItemRepository;
    }

    @Override
    public List<CartItem> getAllCartItems() {
        return cartItemRepository.findAll();
    }

    @Override
    public CartItem getCartItemById(Long id) {
        return cartItemRepository.findById(id).orElse(null);
    }

    @Override
    public CartItem addToCart(Product product, int quantity) {
        CartItem cartItem = new CartItem(product, quantity);
        return cartItemRepository.save(cartItem);
    }

    @Override
    public CartItem updateCartItem(Long id, int quantity) {
        CartItem cartItem = cartItemRepository.findById(id).orElse(null);
        if (cartItem != null) {
            cartItem.setQuantity(quantity);
            return cartItemRepository.save(cartItem);
        }
        return null;
    }

    @Override
    public boolean removeCartItem(CartItem cartItem) {
        if (cartItem != null) {
            cartItemRepository.delete(cartItem);
            return true;
        }
        return false;
    }
}
