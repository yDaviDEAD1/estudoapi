package com.davilab.api.Controllers;

import com.davilab.api.Interfaces.WordInterface;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class WordController {
    @Autowired
    private WordInterface wordInterface;

    @GetMapping("/using-creativity")
    public String usingCreativity() {
        return wordInterface.getString();
    }


}
