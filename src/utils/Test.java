package utils;


import utils.DTO.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 潘勇
 * @date 2020/12/18 9:06
 */


public class Test {
    public static void main(String[] args) {
        ArrayList<SmartSchedule>  smartSchedules = new ArrayList<>();
        SmartSchedule smartSchedule = new SmartSchedule();

        ScheduleInfo scheduleInfo = new ScheduleInfo();
        scheduleInfo.setDeptCode("852Y");
        scheduleInfo.setCreateTm(LocalDateTime.now());
        scheduleInfo.setBeginTm(new Date());
        scheduleInfo.setEndTm(new Date());
        scheduleInfo.setAvgSatisfy(98.3);
        scheduleInfo.setLowestSatisfy(46.9);
        scheduleInfo.setHighestSatisfy(46.9);
        scheduleInfo.setAvgHoliday(7.4F);
        scheduleInfo.setRate(56.87);


        ArrayList<EmpSchedule> empSchedules = new ArrayList<>();
        ArrayList<EmpRest> empRests = new ArrayList<>();


        EmpSchedule empSchedule = new EmpSchedule();
        empSchedule.setEmpCode("01394892");
        empSchedule.setPlanCode("A01");
        empSchedule.setPlanDt(LocalDate.now());

        EmpSchedule empSchedule1 = new EmpSchedule();
        empSchedule1.setEmpCode("01394892");
        empSchedule1.setPlanCode("A01");
        empSchedule1.setPlanDt(LocalDate.now());

        empSchedules.add(empSchedule);
        empSchedules.add(empSchedule1);

        EmpRest empRest = new EmpRest();
        empRest.setEmpCode("01394892");
        empRest.setHalfRest(1);
        empRest.setRest(0.5f);
        empRest.setTotalRest(1.5f);

        EmpRest empRest1 = new EmpRest();
        empRest1.setEmpCode("01394892");
        empRest1.setHalfRest(1);
        empRest1.setRest(0.5f);
        empRest1.setTotalRest(1.5f);

        empRests.add(empRest);
        empRests.add(empRest1);

        SatisfyRate satisfyRate = new SatisfyRate();
        HashMap<String, Map<String, Double>> period = new HashMap<>();
        HashMap<String, Double> date = new HashMap<>();
        date.put("1", 105.60);
        date.put("2", 124.06);
        date.put("3", 105.60);
        date.put("4", 124.06);
        date.put("5", 105.60);
        date.put("6", 124.06);
        date.put("7", 105.60);
        date.put("8", 124.06);
        date.put("9", 105.60);
        date.put("10", 124.06);
        date.put("11", 105.60);
        date.put("12", 124.06);
        date.put("13", 105.60);
        date.put("14", 124.06);
        date.put("15", 105.60);
        date.put("16", 124.06);
        date.put("17", 105.60);
        date.put("18", 124.06);
        date.put("19", 105.60);
        date.put("20", 124.06);
        date.put("21", 105.60);
        date.put("22", 124.06);
        date.put("23", 105.60);
        date.put("24", 124.06);
        date.put("25", 105.60);
        date.put("26", 124.06);
        date.put("27", 105.60);
        date.put("28", 124.06);
        date.put("29", 105.60);
        date.put("30", 124.06);
        date.put("31", 124.06);
        date.put("Min", 82.85);
        date.put("Max", 124.06);
        date.put("Avg", 105.60);
        date.put("小于95%", 124.06);
        date.put("大于105%", 82.85);

        period.put("08:00-08:30", date);

        HashMap<String, Double> d2 = new HashMap<>();
        d2.put("1", 105.60);
        d2.put("2", 124.06);
        d2.put("3", 105.60);
        d2.put("4", 124.06);
        d2.put("5", 105.60);
        d2.put("6", 124.06);
        d2.put("7", 105.60);
        d2.put("8", 124.06);
        d2.put("9", 105.60);
        d2.put("10", 124.06);
        d2.put("11", 105.60);
        d2.put("12", 124.06);
        d2.put("13", 105.60);
        d2.put("14", 124.06);
        d2.put("15", 105.60);
        d2.put("16", 124.06);
        d2.put("17", 105.60);
        d2.put("18", 124.06);
        d2.put("19", 105.60);
        d2.put("20", 124.06);
        d2.put("21", 105.60);
        d2.put("22", 124.06);
        d2.put("23", 105.60);
        d2.put("24", 124.06);
        d2.put("25", 105.60);
        d2.put("26", 124.06);
        d2.put("27", 105.60);
        d2.put("28", 124.06);
        d2.put("29", 105.60);
        d2.put("30", 124.06);
        d2.put("31", 124.06);
        d2.put("Min", 82.85);
        d2.put("Max", 124.06);
        d2.put("Avg", 105.60);
        d2.put("小于95%", 124.06);
        d2.put("大于105%", 82.85);

        period.put("08:30-09:00", d2);


        HashMap<String, Double> minDate = new HashMap<>();
        minDate.put("1", 105.60);
        minDate.put("2", 124.06);
        minDate.put("3", 105.60);
        minDate.put("4", 124.06);
        minDate.put("5", 105.60);
        minDate.put("6", 124.06);
        minDate.put("7", 105.60);
        minDate.put("8", 124.06);
        minDate.put("9", 105.60);
        minDate.put("10", 124.06);
        minDate.put("11", 105.60);
        minDate.put("12", 124.06);
        minDate.put("13", 105.60);
        minDate.put("14", 124.06);
        minDate.put("15", 105.60);
        minDate.put("16", 124.06);
        minDate.put("17", 105.60);
        minDate.put("18", 124.06);
        minDate.put("19", 105.60);
        minDate.put("20", 124.06);
        minDate.put("21", 105.60);
        minDate.put("22", 124.06);
        minDate.put("23", 105.60);
        minDate.put("24", 124.06);
        minDate.put("25", 105.60);
        minDate.put("26", 124.06);
        minDate.put("27", 105.60);
        minDate.put("28", 124.06);
        minDate.put("29", 105.60);
        minDate.put("30", 124.06);
        minDate.put("31", 124.06);
        minDate.put("Min", 82.85);
        minDate.put("Min", 82.85);
        minDate.put("Max", 124.06);
        minDate.put("Avg", 105.60);
        minDate.put("小于95%", 124.06);
        minDate.put("大于105%", 82.85);

        period.put("Min", minDate);

        satisfyRate.setSatisfyRate(period);

        smartSchedule.setScheduleInfo(scheduleInfo);
        smartSchedule.setEmpScheduleList(empSchedules);
        smartSchedule.setEmpRestList(empRests);
        smartSchedule.setSatisfyRate(satisfyRate);




        smartSchedules.add(smartSchedule);
        smartSchedules.add(smartSchedule);

//        String json = JSON.toJSONString(smartSchedules);
//        System.out.println(json);
    }
}
