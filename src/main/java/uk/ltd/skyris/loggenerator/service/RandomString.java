package uk.ltd.skyris.loggenerator.service;

import org.springframework.stereotype.Component;

import java.security.SecureRandom;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;

@Component
public class RandomString {
    public   String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public   String lower = upper.toLowerCase(Locale.ROOT);

    public   String digits = "0123456789";

    public   String alphanum = upper + lower + digits;

    private  Random random;

    private  char[] symbols;

    private  char[] buf;

    public String getRandomString(int length, Random random, String symbols) {
        if (length < 1) throw new IllegalArgumentException();
        if (symbols.length() < 2) throw new IllegalArgumentException();
        this.random = Objects.requireNonNull(random);
        this.symbols = symbols.toCharArray();
        this.buf = new char[length];

        for (int idx = 0; idx < buf.length; ++idx)
            buf[idx] = this.symbols[random.nextInt(this.symbols.length)];
        return new String(buf);
    }

}