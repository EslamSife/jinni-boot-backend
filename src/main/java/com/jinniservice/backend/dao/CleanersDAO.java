package com.jinniservice.backend.dao;


import com.jinniservice.backend.entites.Cleaners;

import java.util.List;

public interface CleanersDAO {

    public List<Cleaners> findAll();

    public void save(Cleaners theCleaner);

    public void deleteById(int cleanerId);

    public Cleaners getCleanerById(int cleanerId);

}
