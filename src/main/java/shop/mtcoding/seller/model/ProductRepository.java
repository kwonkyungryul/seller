package shop.mtcoding.seller.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductRepository {
    
    public List<Product> findAll();

    public Product findById(int id);

    public int insert(Product product);

    public int updateById(@Param("id") int id, @Param("name") String name, @Param("price") Integer price, @Param("qty") Integer qty);

    public int deleteById(int id);
}
