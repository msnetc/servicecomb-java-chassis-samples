package cn.medsci.paas.demo.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
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
@TableName("t_order")
@Getter
@Setter
public class TOrder extends Model<TOrder> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "order_id", type = IdType.AUTO)
    private Long orderId;
    @TableField("user_id")
    private Integer userId;
    private String status;

    @Override
    protected Serializable pkVal() {
        return this.orderId;
    }

    @Override
    public String toString() {
        return "TOrder{" +
        ", orderId=" + orderId +
        ", userId=" + userId +
        ", status=" + status +
        "}";
    }
}
