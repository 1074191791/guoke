package fun.guoke.service;

import fun.guoke.item.entity.TbBrand;
import fun.guoke.item.service.ITbBrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TbBrandServiceTest {

    @Autowired
    private ITbBrandService iTbBrandService;

    @Test
    public void selByIdTest() {
        TbBrand byId = iTbBrandService.getById("1115");
        System.out.println(byId);
    }
}
