package com.example.demo.strategy.pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * spring中使用策略模式
 */
@Component
public class ShoppingMall {
    // 注入所有Strategy的实现类
    @Autowired
    List<Strategy> strategyList;

//    public ShoppingMall(List<Strategy> strategyList) {
//        this.strategyList = strategyList;
//    }

    public void shopping(int i){
        for (Strategy strategy : strategyList) {
            if(strategy.support(i)){
                strategy.doStrategy();
            }
        }
    }
}
