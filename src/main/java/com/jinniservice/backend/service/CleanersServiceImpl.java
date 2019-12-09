package com.jinniservice.backend.service;

import com.jinniservice.backend.dao.CleanersDAO;
import com.jinniservice.backend.entites.Cleaners;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CleanersServiceImpl implements CleanersService {

    private CleanersDAO cleanersDAO;

    @Autowired
    public CleanersServiceImpl(CleanersDAO cleanersDAO) {
        this.cleanersDAO = cleanersDAO;
    }

    @Override
    @Transactional
    public List<Cleaners> findAll() {
        return cleanersDAO.findAll();
    }

    @Override
    @Transactional
    public void save(Cleaners theCleaner) {
        cleanersDAO.save(theCleaner);
    }

    @Override
    @Transactional
    public void deleteById(int cleanerId) {
        cleanersDAO.deleteById(cleanerId);
    }

    @Override
    @Transactional
    public Cleaners getCleanerById(int cleanerId) {
        return cleanersDAO.getCleanerById(cleanerId);
    }
}
