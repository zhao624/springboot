package com.zxg;

import com.zxg.bean.*;
import com.zxg.mapper.IBannerMapper;
import com.zxg.mapper.IContentMapper;
import com.zxg.mapper.IUserMapper;
import com.zxg.util.MD5PwdUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@MapperScan("com.zxg.mapper")
@RunWith(SpringRunner.class)
@SpringBootTest
public class ZxgApplicationTests {

    @Autowired()
    private IBannerMapper bannerMapper;

    @Test
    public void getBanner() {
        List<Banner> list = bannerMapper.getBanner();
        for (Banner banner : list) {
            System.out.println(banner);
        }
    }

    /*@Test
    public void updateBanner() {
        Banner banner = new Banner();
        banner.setId(1);
        banner.setImg("http://upload-images.jianshu.io/upload_images/7361314-c028c69d0d72c6a4.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240");
        banner.setUrl("http://localhost:8080/zhaocmsapp/content2/1");
        banner.setTitle("Test");
        banner.setDescription("Test");
        banner.setStatus(1);

        int flag=bannerMapper.updateBanner(banner);
        System.out.println(flag);
    }*/
    /*@Test
    public void addBanner(){
        Banner banner = new Banner();
        banner.setImg("http://upload-images.jianshu.io/upload_images/7361314-c028c69d0d72c6a4.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240");
        banner.setUrl("http://localhost:8080/zhaocmsapp/content2/1");
        banner.setTitle("Test");
        banner.setDescription("Test");
        banner.setStatus(1);
        int flag=bannerMapper.addBanner(banner);
        System.out.println(flag);
    }*/

    //category类测试
  /*  @Autowired
    private ICategoryMapper categoryMapper;

    @Test
    public void showCategory() {
        List<Category> list = categoryMapper.quertAllCategory();
        for (Category cate : list) {
            System.out.println(cate);
        }
    }

    @Test
    public void addCate() {
        Category category = new Category();
        category.setName("test");
        category.setStatus(1);
        int flag = categoryMapper.addCategroy(category);
        System.out.println(flag);
    }
    @Test
    public void updateCate(){
        Category category = new Category();
        category.setStatus(0);
        int flag = categoryMapper.update(category);
        System.out.println(flag);
    }*/
    @Autowired()
    private IContentMapper contentMapper;

    /*@Test
    public void getContents() {
        List<Content> list = contentMapper.findContent(new Params());
        System.out.println(list.get(0).getContent());
    }

    @Test
    public void getCount() {
        System.out.println(contentMapper.getCount());
    }

    @Test
    public void addCount() {
        Content content = new Content();
        content.setTitle("Test");
        content.setDescription("Test");
        content.setContent("test");
        content.setImg("test");
        content.setHits(20);
        content.setLoves(10);
        content.setStatus(1);
        content.setUserId(1);
        int flag=contentMapper.addContent(content);
        System.out.println(flag);
    }
    @Test
    public void updateContent(){
        Content content = new Content();
        content.setId(22);
        content.setTitle("Test");
        content.setContent("test");
        content.setImg("test");
        content.setHits(20);
        content.setLoves(10);
        content.setStatus(1);
        content.setUserId(1);
        int flag=contentMapper.update(content);
        System.out.println(flag);
    }*/


    @Autowired
    private IUserMapper userMapper;

    @Test
    public void getLogin() {
        User u = userMapper.getLogin("11111111111", MD5PwdUtil.md5Base64("123456"));
        System.out.printf(u.getUsername() + "================================>");
    }
    @Test
    public void addUser(){
        User user = new User();
        user.setUsername("zhaoxugui");
        user.setAccount("17673163010");
        user.setPassword(MD5PwdUtil.md5Base64("123456"));
        user.setActive(1);
        int flag = userMapper.addUser(user);
        System.out.println(flag);
    }
    @Test
    public void updateUser(){
        User user = new User();
        user.setUsername("zhaoxugui");
        user.setAccount("17673163010");
        user.setPassword(MD5PwdUtil.md5Base64("123456"));
        user.setActive(0);
        user.setId(9);
        int flag = userMapper.update(user);
        System.out.println(flag);
    }
    @Test
    public void keyword(){
        Params p = new Params();
        p.setKeyword("ad");
        List<User> users=userMapper.getUsersByKeyword(p);
        for (User u: users
                ) {
            System.out.println(u.toString());
        }
    }

    @Test
    public void getUsersCount() {
        System.out.println(userMapper.getUsersCount(new Params()));
    }
}
