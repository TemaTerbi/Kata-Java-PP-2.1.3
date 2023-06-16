import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld secondBean = (HelloWorld) applicationContext.getBean("helloworld");

        Cat catBeanFirst = (Cat) applicationContext.getBean("cat");
        Cat catBeanSecond = (Cat) applicationContext.getBean("cat");

        System.out.println(bean.equals(secondBean));
        System.out.println(catBeanFirst.equals(catBeanSecond));

        System.out.println(bean.getMessage());
    }
}