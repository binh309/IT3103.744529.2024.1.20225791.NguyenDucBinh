package aimProject;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    /*public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }*/
    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        // Temporarily store the title of the first DVD
        String tempTitle = dvd1.getTitle();

        // Swap the titles
        dvd1.setTitle(dvd2.getTitle());
        dvd2.setTitle(tempTitle);
    }

    public static void changeTitle(DigitalVideoDisc dvd5791, String title5791) {
        String oldTitle5791 = dvd5791.getTitle(); 
        dvd5791.setTitle(title5791);
        dvd5791 = new DigitalVideoDisc(oldTitle5791); 
    }
}
/*
public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinderellaDVD);
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

        changeTitle(jungleDVD, cinderellaDVD.getTitle());
        System.out.println("jungle dvd title: " + jungleDVD.getTitle());
    }

    public static void swap(Object o1, Object o2) {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }
    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        // Temporarily store the title of the first DVD
        String tempTitle = dvd1.getTitle();

        // Swap the titles
        dvd1.setTitle(dvd2.getTitle());
        dvd2.setTitle(tempTitle);
    }

    public static void changeTitle(DigitalVideoDisc dvd5791, String title5791) {
        String oldTitle5791 = dvd5791.getTitle(); 
        dvd5791.setTitle(title5791);
        dvd5791 = new DigitalVideoDisc(oldTitle5791); 
    }
}
*/
