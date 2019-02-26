package org.apache.servicecomb.samples.boot.simple;

import io.swagger.annotations.ApiModelProperty;


public class HelloDto {
    @ApiModelProperty(value = "name", notes = "名称", allowEmptyValue = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
