package fun.guoke.item.service.impl;

import fun.guoke.item.entity.TbBrand;
import fun.guoke.item.mapper.TbBrandMapper;
import fun.guoke.item.service.ITbBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌表，一个品牌下有多个商品（spu），一对多关系 服务实现类
 * </p>
 *
 * @author zhous
 * @since 2020-04-14
 */
@Service
public class TbBrandServiceImpl extends ServiceImpl<TbBrandMapper, TbBrand> implements ITbBrandService {

}
