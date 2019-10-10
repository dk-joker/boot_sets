package org.joker.springboot.mybatismultisource.db2.service;

import org.joker.springboot.mybatismultisource.db2.dao.MoneyDao;
import org.joker.springboot.mybatismultisource.entity.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-10-09 20:02
 */
@Service
public class MoneyService {
    @Autowired
    private MoneyDao moneyDao;

    /**
     * 根据id查找钱
     */
    public Money selectMoneyById(int id) {
        return moneyDao.findMoneyById(id);
    }
}

