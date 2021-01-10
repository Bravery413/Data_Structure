//package utils;
//
//
//import com.alibaba.fastjson.JSON;
//import utils.DTO.*;
//
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * @author 潘勇
// * @date 2020/12/18 9:06
// */
//
//
//public class Test {
//    public static void main(String[] args) {
//        ArrayList<SmartSchedule>  smartSchedules = new ArrayList<>();
//        SmartSchedule smartSchedule = new SmartSchedule();
//
//        ScheduleInfo scheduleInfo = new ScheduleInfo();
//        scheduleInfo.setDeptCode("852Y");
//        scheduleInfo.setCreateTm(new Date());
//        scheduleInfo.setBeginTm(new Date());
//        scheduleInfo.setEndTm(new Date());
//        scheduleInfo.setAvgSatisfy(98.3);
//        scheduleInfo.setLowestSatisfy(46.9);
//        scheduleInfo.setHighestSatisfy(46.9);
//        scheduleInfo.setAvgHoliday(7.4F);
//        scheduleInfo.setRate(56.87);
//        scheduleInfo.setProcessNo("847792_1609902570301_1");
//
//
//        ArrayList<EmpSchedule> empSchedules = new ArrayList<>();
//        ArrayList<EmpRest> empRests = new ArrayList<>();
//
//
//        EmpSchedule empSchedule = new EmpSchedule();
//        empSchedule.setEmpCode("01394892");
//        empSchedule.setPlanCode("A01");
//        empSchedule.setPlanDt(LocalDate.now());
//
//        EmpSchedule empSchedule1 = new EmpSchedule();
//        empSchedule1.setEmpCode("01394892");
//        empSchedule1.setPlanCode("A01");
//        empSchedule1.setPlanDt(LocalDate.now());
//
//        empSchedules.add(empSchedule);
//        empSchedules.add(empSchedule1);
//
//        EmpRest empRest = new EmpRest();
//        empRest.setEmpCode("01394892");
//        empRest.setHalfRest(1);
//        empRest.setRest(0.5f);
//        empRest.setTotalRest(1.5f);
//
//        EmpRest empRest1 = new EmpRest();
//        empRest1.setEmpCode("01394892");
//        empRest1.setHalfRest(1);
//        empRest1.setRest(0.5f);
//        empRest1.setTotalRest(1.5f);
//
//        empRests.add(empRest);
//        empRests.add(empRest1);
//
//
//        smartSchedule.setScheduleInfo(scheduleInfo);
//        smartSchedule.setEmpScheduleList(empSchedules);
//        smartSchedule.setEmpRestList(empRests);
//
//        smartSchedules.add(smartSchedule);
//
//        String json = JSON.toJSONString(smartSchedules);
//        System.out.println(json);
//    }
//}
