package team.journey.pojo;

import java.io.Serializable;

/**
 * @projectName: journey
 * @className: RouteQueryVo
 * @description:
 * @author: xy
 * @time: 2020/12/12 17:43
 */
public class RouteQueryVo implements Serializable {

    private Integer cid;
    private String title;
    private Integer currentPage;
    private Integer pageSize;


    private Integer start;

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }


    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

}
