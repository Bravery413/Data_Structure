package utils.DTO;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author 潘勇
 * @date 2020/12/18 11:31
 */


public class ScheduleInfo {
    private String deptCode;
    private LocalDateTime createTm;
    private Date beginTm;
    private Date endTm;
    private double avgSatisfy;
    private double lowestSatisfy;
    private double highestSatisfy;
    private float avgHoliday;
    private double rate;

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public Date getBeginTm() {
        return beginTm;
    }

    public void setBeginTm(Date beginTm) {
        this.beginTm = beginTm;
    }

    public LocalDateTime getCreateTm() {
        return createTm;
    }

    public void setCreateTm(LocalDateTime createTm) {
        this.createTm = createTm;
    }

    public Date getEndTm() {
        return endTm;
    }

    public void setEndTm(Date endTm) {
        this.endTm = endTm;
    }

    public double getAvgSatisfy() {
        return avgSatisfy;
    }

    public void setAvgSatisfy(double avgSatisfy) {
        this.avgSatisfy = avgSatisfy;
    }

    public double getLowestSatisfy() {
        return lowestSatisfy;
    }

    public void setLowestSatisfy(double lowestSatisfy) {
        this.lowestSatisfy = lowestSatisfy;
    }

    public double getHighestSatisfy() {
        return highestSatisfy;
    }

    public void setHighestSatisfy(double highestSatisfy) {
        this.highestSatisfy = highestSatisfy;
    }

    public float getAvgHoliday() {
        return avgHoliday;
    }

    public void setAvgHoliday(float avgHoliday) {
        this.avgHoliday = avgHoliday;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
