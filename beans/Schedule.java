package beans;

import java.sql.Timestamp;

/**
 * Created by lixusheng on 2017/5/31.
 */
public class Schedule {
    int sched_id;
    String studio_name;
    int play_id;
    Timestamp sched_time;
    Double sched_ticket_price;

    public int getSched_id() {
        return sched_id;
    }

    public void setSched_id(int sched_id) {
        this.sched_id = sched_id;
    }

    public String getStudio_name() {
        return studio_name;
    }

    public void setStudio_name(String studio_name) {
        this.studio_name = studio_name;
    }

    public int getPlay_id() {
        return play_id;
    }

    public void setPlay_id(int play_id) {
        this.play_id = play_id;
    }

    public Timestamp getSched_time() {
        return sched_time;
    }

    public void setSched_time(Timestamp sched_time) {
        this.sched_time = sched_time;
    }

    public Double getSched_ticket_price() {
        return sched_ticket_price;
    }

    public void setSched_ticket_price(Double sched_ticket_price) {
        this.sched_ticket_price = sched_ticket_price;
    }


}
