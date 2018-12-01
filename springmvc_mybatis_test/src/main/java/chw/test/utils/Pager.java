package chw.test.utils;

/**
 * <p>
 * <b>创建日期：</b> 2018-11-06 20:22
 * </p>
 *
 * @author 58dj.chw
 **/
public class Pager {

    // 页码：第几页 默认1
    private int  pageNo   = 1;
    // 每页显示数 默认20
    private int  pageSize = 20;
    // 总页数
    private int  pageCount;
    // 总数据量
    private long totalCount;
    // 当前页开始行索引
    private long startRow;
    // 当前页结束行索引
    private long endRow;

    private Pager() {
    }

    public static Pager getPager(int pageSize) {
        int pageNo = 1;
        return getPager(pageNo, pageSize);
    }

    public static Pager getPager(int pageNo, int pageSize) {
        long totalCount =(long) (pageNo * pageSize + pageSize);
        return getPager(totalCount, pageNo, pageSize);
    }

    public static Pager getPager(long totalCount, int pageNo, int pageSize) {
        Pager pager = new Pager();
        pager.setPageNo(pageNo);
        pager.setPageSize(pageSize);
        return refresh(pager, totalCount);
    }

    /**
     * 刷新分页信息
     *
     * @author: slzs 2013-12-4 下午7:12:55
     * @param pager
     *            当前分页信息，null初始化新分页
     * @param totalCount
     *            总数据量
     * @return Pager
     */
    public static Pager refresh(Pager pager, long totalCount) {
        if (totalCount > 0) {
            if (pager == null) {
                pager = new Pager();
            }
            // 设置总数据数
            pager.setTotalCount(totalCount);

            // 计算总页数
            int pageCount = (int) (totalCount / pager.getPageSize());
            if (totalCount % pager.getPageSize() > 0) {
                pageCount++;
            }
            pager.setPageCount(pageCount);

            // 当前页码设置
            int pageNo = pager.getPageNo();
            if (pageNo < 1) {
                pageNo = 1;
            } else if (pageNo > pageCount) {
                pageNo = pageCount;
            }
            pager.setPageNo(pageNo);

            // 当前页起始序号
            long startRow =(long) (pageNo - 1) * pager.getPageSize();
            long endRow = Math.min(startRow + pager.getPageSize(), totalCount - 1);
            pager.setStartRow(startRow);
            pager.setEndRow(endRow);
        }
        return pager;
    }

    public long getStartRow() {
        return startRow;
    }

    public long getEndRow() {
        return endRow;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public int getPageNo() {
        return pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setStartRow(long startRow) {
        this.startRow = startRow;
    }

    public void setEndRow(long endRow) {
        this.endRow = endRow;
    }
}
