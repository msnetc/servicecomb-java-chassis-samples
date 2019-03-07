package cn.medsci.paas.demo.entity;

import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ${author}
 * @since 2019-03-07
 */
@Getter
@Setter
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    @TableField("user_id")
    private Long userId;
    private String username;
    private String password;
    private String name;
    private Integer gender;
    private String remark;
    @TableField("create_time")
    private Date createTime;

    @Override
    protected Serializable pkVal() {
        return this.userId;
    }

    @Override
    public String toString() {
        return "User{" +
        ", userId=" + userId +
        ", username=" + username +
        ", password=" + password +
        ", name=" + name +
        ", gender=" + gender +
        ", remark=" + remark +
        ", createTime=" + createTime +
        "}";
    }
}
