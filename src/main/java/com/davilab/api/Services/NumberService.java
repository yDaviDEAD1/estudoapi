package com.davilab.api.Services;

import com.davilab.api.Interfaces.NumberInterface;
import org.springframework.stereotype.Service;

@Service
public class NumberService implements NumberInterface {

    @Override
    public int getNumber(int firstnumber, int secondnumber) {
        return firstnumber + secondnumber;
    }
}
