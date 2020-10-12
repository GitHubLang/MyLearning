package 多线程.线程池;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ShecduledThreadP {
    public static void main(String[] args) {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(2);

        pool.schedule(()->{
            System.out.println("延迟任务！");
        },1, TimeUnit.SECONDS);

        pool.scheduleAtFixedRate(()->{
            System.out.println("按一定频率执行任务");
        },1,1,TimeUnit.SECONDS);

        //每周四 18:00:00 定时执行任务
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime thursday = now.with(DayOfWeek.THURSDAY).withHour(18).withMinute(0).withSecond(0);
        if(now.compareTo(thursday)>=0){
            thursday = thursday.plusWeeks(1);
        }

        long initalDelay = Duration.between(thursday,now).toMillis();
        long weeks = 1000*60*60*24*7L;

        pool.scheduleWithFixedDelay(()->{
            System.out.println("每周四下午18：00：00执行！");
        },initalDelay,weeks,TimeUnit.MILLISECONDS);


    }
}
