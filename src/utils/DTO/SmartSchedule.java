package utils.DTO;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ScheduledFuture;

/**
 * @author 潘勇
 * @date 2020/12/18 9:06
 */


public class SmartSchedule {

    private ScheduleInfo scheduleInfo;
    private List<EmpSchedule> EmpScheduleList;
    private List<EmpRest> empRestList;
    private SatisfyRate satisfyRate;


    public ScheduleInfo getScheduleInfo() {
        return scheduleInfo;
    }

    public void setScheduleInfo(ScheduleInfo scheduleInfo) {
        this.scheduleInfo = scheduleInfo;
    }

    public List<EmpSchedule> getEmpScheduleList() {
        return EmpScheduleList;
    }

    public void setEmpScheduleList(List<EmpSchedule> empScheduleList) {
        EmpScheduleList = empScheduleList;
    }

    public List<EmpRest> getEmpRestList() {
        return empRestList;
    }

    public void setEmpRestList(List<EmpRest> empRestList) {
        this.empRestList = empRestList;
    }

    public SatisfyRate getSatisfyRate() {
        return satisfyRate;
    }

    public void setSatisfyRate(SatisfyRate satisfyRate) {
        this.satisfyRate = satisfyRate;
    }
}
