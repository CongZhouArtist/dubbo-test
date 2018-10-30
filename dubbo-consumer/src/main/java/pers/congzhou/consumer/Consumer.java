package pers.congzhou.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pers.congzhou.service.DemoService;

public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext.xml"});
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
        while (true) {
            try {
                Thread.sleep(1000);
                String hello = demoService.sayHello("world");
                System.out.println(hello);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }
}
