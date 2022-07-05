package eu.javaca.playground.pojos;

import eu.javaca.playground.Target;
import eu.javaca.playground.simple.example.Book;
import eu.javaca.playground.simple.example.Hobby;
import eu.javaca.playground.simple.example.Worker;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EverythingPojo {
    public int[] intArray;
    public Worker worker;
    public List<? super Worker> workerList;
    public BigDecimal amount;
    public Target target;
    public Map<String, LocalDate> dateMap;
    public boolean alive;
    public String address;

    HashMap<Hobby, Book> hobbyBookMap;
}
