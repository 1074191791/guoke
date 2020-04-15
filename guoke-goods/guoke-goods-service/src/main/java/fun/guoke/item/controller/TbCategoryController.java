package fun.guoke.item.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import fun.guoke.common.utils.BeanCopierUtils;
import fun.guoke.item.dto.TbCategoryDTO;
import fun.guoke.item.entity.TbCategory;
import fun.guoke.item.service.ITbCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 商品类目表，类目和商品(spu)是一对多关系，类目与品牌是多对多关系 前端控制器
 * </p>
 *
 * @author zhous
 * @since 2020-04-14
 */
@RestController
@RequestMapping("category")
public class TbCategoryController {

    @Autowired
    private ITbCategoryService tbCategoryService;

    @GetMapping("list")
    public List<TbCategoryDTO> queryByParentID(@RequestParam(value = "pid", defaultValue = "0") Long pid) {
        List<TbCategory> parent_id = tbCategoryService.list(new QueryWrapper<TbCategory>().eq("parent_id", pid));
        List<TbCategoryDTO> res = BeanCopierUtils.convertList(parent_id, TbCategoryDTO.class);
        return res;
    }

}
