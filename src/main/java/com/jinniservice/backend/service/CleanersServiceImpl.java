package com.jinniservice.backend.service;

import com.jinniservice.backend.dao.CleanerRepository;
import com.jinniservice.backend.entites.Cleaner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CleanersServiceImpl implements CleanersService {

    private CleanerRepository cleanerRepository;

    @Autowired
    public CleanersServiceImpl(CleanerRepository cleanerRepository) {
        this.cleanerRepository = cleanerRepository;
    }

    @Override
    public List<Cleaner> findAll() {
        return cleanerRepository.findAll();
    }

    @Override
    public void save(Cleaner theCleaner) {
        cleanerRepository.save(theCleaner);
    }

    @Override
    public void deleteById(int cleanerId) {
        cleanerRepository.deleteById(cleanerId);
    }

    @Override
    public Cleaner getCleanerById(int cleanerId) {
        Optional<Cleaner> result =  cleanerRepository.findById(cleanerId);
        Cleaner theCleaner;
        if(result.isPresent()) {
            theCleaner = result.get();
        } else {
            // we did not find the cleaner
            throw new RuntimeException("did not find the cleaner with id - " + cleanerId);
        }
        return theCleaner;
    }
}
