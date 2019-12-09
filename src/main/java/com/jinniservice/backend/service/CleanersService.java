package com.jinniservice.backend.service;


import com.jinniservice.backend.entites.Cleaners;

import java.util.List;

public interface CleanersService {


    public List<Cleaners> findAll();

    public void save(Cleaners theCleaner);

    public void deleteById(int cleanerId);

    public Cleaners getCleanerById(int cleanerId);

}
