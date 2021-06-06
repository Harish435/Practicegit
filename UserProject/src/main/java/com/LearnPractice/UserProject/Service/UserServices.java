package com.LearnPractice.UserProject.Service;

import com.LearnPractice.UserProject.Dto.UserResponsedto;
import com.LearnPractice.UserProject.Dto.UserorderresponseDto;
import com.LearnPractice.UserProject.Dto.UsersRequestdto;
import com.LearnPractice.UserProject.Dto.orderresponse;
import com.LearnPractice.UserProject.Entity.Users;

import java.util.List;

public interface UserServices {
    Users saveusers(UsersRequestdto usersRequestdto);

    List<Users> getListOfUsers();

    UsersRequestdto getusersById(Long userId);

    UserorderresponseDto getordersbyid(Long userId);

    UserorderresponseDto saveOrdersById(Long userId, orderresponse userdto);

    String getport();
}
