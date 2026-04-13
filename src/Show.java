import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    public void addActorToList(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.printf(
                    "Актёр %s %s уже участвует в данной постановке.%n", actor.getSurname(), actor.getName()
            );
        } else {
            listOfActors.add(actor);
        }
    }

    public void replaceActors(Actor newActor, String replacedActorSurname) {
        for (int actorIndex = 0; actorIndex < listOfActors.size(); actorIndex++) {
            if (listOfActors.get(actorIndex).getSurname().equals(replacedActorSurname)) {
                listOfActors.set(actorIndex, newActor);
                return;
            }
        }
        System.out.printf(
                "Актер с фамилией %s в постановке не участвует, не получается заменить на %s %s.%n",
                replacedActorSurname, newActor.getSurname(), newActor.getName()
        );
    }

    public void printDirectorInfo() {
        System.out.println(director);
    }

    public void printActorsList() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    @Override
    public String toString() {
        return "Постановка{" +
                "Название: '" + title + '\'' +
                ", продолжительность: " + duration +
                ", режиссёр: " + director +
                ", список актёров: " + listOfActors +
                '}';
    }
}
