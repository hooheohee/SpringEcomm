package onlineShop.log;

import java.time.LocalDateTime;

public class ServerLogger implements Logger {

    @Override
    public void info(String info) {
        System.out.println(LocalDateTime.now() + " - [SERVER] - INFO - " + info);
    }

    @Override
    public void debug(String info) {
        System.out.println(LocalDateTime.now() + " - [SERVER] - DEBUG - " + info);
    }
}
