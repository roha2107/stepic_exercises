public class WritingMaterials {
    String name;
    String color;
    int price;
    double length;
    boolean draw;
    int id;
    static int counter = 1;
    final static String description = "This is class WritingMaterials";
    {
        name = "Static name";
        color = "Static red";
    }

    public WritingMaterials() {
        id = counter++;
    }

    public WritingMaterials(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public WritingMaterials(String name, int price) {
        this.name = name;
        this.price = price;
        this.color = "No Color";
    }

    public WritingMaterials(int price, double length, boolean draw) {
        this.price = price;
        this.length = length;
        this.draw = draw;
        this.name = "No Name";
        this.color = "No Color";
    }

    public WritingMaterials(String name, String color, int price, double length, boolean draw) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = draw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isDraw() {
        return draw;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }
    void display(){
        System.out.println("Название: <" + name + ">, Цвет: <" + color + ">, Длина: <" +
                length + ">, Цена: <" + price + ">, Умеет рисовать: <" + (isDraw() ? "Да>." : "Нет>."));
    }
    void replace_rod(String color){
        this.color = color;
    }
    void priceUp(int price){
        this.price += price;
    }
    void priceDown(int price){
        this.price -= price;
    }
    void draw(){
        System.out.println(name + (isDraw() ? " провёл линий: 1. Их цвет-" + color + "." : " не может ничего нарисовать." ));
    }
    void draw(int n){
        System.out.println(name + (isDraw() ? " провёл линий: " + n + ". Их цвет-" + color + "." : " не может ничего нарисовать." ));
    }
    void draw(String color){
        System.out.println(name + (isDraw() ? " провёл линий: 1. Их цвет-" + color + "." : " не может ничего нарисовать." ));
    }
    void draw(String color, int n){
        System.out.println(name + (isDraw() ? " провёл линий: " + n + ". Их цвет-" + color + "." : " не может ничего нарисовать." ));
    }
    static void iCan(){
        System.out.println("I am writing material!");
    }
    public String toString(){
        return "This is " + getClass() + ". ID: " + id + ". Name: " + name + ", color: " + color;
    }
}

class Pen extends WritingMaterials{
    int countColor = 1;
    boolean auto;
    {
        name = "Static pen";
        color = "red";
    }

    public int getCountColor() {
        return countColor;
    }

    public void setCountColor(int countColor) {
        this.countColor = countColor;
    }

    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }

    public Pen(){
        this.draw = true;
        this.color = "No Color";
    }
    void writeMyName(){
        System.out.println("Rakhima");
    }
    @Override
    void display(){
        System.out.println("This is " + getClass() + ". Name: " + name + ", color: " + color);
    }
    public String toString(){
        return "This is " + getClass() + ". ID: " + id + ". Name: " + name + ", color: " + color;
    }
}
final class Ruler extends WritingMaterials{
    double length;
    boolean wood;
    {
        name = "Static ruler";
        color = "Red";
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    public boolean isWood() {
        return wood;
    }

    public void setWood(boolean wood) {
        this.wood = wood;
    }

    public Ruler(){
        this.draw = false;
        this.color = "No Color";
    }
    void measure(){
        System.out.println("Сейчас померяем длину");
    }
    @Override
    void display(){
        System.out.println("This is " + getClass() + ". Name: " + name + ", wood: " + color);
    }
}

class Divider extends WritingMaterials{
    String dividerType;
    boolean metal;
    {
        name = "Static divider";
        color = "No color";
    }
    public Divider(){
        this.draw = true;
        this.color = "No Color";
    }

    public String getDividerType() {
        return dividerType;
    }

    public void setDividerType(String dividerType) {
        this.dividerType = dividerType;
    }

    public boolean isMetal() {
        return metal;
    }

    public void setMetal(boolean metal) {
        this.metal = metal;
    }
    final void draw_circle(){
        System.out.println("Нарисован final круг");
    }
    @Override
    void display(){
        System.out.println("This is " + getClass() + ". Name: " + name + ", color: " + color);
    }
}