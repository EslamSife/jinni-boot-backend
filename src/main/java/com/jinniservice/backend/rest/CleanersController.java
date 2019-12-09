package com.jinniservice.backend.rest;


import com.jinniservice.backend.entites.Cleaners;
import com.jinniservice.backend.service.CleanersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class CleanersController {


    private CleanersService cleanersService;

    @Autowired
    public CleanersController(CleanersService cleanersService) {
        this.cleanersService = cleanersService;
    }

    @GetMapping("/cleaners")
    public List<Cleaners> getCleaners() {
        return cleanersService.findAll();
    }


    @GetMapping("/cleaners/{cleanerId}")
    public Cleaners getCleanerById0(@PathVariable int cleanerId) {
        Cleaners theCleaner = cleanersService.getCleanerById(cleanerId);
        if(theCleaner == null) {
            throw new RuntimeException("the cleaner id not found - " + cleanerId);
        }
        return theCleaner;
    }


    @PostMapping("/cleaners")
    public Cleaners addCleaner(@RequestBody Cleaners theCleaner) {
        theCleaner.setId(0);
        cleanersService.save(theCleaner);
        return theCleaner;
    }


    @PutMapping("/cleaners")
    public Cleaners updateCleaner(@RequestBody Cleaners theCleaner) {
        cleanersService.save(theCleaner);
        return theCleaner;
    }


    @DeleteMapping("/cleaners/{cleanerId}")
    public String deleteCleaner(@PathVariable int cleanerId) {
        Cleaners theCleaner = cleanersService.getCleanerById(cleanerId);
        if(theCleaner == null) {
            throw new RuntimeException("cleaner id not found - " + cleanerId);
        }
        cleanersService.deleteById(cleanerId);
        return "Deleted cleaner with id " + cleanerId;
    }


}
