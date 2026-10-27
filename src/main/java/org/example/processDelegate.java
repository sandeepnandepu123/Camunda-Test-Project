package org.camunda.bpm.spring.boot.example.simple.kumar.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("processDelegate")
public class processDelegate {

    public class ProcessDelegate implements JavaDelegate {

        @Override
        public void execute(DelegateExecution execution) {
            System.out.println("Hello, This is From BPMN");

            execution.setVariable("status", "SUCCESS");
        }
    }
}
