package cn.park.config.mybatis;

public class DynamicDataSourceHolder {
    //本地线程副本
    private static final ThreadLocal<DynamicDataSourceGlobel> holder = new ThreadLocal<DynamicDataSourceGlobel>();

    private DynamicDataSourceHolder() {
    }

    public static void putDataSource(DynamicDataSourceGlobel dataSource) {
        holder.set(dataSource);
    }

    public static DynamicDataSourceGlobel getDataSource() {
        return holder.get();
    }

    public static void clearDataSource() {
        holder.remove();
    }
}
