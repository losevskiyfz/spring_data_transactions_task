package com.losevskiyfz.springdatatransactionstask.transactionservice.outer;

import com.losevskiyfz.springdatatransactionstask.transactionservice.inner.TransactionalInnerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class TransactionalOuterService {

    private final Logger logger = LoggerFactory.getLogger(TransactionalOuterService.class);
    private final TransactionalInnerService transactionalInnerService;

    public TransactionalOuterService(TransactionalInnerService transactionalInnerService) {
        this.transactionalInnerService = transactionalInnerService;
    }

    private void logFirstStage(){
        logger.info("Transaction - into 1 stage");
    }

    //REQUIRED
    @Transactional(propagation = Propagation.REQUIRED)
    public void requiredPlusRequired(){
        logFirstStage();
        transactionalInnerService.required();
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public void requiredPlusRequiresNew(){
        logFirstStage();
        transactionalInnerService.requiresNew();
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public void requiredPlusNested(){
        logFirstStage();
        transactionalInnerService.nested();
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public void requiredPlusMandatory(){
        logFirstStage();
        transactionalInnerService.mandatory();
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public void requiredPlusSupports(){
        logFirstStage();
        transactionalInnerService.supports();
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public void requiredPlusNotSupported(){
        logFirstStage();
        transactionalInnerService.notSupported();
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public void requiredPlusNever(){
        logFirstStage();
        transactionalInnerService.never();
    }

    //REQUIRES_NEW
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void requiresNewPlusRequired(){
        logFirstStage();
        transactionalInnerService.required();
    }
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void requiresNewPlusRequiresNew(){
        logFirstStage();
        transactionalInnerService.requiresNew();
    }
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void requiresNewPlusNested(){
        logFirstStage();
        transactionalInnerService.nested();
    }
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void requiresNewPlusMandatory(){
        logFirstStage();
        transactionalInnerService.mandatory();
    }
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void requiresNewPlusSupports(){
        logFirstStage();
        transactionalInnerService.supports();
    }
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void requiresNewPlusNotSupported(){
        logFirstStage();
        transactionalInnerService.notSupported();
    }
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void requiresNewPlusNever(){
        logFirstStage();
        transactionalInnerService.never();
    }

    //NESTED
    @Transactional(propagation = Propagation.NESTED)
    public void nestedPlusRequired(){
        logFirstStage();
        transactionalInnerService.required();
    }
    @Transactional(propagation = Propagation.NESTED)
    public void nestedPlusRequiresNew(){
        logFirstStage();
        transactionalInnerService.requiresNew();
    }
    @Transactional(propagation = Propagation.NESTED)
    public void nestedPlusNested(){
        logFirstStage();
        transactionalInnerService.nested();
    }
    @Transactional(propagation = Propagation.NESTED)
    public void nestedPlusMandatory(){
        logFirstStage();
        transactionalInnerService.mandatory();
    }
    @Transactional(propagation = Propagation.NESTED)
    public void nestedPlusSupports(){
        logFirstStage();
        transactionalInnerService.supports();
    }
    @Transactional(propagation = Propagation.NESTED)
    public void nestedPlusNotSupported(){
        logFirstStage();
        transactionalInnerService.notSupported();
    }
    @Transactional(propagation = Propagation.NESTED)
    public void nestedPlusNever(){
        logFirstStage();
        transactionalInnerService.never();
    }

    //MANDATORY
    @Transactional(propagation = Propagation.MANDATORY)
    public void mandatoryPlusRequired(){
        logFirstStage();
        transactionalInnerService.required();
    }
    @Transactional(propagation = Propagation.MANDATORY)
    public void mandatoryPlusRequiresNew(){
        logFirstStage();
        transactionalInnerService.requiresNew();
    }
    @Transactional(propagation = Propagation.MANDATORY)
    public void mandatoryPlusNested(){
        logFirstStage();
        transactionalInnerService.nested();
    }
    @Transactional(propagation = Propagation.MANDATORY)
    public void mandatoryPlusMandatory(){
        logFirstStage();
        transactionalInnerService.mandatory();
    }
    @Transactional(propagation = Propagation.MANDATORY)
    public void mandatoryPlusSupports(){
        logFirstStage();
        transactionalInnerService.supports();
    }
    @Transactional(propagation = Propagation.MANDATORY)
    public void mandatoryPlusNotSupported(){
        logFirstStage();
        transactionalInnerService.notSupported();
    }
    @Transactional(propagation = Propagation.NESTED)
    public void mandatoryPlusNever(){
        logFirstStage();
        transactionalInnerService.never();
    }

    //SUPPORTS
    @Transactional(propagation = Propagation.SUPPORTS)
    public void supportsPlusRequired(){
        logFirstStage();
        transactionalInnerService.required();
    }
    @Transactional(propagation = Propagation.SUPPORTS)
    public void supportsPlusRequiresNew(){
        logFirstStage();
        transactionalInnerService.requiresNew();
    }
    @Transactional(propagation = Propagation.SUPPORTS)
    public void supportsPlusNested(){
        logFirstStage();
        transactionalInnerService.nested();
    }
    @Transactional(propagation = Propagation.SUPPORTS)
    public void supportsPlusMandatory(){
        logFirstStage();
        transactionalInnerService.mandatory();
    }
    @Transactional(propagation = Propagation.SUPPORTS)
    public void supportsPlusSupports(){
        logFirstStage();
        transactionalInnerService.supports();
    }
    @Transactional(propagation = Propagation.SUPPORTS)
    public void supportsPlusNotSupported(){
        logFirstStage();
        transactionalInnerService.notSupported();
    }
    @Transactional(propagation = Propagation.SUPPORTS)
    public void supportsPlusNever(){
        logFirstStage();
        transactionalInnerService.never();
    }

    //NOT_SUPPORTED
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void notSupportedPlusRequired(){
        logFirstStage();
        transactionalInnerService.required();
    }
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void notSupportedPlusRequiresNew(){
        logFirstStage();
        transactionalInnerService.requiresNew();
    }
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void notSupportedPlusNested(){
        logFirstStage();
        transactionalInnerService.nested();
    }
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void notSupportedPlusMandatory(){
        logFirstStage();
        transactionalInnerService.mandatory();
    }
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void notSupportedPlusSupports(){
        logFirstStage();
        transactionalInnerService.supports();
    }
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void notSupportedPlusNotSupported(){
        logFirstStage();
        transactionalInnerService.notSupported();
    }
    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void notSupportedPlusNever(){
        logFirstStage();
        transactionalInnerService.never();
    }

    //NEVER
    @Transactional(propagation = Propagation.NEVER)
    public void neverPlusRequired(){
        logFirstStage();
        transactionalInnerService.required();
    }
    @Transactional(propagation = Propagation.NEVER)
    public void neverPlusRequiresNew(){
        logFirstStage();
        transactionalInnerService.requiresNew();
    }
    @Transactional(propagation = Propagation.NEVER)
    public void neverPlusNested(){
        logFirstStage();
        transactionalInnerService.nested();
    }
    @Transactional(propagation = Propagation.NEVER)
    public void neverPlusMandatory(){
        logFirstStage();
        transactionalInnerService.mandatory();
    }
    @Transactional(propagation = Propagation.NEVER)
    public void neverPlusSupports(){
        logFirstStage();
        transactionalInnerService.supports();
    }
    @Transactional(propagation = Propagation.NEVER)
    public void neverPlusNotSupported(){
        logFirstStage();
        transactionalInnerService.notSupported();
    }
    @Transactional(propagation = Propagation.NEVER)
    public void neverPlusNever(){
        logFirstStage();
        transactionalInnerService.never();
    }
}
