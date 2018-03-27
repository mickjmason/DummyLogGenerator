package uk.ltd.skyris.loggenerator.service;

import com.google.common.net.InetAddresses;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomIpGenerator {


    public String generateIp()
    {
        Random random = new Random();
        String ipString = InetAddresses.fromInteger(random.nextInt()).getHostAddress();
        return ipString;
    }
}
