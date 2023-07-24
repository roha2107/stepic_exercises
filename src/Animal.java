public class Animal {
    String type;
    String name;
    int age;
    double weight;
    boolean isFly;
    boolean isWalk;
    boolean isSwim;
    static final String description = "This is class Animal";
    static int counter = 1;
    int id;

    {
        String name = "No name";
        String type = "No type";
    }
    public Animal(){
        id = counter++;
    }
    public Animal(String type, String name){
        this.type = type;
        this.name = name;
    }

    public Animal(String type, int age) {
        this.type = type;
        this.name = "No name";
        this.age = age;
    }

    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isFly() {
        return isFly;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public void setWalk(boolean walk) {
        isWalk = walk;
    }

    public boolean isSwim() {
        return isSwim;
    }

    public void setSwim(boolean swim) {
        isSwim = swim;
    }
    void display(){
        System.out.println("Тип: <" + type + ">, Имя: <" + name + ">, Возраст: <" + age + ">, Вес: <" + weight + ">, " +
                "Умеет летать: " + ((isFly) ? "<Да>," : "<Нет>,") + " Умеет ходить: " + ((isWalk) ? "<Да>," : "<Нет>,")+
                " Умеет плавать: " + ((isSwim) ? "<Да>." :"<Нет>."));
    }
    final void rename(String name){
        this.name = "Final name";
    }
    void holiday(){
        this.weight += (double) 0.1;
    }
    void holiday(double m){
        weight += m;
    }
    void holiday(double m, int d){
        weight += d*m;
    }
    static void words(){
        System.out.println("Do not eat me, please!");
    }
    public String toString(){
        return "I am " + type + " and my name is " + name + ". I'm " + age + " and my id is " + id + ".";
    }
}

class Bird extends Animal{
    String area;
    boolean winterFly;
    {
        String type = "Bird";
        String name = "No name";
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isWinterFly() {
        return winterFly;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }


    @Override
    public boolean isFly() {
        return true;
    }
    public Bird(){
        this.name = name;
        this.type = "Bird";
        this.isSwim = true;
    }

    public Bird(String type, String name) {
        super(type, name);
    }
    void chirick_chirick(){
        System.out.println("Chirik-Chirik");
    }
    @Override
    void display(){
        System.out.println("I am <" + type + ">. My name: <" + name + ">, WinterFly: <" + isWinterFly() + ">.");
    }
}

final class Fish extends Animal{
    String squama;
    boolean upStreamSwim;
    {
        String type = "Fish";
        String name = "No name";
    }

    @Override
    public boolean isSwim() {
        return true;
    }

    public String getSquama() {
        return squama;
    }

    public void setSquama(String squama) {
        this.squama = squama;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }
    public Fish(){
        this.type = "Fish";
        this.isSwim = true;
    }
    public Fish(String type, String name) {
        super(type, name);
    }

    public Fish(String type, int age) {
        super(type, age);
    }

    public Fish(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
    }
    void bul_bul(){
        System.out.println("Bul-bul");
    }
    @Override
    void display(){
        System.out.println("I am <" + type + ">. My name: <" + name + ">, upStreamSwim: <" + upStreamSwim + ">.");
    }
}

class Insect extends Animal{
    int wingCount;
    boolean likeJesus;
    {
        String type = "Insect";
        String name = "No name";
    }

    public int getWingCount() {
        return wingCount;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public boolean isLikeJesus() {
        return likeJesus;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }

    @Override
    public boolean isWalk() {
        return true;
    }
    public Insect(){
        this.type = "Insect";
        this.isWalk = true;
    }

    public Insect(String type, String name) {
        super(type, name);
    }

    public Insect(String type, int age) {
        super(type, age);
    }

    public Insect(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
    }
    void ggggg(){
        System.out.println("Ggggg");
    }
    @Override
    void display(){
        System.out.println("I am <" + type + ">. My name: <" + name + ">, likeJesus: <" + likeJesus + ">.");
    }
}

