package run.cupidr.app.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

/**
 * @author wanghaoran
 * @date 2020/7/10 20:38:52
 * @description User
 */
@Data
@Builder
@EqualsAndHashCode(callSuper = false)
@ToString
public class User extends Model<User> {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String account;

    private String phone;

    private String password;

    private String salt;

    private String name;

    private Date createTime;

    private Date updateTime;

    private Integer status;

    /**
     * 逻辑删除
     */
    @TableLogic
    @TableField(select = false)
    private Boolean isDeleted;
}
