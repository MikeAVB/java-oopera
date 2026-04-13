public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Кирилл", "Иванов", Gender.MALE, 183);
        Actor actor2 = new Actor("Ольга", "Ковалева", Gender.FEMALE, 171);
        Actor actor3 = new Actor("Александр", "Петров", Gender.MALE, 180);

        Director director1 = new Director("Дмитрий", "Крымов", Gender.MALE, 457);
        Director director2 = new Director("Юрий", "Бутусов", Gender.MALE, 343);

        Person musicAuthor = new Person("Антон", "Павлов", Gender.MALE);
        Person choreographer = new Person("Инна", "Кириллова", Gender.FEMALE);

        Show ordinaryShow = new Show("Обычный спектакль", 120, director1);
        Opera opera = new Opera("Опера", 100, director1, musicAuthor,"Текст либретто", 12);
        Ballet ballet = new Ballet("Балет", 80, director2, musicAuthor, "Текст либретто", choreographer);

        ordinaryShow.addActorToList(actor1);
        ordinaryShow.addActorToList(actor2);
        ordinaryShow.addActorToList(actor3);

        opera.addActorToList(actor2);
        opera.addActorToList(actor3);

        ballet.addActorToList(actor1);
        ballet.addActorToList(actor3);

        System.out.println("Список актеров обычного спектакля:");
        ordinaryShow.printActorsList();

        System.out.println("Список актеров оперы:");
        opera.printActorsList();

        System.out.println("Список актеров балета:");
        ballet.printActorsList();

        System.out.println("Замена Ковалевой на Иванова в опере:");
        opera.replaceActors(actor1, "Ковалева");
        opera.printActorsList();

        System.out.println("Замена Ковалевой на неё же в балете:");
        ballet.replaceActors(actor2, "Ковалева");
        ballet.printActorsList();

        opera.printLibrettoText();
        ballet.printLibrettoText();
    }
}
