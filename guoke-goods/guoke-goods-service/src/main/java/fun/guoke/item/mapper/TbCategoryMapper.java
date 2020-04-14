package fun.guoke.item.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import fun.guoke.item.entity.TbCategory;

/**
 * <p>
 * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系 Mapper 接口
 * </p>
 *
 * @author zhous
 * @since 2020-04-14
 */
public interface TbCategoryMapper extends BaseMapper<TbCategory> {

}
