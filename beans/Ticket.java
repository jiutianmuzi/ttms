package beans;

import java.sql.Timestamp;

/**
 * Created by lixusheng on 2017/5/31.
 */
public class Ticket {

    int ticket_id;
    String ticket_play_name;
    String ticket_studio_name;
    String ticket_seller;
    int ticket_price;
    int ticket_seat_row;
    int ticket_seat_col;
    int ticket_status;
    Timestamp ticket_time;

    public int getTicket_id() {
        return ticket_id;
    }

    public void setTicket_id(int ticket_id) {
        this.ticket_id = ticket_id;
    }

    public String getTicket_play_name() {
        return ticket_play_name;
    }

    public void setTicket_play_name(String ticket_play_name) {
        this.ticket_play_name = ticket_play_name;
    }

    public String getTicket_studio_name() {
        return ticket_studio_name;
    }

    public void setTicket_studio_name(String ticket_studio_name) {
        this.ticket_studio_name = ticket_studio_name;
    }

    public String getTicket_seller() {
        return ticket_seller;
    }

    public void setTicket_seller(String ticket_seller) {
        this.ticket_seller = ticket_seller;
    }

    public int getTicket_price() {
        return ticket_price;
    }

    public void setTicket_price(int ticket_price) {
        this.ticket_price = ticket_price;
    }

    public int getTicket_seat_row() {
        return ticket_seat_row;
    }

    public void setTicket_seat_row(int ticket_seat_row) {
        this.ticket_seat_row = ticket_seat_row;
    }

    public int getTicket_seat_col() {
        return ticket_seat_col;
    }

    public void setTicket_seat_col(int ticket_seat_col) {
        this.ticket_seat_col = ticket_seat_col;
    }

    public int getTicket_status() {
        return ticket_status;
    }

    public void setTicket_status(int ticket_status) {
        this.ticket_status = ticket_status;
    }

    public Timestamp getTicket_time() {
        return ticket_time;
    }

    public void setTicket_time(Timestamp ticket_time) {
        this.ticket_time = ticket_time;
    }
}
