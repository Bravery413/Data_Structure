package leetcode.everyday.year2020.december;

import java.util.Arrays;

public class EmpSkill {

    private String empCode;

    private String skill;

    private String zteId;

    private Integer pregnancy;

    private String skills;

    private String[] skillArr;



    public EmpSkill(String empCode, String skill, String zteId, Integer pregnancy, String skills) {
        this.empCode = empCode;
        this.skill = skill;
        this.zteId = zteId;
        this.pregnancy = pregnancy;
        this.skills = skills;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String[] getSkillArr() {
        return skillArr;
    }

    public void setSkillArr(String[] skillArr) {
        this.skillArr = skillArr;
    }

    public String getZteId() {
        return zteId;
    }

    public void setZteId(String zteId) {
        this.zteId = zteId;
    }

    public Integer getPregnancy() {
        return pregnancy;
    }

    public void setPregnancy(Integer pregnancy) {
        this.pregnancy = pregnancy;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }


    @Override
    public String toString() {
        return "EmpSkill{" +
                "empCode='" + empCode + '\'' +
                ", skill='" + skill + '\'' +
                ", zteId='" + zteId + '\'' +
                ", pregnancy=" + pregnancy +
                ", skills='" + skills + '\'' +
                ", skillArr=" + Arrays.toString(skillArr) +
                '}';
    }
}
