package com.sai.user.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sai.user.Entity.User;

@Service
public class UserServiceImpl implements UserService {

    public static int usersCount=5;
    private static List<User> users=new ArrayList<>();
    static{
        users.add(new User(1, "Sai",new Date()));
        users.add(new User(2, "Vishnu",new Date()));
        users.add(new User(3, "Mani",new Date()));
        users.add(new User(4, "Jack",new Date()));
        users.add(new User(5, "Adam",new Date()));

    }

    @Override
    public List<User> findAll() {
        return users;       
    }

    @Override
    public User save(User user) {
        if(user.getId()==null){
            user.setId(++usersCount);
        }
        users.add(user);
        return user;    
    }

    @Override
    public User findone(int id) {
        for(User user:users){
            if(user.getId()==id){
                return user;
            }         
        }return null;
       
    }

    @Override
    public User deleteById(int id) {
        Iterator<User> itr=users.iterator();
        while(itr.hasNext()){
            User user=itr.next();
            if(user.getId()==id){
                itr.remove();
                return user;
            }
        }return null;
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }
    
    
}


/*  public User deleteById(int id){
        Iterator<User> itr= users.iterator();
        While(itr.hasNext()){
            User user=itr.next();
            if(user.getId()==id){
                itr.remove();
                return user;

            }
        }
}
 * 
 * 
*/