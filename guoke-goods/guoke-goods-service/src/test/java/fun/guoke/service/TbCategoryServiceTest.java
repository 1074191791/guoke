package fun.guoke.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import fun.guoke.common.utils.BeanCopierUtils;
import fun.guoke.item.dto.TbCategoryDTO;
import fun.guoke.item.entity.TbCategory;
import fun.guoke.item.service.ITbCategoryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TbCategoryServiceTest {

    @Autowired
    private ITbCategoryService tbCategoryService;

    @Test
    public void test() {
        List<TbCategory> parent_id = tbCategoryService.list(new QueryWrapper<TbCategory>().eq("parent_id", 11));
        List<TbCategoryDTO> res = BeanCopierUtils.convertList(parent_id, TbCategoryDTO.class);
        System.out.println(res);
    }


}
