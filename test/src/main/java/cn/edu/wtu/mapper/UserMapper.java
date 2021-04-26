package cn.edu.wtu.mapper;

import cn.edu.wtu.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    List<User> queryUserList();

    User queryUserById(int id);

    Integer addUser(User user);

    Integer updateUser(User user);

    Integer deleteUser(int id);

}
