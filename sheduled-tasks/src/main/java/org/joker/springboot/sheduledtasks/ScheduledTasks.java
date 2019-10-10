package org.joker.springboot.sheduledtasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author dk-joker
 * @version 1.0.0
 * @since 2019-10-10 19:27
 */
@Component
public class ScheduledTasks {
    private static final Logger log = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

//    /**
//     * fixedRate：固定速率执行。每5秒执行一次。
//     */
//    @Scheduled(fixedRate = 5000)
//    public void reportCurrentTimeWithFixedRate() {
//        log.info("Current Thread : {}", Thread.currentThread().getName());
//        log.info("Fixed Rate Task : The time is now {}", dateFormat.format(new Date()));
//    }

//    /**
//     * fixedDelay：固定延迟执行。距离上一次调用成功后2秒才执。
//     */
//    @Scheduled(fixedDelay = 2000)
//    public void reportCurrentTimeWithFixedDelay() {
//        try {
//            TimeUnit.SECONDS.sleep(0);
//            log.info("Fixed Delay Task : The time is now {}", dateFormat.format(new Date()));
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    /**
//     * initialDelay:初始延迟。任务的第一次执行将延迟5秒，然后将以5秒的固定间隔执行。
//     */
//    @Scheduled(initialDelay = 5000, fixedRate = 2000)
//    public void reportCurrentTimeWithInitialDelay() {
//        log.info("Fixed Rate Task with Initial Delay : The time is now {}", dateFormat.format(new Date()));
//    }
//
    /**
     * cron：使用Cron表达式。　每分钟的1-10秒运行
     */
    @Scheduled(cron = "1-10 * * * * ? ")
    public void reportCurrentTimeWithCronExpression() {
        log.info("Cron Expression: The time is now {}", dateFormat.format(new Date()));
    }
}

