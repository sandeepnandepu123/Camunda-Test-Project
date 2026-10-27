package org.camunda.bpm.spring.boot.example.simple.kumar.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("externalResourceDelegate")
public class ExternalResourceDelegate {

    public class externalResourceDelegate implements JavaDelegate {

        @Override
        public void execute(DelegateExecution execution) {
            System.out.println("External Resource Processing");

            execution.setVariable("externalStatus", "SUCCESS");
        }
    }
}
