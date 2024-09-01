//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("задача 1");
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age +
                    " , то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age +
                    " , то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println("");
        System.out.println("задача 2");
        int degrees = 6;
        if (degrees >= 5) {
            System.out.println("На улице " + degrees + " градусов  можно идти без шапки");
        } else {
            System.out.println("На улице " + degrees + " градусов нужно надеть шапку");
        }
        System.out.println("");
        System.out.println("задача 3");
        int speedCar = 75;
        if (speedCar > 60) {
            System.out.println("Если скорость " + speedCar + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speedCar + " , то можно ездить спокойно");
        }
        System.out.println("");
        System.out.println("задача 4");
        int agePerson = 13;
        if (agePerson >= 2 && agePerson <= 6){
            System.out.println("Если возраст человека равен " + agePerson +
                    " , то ему нужно ходить в детский сад");
        }
        if (agePerson >= 7 && agePerson <= 17){
            System.out.println("Если возраст человека равен " + agePerson +
                    " , то ему нужно ходить в школу");
        }
        if (agePerson >= 18 && agePerson <=24){
            System.out.println("Если возраст человека равен " + agePerson +
                    " , то ему нужно ходить в университет");
        }
        if (agePerson > 24) {
            System.out.println("Если возраст человека равен " + agePerson +
                    " , то ему нужно ходить на работу");
        }
        System.out.println("");
        System.out.println("задача 5");
        int ageKid = 9;
        if (ageKid < 5) {
            System.out.println("Если возраст ребенка равен" + ageKid +
                    " то ему нельзя кататься на аттракционе");
        }
        if (ageKid >= 5 &&  ageKid <14){
            System.out.println ("Если возраст ребенка равен" + ageKid +
                    " то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        if (ageKid >= 14) {
            System.out.println("Если возраст ребенка равен" + ageKid +
                    " то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println("");
        System.out.println("задача 6");
        int personInCarriage = 75;
        if (personInCarriage > 102) {
            System.out.println("Мест в вагоне нет");
        } else {
            System.out.println("В вагоне осталось " + (102 - personInCarriage) + " мест в вагоне");
        }
        if (personInCarriage >= 60) {
            System.out.println("В вагоне осталось 0 сидячих мест, а стоячих осталось"
                    + (102 - personInCarriage));
        } else {
            System.out.println("В вагоне осталось " + (102 - personInCarriage) +
                    " сидячих мест, а стоячих осталось 62 места");
        }
        System.out.println("");
        System.out.println("задача 7");
        int one = 5;
        int two = 123;
        int three = 87;
        if (one > two && one > three) {
            System.out.println("Число " + one + " самое большое");
        }
        if (two > one && two > three) {
            System.out.println("Число " + two + " самое большое");
        } else {
            System.out.println("Число " + three + " самое большое");
        }
    }
}