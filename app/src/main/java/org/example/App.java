package org.example;

public class App {
   public static void main(String[] args){
        ForLoop loop = new ForLoop();
        UsingStream stream = new UsingStream();

        int[] nums = {5, 10, 18, 5, 2, 1, 16};

        System.out.println("|Using For Loop|");
        System.out.println("Maximum: " + loop.maximumUsingForLoop(nums));
        System.out.println("Minimum: " + loop.minimumUsingForLoop(nums));
        System.out.println("Sum: " + loop.sumUsingForLoop(nums));
        System.out.println("Average: " + loop.averageUsingForLoop(nums));

        System.out.println("|Using Streams|");
        System.out.println("Maximum: " + stream.maximumUsingStream(nums));
        System.out.println("Minimum: " + stream.minimumUsingStream(nums));
        System.out.println("Sum: " + stream.sumUsingStream(nums));
        System.out.println("Average: " + stream.averageUsingStream(nums));
   }
}
