package utils.DTO;

/**
 * @author 潘勇
 * @date 2020/12/18 9:22
 */


public class EmpRest {
    private String empCode;
    private float rest;
    private float halfRest;
    private float totalRest;

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public float getRest() {
        return rest;
    }

    public void setRest(float rest) {
        this.rest = rest;
    }

    public float getHalfRest() {
        return halfRest;
    }

    public void setHalfRest(float halfRest) {
        this.halfRest = halfRest;
    }

    public float getTotalRest() {
        return totalRest;
    }

    public void setTotalRest(float totalRest) {
        this.totalRest = totalRest;
    }
}
