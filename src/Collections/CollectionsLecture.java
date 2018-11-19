package Collections;

import java.util.*;

public class CollectionsLecture {

    public static void main(String[] args) {
        // creating ArrayLists

        ArrayList<Integer> numbers = new ArrayList<>(); // array list of numbers
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // PEEKING INTO LIST

//        System.out.println(numbers); // [1, 2, 3]

        // GET ELEMENTS
//        System.out.println(numbers.get(0));


        // ADDING ELEMENTS
//        numbers.add(20);
//        System.out.println(numbers); // 1, 2, 3, 20
//
//        numbers.add(0, 21 );
//        System.out.println(numbers); // 21, 1, 2, 3, 20

        // EDITING ELEMENTS
//        numbers.set(0, 100);
//        System.out.println(numbers); // [100, ...,...]
//        numbers.set(1, 200);
//        System.out.println(numbers); // [100, 200, ...]

        // REMOVING ELEMENTS
        numbers.remove(1);

//        System.out.println(numbers); // [1, 3]


        ArrayList<String> names = new ArrayList<>(); // array list of names
        names.add("Stephen");
        names.add("Liz");
        names.add("Miley");

//        System.out.println(names); // [Stephen, Liz, Miley]
        names.remove(0);
//        System.out.println(names); // [Liz, Miley]


        // REORDERING LIST
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.reverse(numbers);
        System.out.println(numbers);

        // INFO ABOUT LIST AND GETTING ELEMENTS
//        System.out.println(numbers.indexOf(3)); // 0 (it's reversed) [3, 1]
//        System.out.println(numbers);



        // ANOTHER WAY TO MAKE LIST
        List<String> name = new ArrayList<>(Arrays.asList(
                "Stephen",
                "Liz",
                "Miley"
        ));
//        System.out.println(name); // [Stephen, Liz, Miley]

//        ArrayList numbers = new ArrayList();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);

        int number = (int)numbers.get(0);

//        System.out.println(number); // [1, 2, 3]

        //

        ArrayList<String> roasts = new ArrayList<>();
        roasts.add("medium");
        roasts.add("light");
        roasts.add("medium");
        roasts.add("dark");

        // .contains
//        System.out.println(roasts.contains("espresso")); // false
//        System.out.println(roasts.contains("dark")); // true

        // .lastIndexOf
//        System.out.println(roasts.lastIndexOf("medium")); // 2

        // .isEmpty
//        System.out.println(roasts.isEmpty()); // false

        // .remove
//        System.out.println(roasts.remove("espresso")); // false


        // HASH MAP
        // =======================================================
        // We'll start by defining a hash map
        HashMap<String, String> usernames = new HashMap<>();

        // and putting some data into it
        usernames.put("Ryan", "ryanorsinger");
        usernames.put("Zach", "zgulde");
        usernames.put("Fernando", "fmendozaro");
        usernames.put("Justin", "jreich5");

        System.out.println(usernames);
        // {Ryan=ryanorsinger, Zach=zgulde, Fernando=fmendozaro, Justin=jreich5}


        // GETTING VALUES FROM AND INFO ABOUT HASH MAP
        System.out.println(usernames); // {Ryan=ryanorsinger, Zach=zgulde, Fernando=fmendozaro, Justin=jreich5}
        System.out.println(usernames.get("Justin")); // jreich5
        System.out.println(usernames.get("Phillip")); // nul
        System.out.println(usernames.getOrDefault("Jason", "gocodeup")); // gocodeup


        // UPDATING HASH MAPS
        usernames.put("Ryan", "rorsinger");
        System.out.println(usernames);
        // {Ryan=rorsinger, Zach=zgulde, Fernando=fmendozaro, Justin=jreich5}

//        usernames.putIfAbsent("Zach", "zgulde");
        usernames.putIfAbsent("Zach", "coderdude24");
        System.out.println(usernames);

        // REPLACE
        usernames.replace("Ryan", "torvalds");
        System.out.println(usernames);
//        {Ryan=torvalds, Zach=zgulde, Fernando=fmendozaro, Justin=jreich5}

        // checking if keys or values are present
        System.out.println(usernames.containsKey("Justin")); // true
        System.out.println(usernames.containsValue("fmendozaro")); // true

        // removing parts from hash map
        usernames.remove("Zach");
        System.out.println(usernames); //{Ryan=torvalds, Fernando=fmendozaro, Justin=jreich5}

//        usernames.clear();
//        System.out.println(usernames); // {}


    }
}
