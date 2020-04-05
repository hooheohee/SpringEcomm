package onlineShop.service;

import onlineShop.dao.SalesOrderDAO;
import onlineShop.model.SalesOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesOrderService {

    @Autowired
    private SalesOrderDAO salesOrderDAO;

    public void addSalesOrder(SalesOrder salesOrder) {
        salesOrderDAO.addSalesOrder(salesOrder);
    }

}
