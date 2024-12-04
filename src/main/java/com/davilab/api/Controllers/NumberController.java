package com.davilab.api.Controllers;

import com.davilab.api.Interfaces.NumberInterface;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class NumberController {
    @Autowired
    private NumberInterface numberInterface;
    @GetMapping("/number/{firstnumber}/{secondnumber}")
        public int getNumber(@PathVariable int firstnumber, @PathVariable int secondnumber) {
            return numberInterface.getNumber(firstnumber, secondnumber);
        }

}
