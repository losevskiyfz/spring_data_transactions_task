package com.losevskiyfz.springdatatransactionstask.transactionservice.bootstrap;

import com.losevskiyfz.springdatatransactionstask.transactionservice.outer.TransactionalOuterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.AopProxyUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Component
public class Bootstrap implements CommandLineRunner {

    private final TransactionalOuterService transactionalOuterService;
    private final Logger logger = LoggerFactory.getLogger(Bootstrap.class);

    public Bootstrap(TransactionalOuterService transactionalOuterService) {
        this.transactionalOuterService = transactionalOuterService;
    }

    private void invokeProxyMethod(Class<?> proxyClass, Method outerMethod) throws NoSuchMethodException {
        if(outerMethod.isAnnotationPresent(Transactional.class)){
            logger.info("");
            Method m = proxyClass.getMethod(outerMethod.getName());
            logger.info("Try to call method {}", m.getName());
            try {
                m.invoke(transactionalOuterService);
            } catch (InvocationTargetException e){
                logger.info("Method {} failed with exception {}", outerMethod.getName(), e.getTargetException().toString());
            } catch (IllegalAccessException e) {
                logger.info("Method {} failed with exception {}", outerMethod.getName(), e.toString());
            }
        }
    }

    private void callAllCombinationsOfTransactionalMethods() throws NoSuchMethodException {
        Class<?> proxyClass = transactionalOuterService.getClass();
        Method[] originalMethods = AopProxyUtils.ultimateTargetClass(transactionalOuterService).getMethods();

        for(Method method : originalMethods){
            invokeProxyMethod(proxyClass, method);
        }
    }

    @Override
    public void run(String... args) throws NoSuchMethodException {
        callAllCombinationsOfTransactionalMethods();
    }

}
