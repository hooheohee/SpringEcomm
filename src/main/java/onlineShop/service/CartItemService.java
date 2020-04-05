
package onlineShop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onlineShop.dao.CartItemDAO;
import onlineShop.model.Cart;
import onlineShop.model.CartItem;

@Service
public class CartItemService {

    @Autowired
    private CartItemDAO cartItemDAO;

    public void addCartItem(CartItem cartItem) {
        cartItemDAO.addCartItem(cartItem);

    }

    public void removeCartItem(int cartItemId) {
        cartItemDAO.removeCartItem(cartItemId);
    }

    public void removeAllCartItems(Cart cart) {
        cartItemDAO.removeAllCartItems(cart);
    }
}
