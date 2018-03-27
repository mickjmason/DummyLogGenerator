package uk.ltd.skyris.loggenerator.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uk.ltd.skyris.loggenerator.domain.logResponse;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import java.security.SecureRandom;

@Component
public class logGenerator {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RandomIpGenerator randomIpGenerator;

    @Autowired
    private RandomString randomString;

    public void GenerateLog()
    {
        int start = 50;
        int end = 1000;
        logResponse response = new logResponse();

        int randomNum = ThreadLocalRandom.current().nextInt(start, end + 1);
        String chars = randomString.digits + "ACEFGHJKLMNPQRUVWXYabcdefhijkprstuvwx";
        String logText = randomString.getRandomString(randomNum, new SecureRandom(), chars);
        response.setIpAddress(randomIpGenerator.generateIp());
        response.setEventTime(new Date());
        response.setLogMessage(logText.toString());
        logger.error(logText.toString(),response);
    }



}
