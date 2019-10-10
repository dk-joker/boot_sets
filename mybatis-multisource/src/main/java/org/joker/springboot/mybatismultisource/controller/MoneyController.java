package org.joker.springboot.mybatismultisource.controller;

import org.joker.springboot.mybatismultisource.db2.service.MoneyService;
import org.joker.springboot.mybatismultisource.entity.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-10-10 13:32
 */
@RestController
@RequestMapping("/money")
public class MoneyController {
    @Autowired
    private MoneyService moneyService;

    @RequestMapping("/query/{id}")
    public Money testQuery(@PathVariable int id) {
        return moneyService.selectMoneyById(id);
    }
}

