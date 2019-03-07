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
@TableName("t_order_item")
@Getter
@Setter
public class TOrderItem extends Model<TOrderItem> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "order_item_id", type = IdType.AUTO)
    private Long orderItemId;
    @TableField("order_id")
    private Long orderId;
    @TableField("user_id")
    private Integer userId;
    private String status;




    @Override
    protected Serializable pkVal() {
        return this.orderItemId;
    }

    @Override
    public String toString() {
        return "TOrderItem{" +
        ", orderItemId=" + orderItemId +
        ", orderId=" + orderId +
        ", userId=" + userId +
        ", status=" + status +
        "}";
    }
}
