package fun.guoke.common.entity;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class A {
    private Long id;

    private String name;

    private Date age;

    private List<A> list;

}
