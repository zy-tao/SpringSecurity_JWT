package com.zyt;

import com.zyt.entity.User;
import com.zyt.mapper.MenuMapper;
import com.zyt.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.Resource;
import java.util.List;

/**
 * @className: test
 * @author: Tao_zy
 * @date: 2023/6/30
 **/
@SpringBootTest
public class MapperTest {

    @Resource
    private UserMapper userMapper;

    @Resource
    private MenuMapper menuMapper;

    @Resource
    private BCryptPasswordEncoder passwordEncoder;

    @Test
    public void testSelectPermsByUserId(){
        List<String> list = menuMapper.selectPermsByUserId(2L);
        System.out.println(list);
    }

    @Test
    public void TestBCryPasswordEncodeer(){

        // encode() 方法给一个参数，返回加密后的结果 字符串
        String encode1 = passwordEncoder.encode("1234");
        String encode2 = passwordEncoder.encode("1234");
        String encode3 = passwordEncoder.encode("1234");
        System.out.println(encode1);
        System.out.println(encode2);
        System.out.println(encode3);
        // matches() 方法，对加密后的密码进行校验
        System.out.println(passwordEncoder.
                matches("1234",
                        "$2a$10$IRIY/76rNzxcjwViN8jAyeiJ4HBIgmlQ6udsW4SEyWJ/rc4vluSJG"));
        System.out.println(passwordEncoder.
                matches("12345",
                        "$2a$10$li9rXTvCFM3muHFRJsHMM.Zybpna/UN1l.GLQevFrZJ5paC/r/Xpm"));

    }

    @Test
    public void testUserMapper(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }
}
