package com.LearnPractice.UserProject.Controller;

import com.LearnPractice.UserProject.Dto.UserResponsedto;
import com.LearnPractice.UserProject.Dto.UserorderresponseDto;
import com.LearnPractice.UserProject.Dto.UsersRequestdto;
import com.LearnPractice.UserProject.Dto.orderresponse;
import com.LearnPractice.UserProject.Entity.Users;
import com.LearnPractice.UserProject.Service.UserServices;
import com.LearnPractice.UserProject.feingclient.OrderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserServices userservices;

    @GetMapping("/port")
    public String getPortNumber(){
      return  userservices.getport();
    }

    @PostMapping("/save")
    public Users saveusers(@Valid @RequestBody UsersRequestdto usersRequestdto){

        return userservices.saveusers(usersRequestdto);
    }

    @GetMapping("/allUsers")
    public List<Users> getListOfUsers(){
        return userservices.getListOfUsers();
    }

    @GetMapping("/{userId}")
    public UsersRequestdto getByUserid(@PathVariable Long userId){
        return userservices.getusersById(userId);
    }

    @GetMapping("/getordes/{userId}")
    public UserorderresponseDto getOrdersByUserId(@PathVariable Long userId){

        return  userservices.getordersbyid(userId);
    }

    @PostMapping("/savebyid/{userId}")
    public  UserorderresponseDto sendbyId(@PathVariable Long userId,@RequestBody orderresponse userdto)
    {
        return userservices.saveOrdersById(userId,userdto);
    }
}
