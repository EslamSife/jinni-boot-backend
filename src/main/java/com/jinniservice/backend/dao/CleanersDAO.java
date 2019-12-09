package com.jinniservice.backend.dao;


import com.jinniservice.backend.entites.Cleaners;

import java.util.List;

public interface CleanersDAO {


    // remove all public modifier
     List<Cleaners> findAll();


     // test
     void save(Cleaners theCleaner);

     void deleteById(int cleanerId);

     Cleaners getCleanerById(int cleanerId);

}
