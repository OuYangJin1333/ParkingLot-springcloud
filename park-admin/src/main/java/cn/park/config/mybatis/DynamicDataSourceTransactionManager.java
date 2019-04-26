package cn.park.config.mybatis;

import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionDefinition;

/**
 * 根据是否可读
 */
@SuppressWarnings("serial")
public class DynamicDataSourceTransactionManager extends DataSourceTransactionManager {

    //只读事务到读库 读写事务到写库
    @Override
    protected void doBegin(Object transaction, TransactionDefinition definition) {
        //设置数据源
        boolean readOnly = definition.isReadOnly();
        if (readOnly) {
            DynamicDataSourceHolder.putDataSource(DynamicDataSourceGlobel.READ);
        } else {
            DynamicDataSourceHolder.putDataSource(DynamicDataSourceGlobel.WRITE);
        }
        super.doBegin(transaction, definition);
    }

    //清理本地线程的数据源
    @Override
    protected void doCleanupAfterCompletion(Object transaction) {
        super.doCleanupAfterCompletion(transaction);
        DynamicDataSourceHolder.clearDataSource();
    }
}
