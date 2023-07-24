public class KinoPark implements SocialHouse{
    String name;
    String film;
    int year;
    boolean ticket;
    int time;

    public KinoPark(String name, String film, int year, boolean ticket, int time) {
        this.name = name;
        this.film = film;
        this.year = year;
        this.ticket = ticket;
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isTicket() {
        return ticket;
    }

    public void setTicket(boolean ticket) {
        this.ticket = ticket;
    }

    @Override
    public boolean isOpen() {
        if(time>10) return true;
        return false;
    }

    @Override
    public void welcoming() {
        System.out.println("Welcome! Can you provide your ticket, please?");
    }
}