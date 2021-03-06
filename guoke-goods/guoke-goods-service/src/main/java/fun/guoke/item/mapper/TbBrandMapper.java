package fun.guoke.item.mapper;

import fun.guoke.item.entity.TbBrand;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 品牌表，一个品牌下有多个商品（spu），一对多关系 Mapper 接口
 * </p>
 *
 * @author zhous
 * @since 2020-04-14
 */
public interface TbBrandMapper extends BaseMapper<TbBrand> {

}
