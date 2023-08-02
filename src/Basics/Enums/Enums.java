package Basics.Enums;

import static java.lang.System.out;

public class Enums {
    public Enums() {
        Day currentDay = Day.SATURDAY;
        out.println("Current day is " + currentDay);

        MovieGenre favMovieGenre = MovieGenre.ADVENTURE;
        out.println("My favourite move genre is " + favMovieGenre);

        DeveloperLevel devLevel = DeveloperLevel.POTATO;
        out.println("My level in Java development is " + devLevel);

        BagItem[] bagItems = BagItem.values();

        for (BagItem bagItem : bagItems) {
            out.println(bagItem);
        }

        out.println("Laptop order in bag is " + BagItem.LAPTOP.ordinal());


    }

    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    enum MovieGenre {
        DRAMA,
        PHANTASY,
        ADVENTURE,
        COMEDY,
        SLASHER
    }

    enum DeveloperLevel {
        POTATO,
        JUNIOR,
        MIDDLE,
        SENIOR
    }

    enum BagItem {
        PEN,
        COPYBOOK,
        LAPTOP,
        CHARGING_DEVICE,
        MOUSE
    }
}
