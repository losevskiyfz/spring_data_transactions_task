package com.losevskiyfz.springdatatransactionstask.transactionservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class TransactionalInnerService {

    private final Logger logger = LoggerFactory.getLogger(TransactionalOuterService.class);

    private void logSecondStage(){
        logger.info("Transaction - into 2 stage");
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void required(){
        logSecondStage();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void requiresNew(){
        logSecondStage();}

    @Transactional(propagation = Propagation.NESTED)
    public void nested(){
        logSecondStage();}

    @Transactional(propagation = Propagation.MANDATORY)
    public void mandatory(){
        logSecondStage();}

    @Transactional(propagation = Propagation.SUPPORTS)
    public void supports(){
        logSecondStage();}

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void notSupported(){
        logSecondStage();}

    @Transactional(propagation = Propagation.NEVER)
    public void never(){
        logSecondStage();}
}
