package team.journey.pojo;

import java.io.Serializable;


public class ResultInfo implements Serializable {
    /**
     * flag //后端返回结果正常为true，发生异常返回false
     * data //后端返回结果数据对象
     * Msg //发生消息
     */

    private Boolean flag;
    private Object data;
    private String msg;

    public ResultInfo() {
    }

    public ResultInfo(Boolean flag) {
        this.flag = flag;
    }
    public ResultInfo(Boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

    public ResultInfo(Boolean flag, Object data) {
        this.flag = flag;
        this.data = data;
    }

    public ResultInfo(Boolean flag, Object data, String msg) {
        this.flag = flag;
        this.data = data;
        this.msg = msg;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
