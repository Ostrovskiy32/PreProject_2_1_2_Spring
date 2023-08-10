import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());



        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean1.getMessage());

        Cat cat = (Cat) applicationContext.getBean("Cat");
        System.out.println(cat.getMessage());

        Cat differentCat = (Cat) applicationContext.getBean("Cat");
        System.out.println(differentCat.getMessage());

        System.out.println(bean1 == bean);
        System.out.println(cat == differentCat);

    }
}