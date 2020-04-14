package fun.guoke.item.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import fun.guoke.item.entity.TbCategory;
import fun.guoke.item.mapper.TbCategoryMapper;
import fun.guoke.item.service.ITbCategoryService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系 服务实现类
 * </p>
 *
 * @author zhous
 * @since 2020-04-14
 */
@Service
public class TbCategoryServiceImpl extends ServiceImpl<TbCategoryMapper, TbCategory> implements ITbCategoryService {

}
