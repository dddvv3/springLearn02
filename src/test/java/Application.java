import org.example.config.SpringConfig;
import org.example.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService as = context.getBean(AccountService.class);
        as.transfer("Tom","Jerry",100D);

    }
}
