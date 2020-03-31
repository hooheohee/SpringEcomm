package onlineShop.log;

import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class PaymentAction {

    @Autowired
    private Logger logger;

    public void pay(BigDecimal payValue) {
        logger.info("pay begin, payValue is " + payValue);
        logger.info("pay end");
    }
}
