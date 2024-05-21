package org.example;

public class App
{
    public static void main(String[] args)
    {
        int bmw=1, kia=2, nissan=3, ford=3;
        System.out.println("result 1: " + (bmw+kia));
        System.out.println("result 2: " + (nissan+ford));

        int result1 = 3;
        int result2 = 6;
        System.out.println(result1>=result2);
        System.out.println(result1!=result2);

        if (nissan>=kia) {
            System.out.println("Bay more KIA than!");
        } else {System.out.println("Enough");}

        System.out.println(++result1);
        System.out.println(result2 - 2);
        System.out.println(result1%2);

        if (result1%2==0 || result2%2==0) {
            System.out.println("true"); } else {
            System.out.println("false");}

    }

//        String day = "wednesday";
//        switch (day) {
//            case "monday":
//                System.out.println("Good morning!");
//                break;
//            case "tuesday":
//                System.out.println("Good tuesday!");
//                break;
//            case "wednesday":
//                System.out.println("Good wednesday!");
//                break;
//            default:
//                System.out.println("Not implemented");
}