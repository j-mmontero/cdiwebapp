package org.jmm.cdiwebapp.logging;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import org.apache.log4j.Logger;

public class LoggerProducer
{
    @Produces  
    public Logger produceLogger(InjectionPoint injectionPoint) {  
        return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());  
    } 
}
