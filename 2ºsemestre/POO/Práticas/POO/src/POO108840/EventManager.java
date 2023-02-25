package POO108840;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class EventManager {
    private String name;
    private Set<Client> clients;
    private Set<Event> events;

    public EventManager(String name) {
        this.name = name;
        clients = new HashSet<Client>();
        events = new HashSet<Event>();
    }

    public String getName() {
        return name;
    }

    public Client addClient(String n, String l) {
        clients.add(new Client(n, l));
        return new Client(n,l);
    }

    public Event addEvent(Client c, LocalDate d){ 
        events.add(new Event(d));
        return new Event(d);
    }

    public String listClients() {
        String msg = "Clients:\n";
        for (Client c : clients) {
            msg += c.getName() + " [" + c.getLocalidade() + "]\n";
        }
        return msg;
    }

    public String listEvents() {
        String events1 = "Events:\n";

        for(Client c : clients) {
            events1 += c.getName() + " [" + c.getLocalidade() + "]\n";
            for (Event e : events) {
                events1 += e.toString();
            }
        }

        return events1;
    }


}
