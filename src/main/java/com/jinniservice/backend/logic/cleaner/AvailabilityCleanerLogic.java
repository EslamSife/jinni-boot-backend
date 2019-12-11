package com.jinniservice.backend.logic.cleaner;

import com.jinniservice.backend.entites.Cleaner;

import java.util.Date;
import java.util.List;

public class AvailabilityCleanerLogic {


    // algorithm of select cleaner


    // first must be has not job or order on this day
    public boolean hasOrderOnThisDay(Date dateOfOrder){
        // query on database to know if has order on this date
        return  false;
    }

    // must be has not vacation
    public boolean hasVacationOnThisDay(Date dateOfOrder) {
        // query on database to know if has vacation on this day
        return false;
    }




}
