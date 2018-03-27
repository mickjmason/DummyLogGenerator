package uk.ltd.skyris.loggenerator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class JobRunner {

    @Autowired
    private logGenerator logGenerator;



    @Scheduled(fixedDelayString = "${generator.runfrequencymillis}")
    public void writeLog() throws IOException {
        logGenerator.GenerateLog();
    }
}
