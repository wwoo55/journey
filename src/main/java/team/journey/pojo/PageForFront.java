package team.journey.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @projectName: journey
 * @className: PageForFront
 * @description:
 *  为layui表格数据的返回对象
 * @author: xy
 * @time: 2020/12/13 13:40
 */
public class PageForFront<T> implements Serializable {

    private Integer code;
    private String msg;
    private Integer count;
    private List<T> data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
