package miu.service;

import miu.model.Result;

public class CalculatorService {
    public CalculatorService(){}
    public void calculateSum(Result result){
        result.setSum(result.getAdd1()+ result.getAdd2());
    }
    public void calculateProduct(Result result){
        result.setProduct(result.getMult1() * result.getMult2());
    }
}
