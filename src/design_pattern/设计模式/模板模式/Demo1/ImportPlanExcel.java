package design_pattern.设计模式.模板模式.Demo1;

/**
 * @author 潘勇
 * @date 2020/6/27 15:34
 */


public class ImportPlanExcel extends ImportExcelTemplate {
    @Override
    public void before() {
        System.out.println("[班次导入]参数校验");
    }

    @Override
    public void onRowRead() {
        System.out.println("[班次导入]读取每行数据,数据过滤清洗,放入容器");
    }

    @Override
    public void after() {
        System.out.println("[班次导入]入库:批量班次插入数据");
    }
}
