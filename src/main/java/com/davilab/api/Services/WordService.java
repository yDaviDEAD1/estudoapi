package com.davilab.api.Services;

import com.davilab.api.Interfaces.WordInterface;
import org.springframework.stereotype.Service;

@Service
public class WordService implements WordInterface {

    @Override
    public String getString() {
        return "ok";
    }
}
