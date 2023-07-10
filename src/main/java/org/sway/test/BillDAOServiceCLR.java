package org.sway.test;

import java.util.Date;
// import java.util.Calendar;
// import java.util.GregorianCalendar;
// import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.sway.test.entity.Bill;
import org.sway.test.service.BillDAOService;

@Component
public class BillDAOServiceCLR implements CommandLineRunner{

    private static final Logger log = LoggerFactory.getLogger(BillDAOServiceCLR.class);

    @Autowired
    private BillDAOService billDaoService;

    @Override
    public void run(String... args) throws Exception {

        // TimeZone tz = TimeZone.getTimeZone("America/Washington_DC");
        // Calendar calendar = new GregorianCalendar(tz);
        Date now1 = new Date();
        Date now2 = new Date();
        Date now3 = new Date();
        // calendar.setTime(now3)

        Bill bill = new Bill("Name", "Title", "Summary", "Status", "Category", "Level", "Chamber", "Link", "User Vote Path", "Audiobucket Path", "Audio Byline", now1, now2, now3,
                9999, true, true, false);

        // (revisit)
        long insert = billDaoService.insert(bill);
        log.info("New Bill created: " + bill);
    }
    

}
