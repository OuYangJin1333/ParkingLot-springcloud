package cn.park.config.mybatis;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
import org.springframework.lang.Nullable;

public class DynamicDataSource extends AbstractRoutingDataSource {
    /**
     * 返回分配的数据库的key
     * @return
     */
    @Override
    protected Object determineCurrentLookupKey() {
        DynamicDataSourceGlobel dynamicDataSourceGlobal = DynamicDataSourceHolder.getDataSource();
        if (dynamicDataSourceGlobal == null || dynamicDataSourceGlobal == DynamicDataSourceGlobel.WRITE) {
            return DynamicDataSourceGlobel.WRITE.name();
        }
        return DynamicDataSourceGlobel.READ.name();
    }
}
