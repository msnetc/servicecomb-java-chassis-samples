package org.apache.servicecomb.samples.boot.simple;


import io.swagger.annotations.ApiModelProperty;

public class MessageReponseBase<T> {

    @ApiModelProperty(value = "消息编码", required=true,notes="编码" )
    private Integer code;
    @ApiModelProperty(value = "消息内容", required=true,notes="消息内容" )
    private String msg;
    @ApiModelProperty(value = "总行数", required=true,notes="如果是分页，返回总行数" )
    private long total ;
    @ApiModelProperty(value = "业务数据", required=true,notes="具体的每个业务接口的业务数据" )
    private T data;

    public Integer getCode() {
        return code;
    }

    public MessageReponseBase<T> setCode(Integer code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public  MessageReponseBase<T> setMsg(String msg) {
        this.msg = msg;
        return  this;
    }

    public  MessageReponseBase<T> setData(T data) {
        this.data = data;
        return this;
    }

    public T getData() {
        return data;
    }

    public long getTotal() {
        return total;
    }

    public  MessageReponseBase<T> setTotal(long total) {
        this.total = total;
        return this;
    }



    public  MessageReponseBase<T> addData(String key, Object object) {
        return this;
    }
    public  MessageReponseBase<T> ok(int statusCode, String statusMsg) {
        this.setCode(statusCode);
        this.setMsg(statusMsg);
        return this;
    }
    public  MessageReponseBase<T> error(int statusCode, String statusMsg) {
        this.setCode(statusCode);
        this.setMsg(statusMsg);
        return this;
    }
}
