package fun.guoke.item.service;

import com.baomidou.mybatisplus.extension.service.IService;
import fun.guoke.item.entity.TbBrand;

/**
 * <p>
 * 品牌表，一个品牌下有多个商品（spu），一对多关系 服务类
 * </p>
 *
 * @author zhous
 * @since 2020-04-14
 */
public interface ITbBrandService extends IService<TbBrand> {

}
