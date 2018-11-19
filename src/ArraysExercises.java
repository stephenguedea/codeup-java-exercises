import java.util.Arrays;

    public class ArraysExercises {

        public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers)); // [1, 2, 3, 4, 5]


            // Create an array that holds 3 Person objects.
            Person[] people = new Person[3];

            // Assign a new instance of the Person class to each element.
            Person p1 = new Person("John");
            Person p2 = new Person("Ringo");
            Person p3 = new Person("Paul");
            Person p4 = new Person("Ray");

            people[0] = p1;
            people[1] = p2;
            people[2] = p3;

            people = addPerson(people, p4);

            // Iterate through the array and print out the name of each person in the array.
            for (Person p : people) {
                System.out.println(p.getName());
            }
        }

//        people[3] = p4;

            // Create a static method named addPerson.
//      It should accept an array of Person objects, as well as a single person object to add to the passed array.
//      It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.



        public static Person[] addPerson(Person[] people, Person person){
            Person[] arrayCopy = Arrays.copyOf(people, people.length + 1);
//        System.out.println(arrayCopy[arrayCopy.length - 1]);
//        System.out.println(arrayCopy);
            arrayCopy[arrayCopy.length - 1] = person;
//                    System.out.println(person.getName());

            return arrayCopy;
        }
    }




