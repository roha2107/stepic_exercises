public abstract class Building {
    String name;
    String address;
    int year;
    String architectName;
    boolean isCultural;
}
class Library extends Building{
    int floor;
    boolean ticket;

    public Library(int floor, boolean ticket) {
        this.floor = floor;
        this.ticket = ticket;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setTicket(boolean ticket) {
        this.ticket = ticket;
    }

    void isWorking(){
        if(floor>2){
            System.out.println("Library is closed for technical reasons:(");
        }
        else System.out.println("Welcome!");
    }
    void isTicket(){
        if(ticket) System.out.println("What book you are searching for?");
        else System.out.println("Please, first register for reading ticket.");
    }


    public String toString() {
        return "Building: "+ getClass() + ", floor:" + getFloor();
    }
}
class House extends Building implements LivingHouse{
    int floor;
    boolean key;

    public House(int floor, boolean key) {
        this.floor = floor;
        this.key = key;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public boolean isKey() {
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }
    void comeIn(){
        if(key) System.out.println("Come in!");
        else System.out.println("Where did you lost your keys?!");
    }
    void rightHouse(){
        if(floor==3) System.out.println("You're at home");
        else System.out.println("This is not your house!");
    }

    public String toString() {
        return "Building: "+ getClass() + ", floor:" + getFloor();
   }

    @Override
    public void isThereALift() {
        if(floor>3) System.out.println("Yes, there is a lift:)");
        else System.out.println("Walking is good for health:)");
    }

    @Override
    public int howManyFloors() {
        return floor;
    }
}
class PoliceDepartment extends Building implements SocialHouse{
    int floor;
    int time;

    public PoliceDepartment(int floor, int time) {
        this.floor = floor;
        this.time = time;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    void whatFloor(){
        if(floor==2) System.out.println("Yes, you are here!");
        else System.out.println("Wrong floor!");
    }
    void whatTime(){
        if(time>17) System.out.println("You are late!");
        else System.out.println("Thank you for coming");
    }
    public String toString() {
        return "Building: "+ getClass() + ", floor:" + getFloor();
    }

    @Override
    public boolean isOpen() {
        if(time>17) return false;
        return true;
    }

    @Override
    public void welcoming() {
        if(time>17) System.out.println("Police Department is closed");
        else System.out.println("welcome!");
    }
}
class University extends Building implements SocialHouse{
    int year;
    String day;
    boolean isStudent;

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public University(int year, String day, boolean isStudent) {
        this.year = year;
        this.day = day;
        this.isStudent = isStudent;
    }
    public boolean isOpen(){
        if(!day.equals("Sunday")) return true;
        return false;
    }

    @Override
    public void welcoming() {
        if(!day.equals("Sunday")) System.out.println("Welcome!");
        else System.out.println("Uni is closed");
    }

    void exams(){
        if(isStudent) System.out.println("Good luck on your exams!");
        else System.out.println("Being teacher is not easy, right?");
    }
    public String toString() {
        return "Building: "+ getClass() + ", year: " + getYear() + ", day: " + getDay();
    }
}
class ShoppingCenter extends Building implements SocialHouse{
    int floor;
    int time;

    public ShoppingCenter(int floor, int time) {
        this.floor = floor;
        this.time = time;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    public boolean isOpen(){
        return time < 18;
    }
    public void welcoming(){
        System.out.println("welcome to shopping center Keruen City");
    }
    public String toString() {
        return "Building: "+ getClass() + ", floor:" + getFloor();
    }
}