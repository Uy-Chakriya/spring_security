package org.chakriya.spring_security.repository;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.chakriya.spring_security.enity.AppUser;

@Mapper
public interface AppUserRepository {
    @Results(id = "userMapper", value = {
            @Result(property = "userId", column = "user_id"),
            @Result(property = "fullName", column = "full_name"),
//            @Result(property = "", column = "")
    })
    @Select("""
            select * from app_users where email = #{email}
            
            
            """)
    AppUser getUserByEmail(String email);

}
