package fun.guoke.item.service;

import com.baomidou.mybatisplus.extension.service.IService;
import fun.guoke.item.entity.TbCategory;

/**
 * <p>
 * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系 服务类
 * </p>
 *
 * @author zhous
 * @since 2020-04-14
 */
public interface ITbCategoryService extends IService<TbCategory> {

}
