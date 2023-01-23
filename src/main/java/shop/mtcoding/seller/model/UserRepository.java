package shop.mtcoding.seller.model;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {
    
    public int insert(User user);

    public User findByUsernameAndPwd(User user);
}
