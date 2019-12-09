package com.jinniservice.backend.dao;


import com.jinniservice.backend.entites.Cleaners;

import java.util.List;

public interface CleanersDAO {


    // test
     List<Cleaners> findAll();

     void save(Cleaners theCleaner);

     void deleteById(int cleanerId);

     Cleaners getCleanerById(int cleanerId);

}
