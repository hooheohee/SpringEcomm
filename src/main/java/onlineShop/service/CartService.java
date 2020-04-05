package onlineShop.service;

import onlineShop.dao.CartDAO;
import onlineShop.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

    @Autowired
    private CartDAO cartDAO;

    public Cart getCartById(int cartId) {
        return cartDAO.getCartById(cartId);
    }
}
