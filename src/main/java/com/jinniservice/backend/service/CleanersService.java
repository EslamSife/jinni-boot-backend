package com.jinniservice.backend.service;


import com.jinniservice.backend.entites.Cleaner;

import java.util.List;

public interface CleanersService {


    List<Cleaner> findAll();

    void save(Cleaner theCleaner);

    void deleteById(int cleanerId);

    Cleaner getCleanerById(int cleanerId);

}
