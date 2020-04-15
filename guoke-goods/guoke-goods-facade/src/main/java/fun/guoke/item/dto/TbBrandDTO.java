package fun.guoke.item.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class TbBrandDTO implements Serializable {

    private static final long serialVersionUID = 8313616196640202435L;

    /**
     * 品牌id
     */
    private Long id;

    /**
     * 品牌名称
     */
    private String name;

    /**
     * 品牌图片地址
     */
    private String image;

    /**
     * 品牌的首字母
     */
    private String letter;

}
