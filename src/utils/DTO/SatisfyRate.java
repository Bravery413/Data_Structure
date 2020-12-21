package utils.DTO;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 潘勇
 * @date 2020/12/18 9:25
 */


public class SatisfyRate {
    private Map<String, Map<String,Double>> satisfyRate;

    public Map<String, Map<String, Double>> getSatisfyRate() {
        return satisfyRate;
    }

    public void setSatisfyRate(Map<String, Map<String, Double>> satisfyRate) {
        this.satisfyRate = satisfyRate;
    }
}
