package cn.park.config;

import cn.park.Repository.PartRepository;
import cn.park.service.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class MyCommandlineRunner implements CommandLineRunner {
    @Autowired
    PartRepository partRepository;
    @Autowired
    PartService partService;

    @Order(value=1)
    public void run(String... args) throws Exception {
            /*partService.deleteAll();
            partService.importAll();*/
    }
}
