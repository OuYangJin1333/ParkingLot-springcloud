package cn.park.config;
import cn.park.Repository.ReconciliaRepository;
import cn.park.service.ReconciliaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandlineRunner implements CommandLineRunner {

    /* @Autowired
     PartRepository partRepository;
     @Autowired
     PartService partService;*/
    /*@Autowired
    StopCarRepository stopCarRepository;
    @Autowired
    StopCarService stopCarService;*/
    @Autowired
    ReconciliaRepository reconciliaRepository;
    @Autowired
    ReconciliaService reconciliaService;


    public void run(String... args) throws Exception {
       /* partService.deleteAll();
        partService.importAll();*/
        /*stopCarService.deleteAll();
        stopCarService.importAll();*/
        reconciliaService.deleteAll();
        reconciliaService.importAll();

    }

}
