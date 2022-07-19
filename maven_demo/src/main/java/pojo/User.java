package pojo;

import lombok.*;
import lombok.extern.slf4j.Slf4j;
import java.lang.String;

@Getter
@Setter
//@Data   //data包括@Getter@Setter@ToString@EqualsAndHashCode@RequiredArgsConstructor
@EqualsAndHashCode//重写squals方法 用来判断对象的值是否相等  而不是判断对象的引用地址是否相等
@ToString
@Slf4j
@AllArgsConstructor//构造所有参数的
//@NoArgsConstructor//无参的
@RequiredArgsConstructor//需要的参数构成  final必须要
//@Value    所有都设置成final
public class User {

    private final int  id;//final 表示必须
    private  String name;

    public void mylog(){

    }
}
