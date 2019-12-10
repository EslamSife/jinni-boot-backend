package com.jinniservice.backend.rest;


import com.jinniservice.backend.entites.Cleaner;
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
    public List<Cleaner> getCleaners() {
        return cleanersService.findAll();
    }


    @GetMapping("/cleaner/{cleanerId}")
    public Cleaner getCleanerById0(@PathVariable int cleanerId) {
        Cleaner theCleaner = cleanersService.getCleanerById(cleanerId);
        if(theCleaner == null) {
            throw new RuntimeException("the cleaner id not found - " + cleanerId);
        }
        return theCleaner;
    }


    @PostMapping("/cleaner")
    public Cleaner addCleaner(@RequestBody Cleaner theCleaner) {
        theCleaner.setId(0);
        cleanersService.save(theCleaner);
        return theCleaner;
    }


    @PutMapping("/cleaner")
    public Cleaner updateCleaner(@RequestBody Cleaner theCleaner) {
        cleanersService.save(theCleaner);
        return theCleaner;
    }


    @DeleteMapping("/cleaner/{cleanerId}")
    public String deleteCleaner(@PathVariable int cleanerId) {
        Cleaner theCleaner = cleanersService.getCleanerById(cleanerId);
        if(theCleaner == null) {
            throw new RuntimeException("cleaner id not found - " + cleanerId);
        }
        cleanersService.deleteById(cleanerId);
        return "Deleted cleaner with id " + cleanerId;
    }


}
