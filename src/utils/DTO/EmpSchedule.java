package utils.DTO;

import java.time.LocalDate;

/**
 * @author 潘勇
 * @date 2020/12/18 9:19
 */


public class EmpSchedule {

    private LocalDate planDt;
    private String empCode;
    private String planCode;


    public LocalDate getPlanDt() {
        return planDt;
    }

    public void setPlanDt(LocalDate planDt) {
        this.planDt = planDt;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode;
    }
}
