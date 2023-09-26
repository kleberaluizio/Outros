import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Question {

    private static List<String> questions;
    private static Iterator iterator;

    static {

        questions = new ArrayList<>();

        questions.add("Você já sonhou que seu melhor amigo era um unicórnio voando " +
                "sobre arco-íris cor-de-rosa enquanto segurava um buquê de salsichas?");

        questions.add("Você já se viu dançando a dança do frango em homenagem ao aniversário " +
                "do seu melhor amigo, vestida de pinguim?");

        questions.add("Se seu melhor amigo fosse um sorvete, ele seria o sorvete de pistache?");

        questions.add("Você pensa em patos de borracha quando olha para o seu melhor amigo?");

        questions.add("Você já escreveu um poema de amor épico para o seu melhor amigo usando " +
                "apenas emojis de vegetais?");

        questions.add("Você acha que seu melhor amigo seria um bom companheiro numa luta contra " +
                "zumbis alienígenas usando almofadas como armas?");


        iterator = questions.iterator();
    }

    public static List<String> getQuestions(){
        return questions;
    }

    public static Iterator getIterator(){
        return iterator;
    }
}
