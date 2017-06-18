package beans;

/**
 * Created by lixusheng on 2017/5/31.
 */
public class Seat {
    int seat_id;
    String studio_name;
    int seat_row;
    int seat_column;
    short seat_status;

    public int getSeat_id() {
        return seat_id;
    }

    public void setSeat_id(int seat_id) {
        this.seat_id = seat_id;
    }

    public String getStudio_name() {
        return studio_name;
    }

    public void setStudio_name(String studio_name) {
        this.studio_name = studio_name;
    }

    public int getSeat_row() {
        return seat_row;
    }

    public void setSeat_row(int seat_row) {
        this.seat_row = seat_row;
    }

    public int getSeat_column() {
        return seat_column;
    }

    public void setSeat_column(int seat_column) {
        this.seat_column = seat_column;
    }

    public short getSeat_status() {
        return seat_status;
    }

    public void setSeat_status(short seat_status) {
        this.seat_status = seat_status;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seat_id=" + seat_id +
                ", studio_name='" + studio_name + '\'' +
                ", seat_row=" + seat_row +
                ", seat_column=" + seat_column +
                ", seat_status=" + seat_status +
                '}';
    }
}
