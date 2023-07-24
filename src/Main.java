class Main{

    public static void main(String[] args) {
        KinoPark kinoPark = new KinoPark("Rakhima", "Avengers", 18, true, 20 );
        if(kinoPark.isOpen()) kinoPark.welcoming();
        System.out.println(kinoPark.getFilm());
        System.out.println("Beginning at: " + kinoPark.getTime() + ":00");
        System.out.println("Please, take your seats!");
    }
}