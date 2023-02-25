package POO108840;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Event implements IEvent{
    private LocalDate date;
    private List<Activity> activities;

    public Event(LocalDate date) {
        this.date = date;
        activities = new ArrayList<Activity>();
    }

    @Override
    public Event addActivity(Activity activity) {
        activities.add(activity);
        return new Event(date);
    }

    @Override
    public LocalDate getDate() {
        return date;
    }

    @Override
    public double getTotalCost() {
        double total = 0;
        for (Activity a : activities) {
            total += a.getPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        return "*** Evento em " + date + ", total=" + getTotalCost() + "\n" + activities;
    }

}
