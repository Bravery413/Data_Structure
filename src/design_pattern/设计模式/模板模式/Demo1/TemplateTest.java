package design_pattern.设计模式.模板模式.Demo1;

/**
 * @author 潘勇
 * @date 2020/6/27 15:53
 */


public class TemplateTest {
    public static void main(String[] args) {
        System.out.println("------------班次导入-------------");
        ImportExcelTemplate importExcel = new ImportPlanExcel();
        importExcel.readExcel();
        System.out.println("------------员工导入-------------");
        importExcel=new ImportEmployeeExcel();
        importExcel.readExcel();
    }
}
