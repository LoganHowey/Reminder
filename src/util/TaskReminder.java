package util;

import java.util.Timer;

public class TaskReminder{

    public TaskReminder(String brandName){

    }

    public void run(){

        class Reminder{
            private Timer timer;

            public Reminder(int seconds, Timer timer){
                this.timer = timer;
                timer.schedule(timer, seconds);
            }
        }
    }


}
