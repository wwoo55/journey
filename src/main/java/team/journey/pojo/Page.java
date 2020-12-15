package team.journey.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @projectName: journey
 * @className: Page
 * @description:
 * @author: xy
 * @time: 2020/12/12 16:35
 */
public class Page<T> implements Serializable {

    private int totalCount;
    private int totalPage;
    private int currentPage;
    private int pageSize;
    private List<T> dataList;

    private static final long serialVersionUID = 1L;

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }
}
