package design_pattern.设计模式.模板模式.Demo1;

/**
 * @author 潘勇
 * @date 2020/6/27 15:51
 */


public class ImportEmployeeExcel extends ImportExcelTemplate {
    @Override
    protected void before() {
        System.out.println("[员工导入]参数校验");
    }

    @Override
    protected void onRowRead() {
        System.out.println("[员工导入]数据操作:清洗");
    }

    @Override
    protected void after() {
        System.out.println("[员工导入] 入库");
    }
}
