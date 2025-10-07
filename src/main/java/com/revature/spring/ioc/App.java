package com.revature.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // load the Spring configuration file
        ApplicationContext context = new org.springframework.context.support.ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve the bean from Spring container
        MessageService myMessage = (MessageService) context.getBean("messageService");
        
        // use the bean
        myMessage.printMessage();
        myMessage.setMessage("Hello, Spring IoC with modified message!");
        myMessage.printMessage();

        // close the context
        ((ConfigurableApplicationContext) context).close(); 
    }
}
