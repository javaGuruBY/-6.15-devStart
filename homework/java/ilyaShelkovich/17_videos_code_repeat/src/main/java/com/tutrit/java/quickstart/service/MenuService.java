package com.tutrit.java.quickstart.service;

import com.tutrit.java.quickstart.constants.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MenuService {
    static Logger log = LoggerFactory.getLogger("MenuService");

    public static void choice(Status status) {

        /* If else

        if(status.ordinal() < 3) {
            log.info("Not Done");
        } else if (status.ordinal() > 3) {
            log.info("Done");
        } else {
            log.info("Blocked");
        }
*/
        /* Old switch case


        switch (status) {
            case GROOMING:
                log.info("Wait for groom to do this task");
                break;
            case TO_DO:
                log.info("To do task");
                break;
            case IN_PROGRESS:
                log.info("Task in progress");
                break;
            case DONE:
            case CLOSED:
                log.info("Already done");
                break;
            default:
                log.info("Forbidden task");
                break;

        }

         */

        /* java 15 switch case
        switch (status) {
            case GROOMING -> log.info("Wait for groom to do this task");
            case TO_DO -> log.info("To do task");
            case IN_PROGRESS -> log.info("Task in progress");
            case DONE, CLOSED -> log.info("Already done");
            default -> log.info("Forbidden task");
        }

         */
    }
}
