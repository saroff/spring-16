package ru.otus;

import com.sun.tools.javac.util.List;
import io.reactivex.Observable;

@SuppressWarnings("ResultOfMethodCallIgnored")
public class Main {

    public static void main(String[] args) {
        List<String> words = List.of(
                "the",
                "quick",
                "brown",
                "fox",
                "jumped",
                "over",
                "the",
                "lazy",
                "dog");
    
        Observable.just(words)
                .subscribe(System.out::println);
    }
}
