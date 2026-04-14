package ru.practicum.theatre.show;

import ru.practicum.theatre.persons.Director;
import ru.practicum.theatre.persons.Person;

public class Ballet extends MusicalShow {
    private Person choreographer;

    public Ballet(String title, int duration, Director director, Person musicAuthor, String librettoText, Person choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public Person getChoreographer() {
        return choreographer;
    }

    public void setChoreographer(Person choreographer) {
        this.choreographer = choreographer;
    }
}
