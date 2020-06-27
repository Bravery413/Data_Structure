package design_pattern.设计模式.模板模式.Demo1;

/**
 * @author 潘勇
 * @date 2020/6/27 15:30
 */


public abstract class ImportExcelTemplate {
    /**
     * 执行方法,靠这个定义顺序
     */
    protected final void readExcel() {
        this.before();
        this.onRowRead();
        this.after();
    }

    /**
     * 读取excel之前的操作
     */
    protected abstract void before();

    /**
     * 读取excel每行
     */
    protected abstract void onRowRead();

    /**
     * 读取excel之后的操作
     */
    protected abstract void after();
}
