package com.LearnPractice.UserProject.Service.ServiceImpl;

import com.LearnPractice.UserProject.Dto.UserResponsedto;
import com.LearnPractice.UserProject.Dto.UserorderresponseDto;
import com.LearnPractice.UserProject.Dto.UsersRequestdto;
import com.LearnPractice.UserProject.Dto.orderresponse;
import com.LearnPractice.UserProject.Entity.Users;
import com.LearnPractice.UserProject.Repository.UsersRepository;
import com.LearnPractice.UserProject.Service.UserServices;

import com.LearnPractice.UserProject.feingclient.OrderClient;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserServices {

    @Autowired
    UsersRepository usersRepository;
    @Autowired
    OrderClient orderClient;

    @Override
    public Users saveusers(UsersRequestdto usersRequestdto) {
      int u= Integer.parseInt(usersRequestdto.getPhoneNumber());
      usersRequestdto.setPhoneNumber(String.valueOf(u));
       Users theusers=new Users();
       BeanUtils.copyProperties(usersRequestdto,theusers);
        return usersRepository.save(theusers);
    }


    public List<Users> getListOfUsers(){
        return  usersRepository.findAll();
    }

    @Override
    public UsersRequestdto getusersById(Long userId) {
        Optional<Users> u=usersRepository.findById(userId);
        UsersRequestdto usersRequestdto=new UsersRequestdto();
        if(u.isPresent()){
          usersRequestdto.setUserName(u.get().getUserName());
          usersRequestdto.setEmail(u.get().getEmail());
          usersRequestdto.setPhoneNumber(u.get().getPhoneNumber());
          return usersRequestdto;
        }
       return null;
    }

    @Override
    public UserorderresponseDto getordersbyid(Long userId) {

        List<orderresponse> o= orderClient.getOrdersByUserId(userId);

        Optional<Users> user=usersRepository.findById(userId);
        UserorderresponseDto odr=new UserorderresponseDto();
        if(user.isPresent()){
            odr.setUser(user.get());
            odr.setOrders(o);
            return odr;
        }
        return null;
    }

    @Override
    public UserorderresponseDto saveOrdersById(Long userId, orderresponse userdto) {
        List<orderresponse> o=  orderClient.postByid(userId,userdto);
        UserorderresponseDto odr=new UserorderresponseDto();
        odr.setOrders(o);
         return odr;
    }

    @Override
    public String getport() {
        return orderClient.getPortNumber();
    }
}
