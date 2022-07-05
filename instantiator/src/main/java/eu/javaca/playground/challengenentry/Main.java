package eu.javaca.playground.challengenentry;

import eu.javaca.playground.Target;
import eu.javaca.playground.simple.example.SimpleTestClass;

public class Main {
    public static void main(String[] args) {
        Instantiator instantiator = new Instantiator();
        System.out.println(instantiator.instantiate(SimpleTestClass.class, Target.XML));
    }
}
