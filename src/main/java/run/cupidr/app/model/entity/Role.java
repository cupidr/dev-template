package run.cupidr.app.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

/**
 * @author wanghaoran
 * @date 2020/7/11 01:08:52
 * @description role
 */
@Data
@Builder
@EqualsAndHashCode(callSuper = false)
@ToString
public class Role extends Model<Role> {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String roleName;

    private Date createTime;

    private Date updateTime;

    @TableLogic
    @TableField(select = false)
    private Boolean isDeleted;

}
