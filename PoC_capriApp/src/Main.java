import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int count = 0;

        List<String> questions = Question.getQuestions();
        Iterator listIterator = Question.getIterator();


        System.out.println("-------- Você está afim do seu melhor amigo? --------\n");
        System.out.println("Esse programa fará várias perguntas diferentes e aceitará apenas as entradas 'S' e 'N' \n");


        while(listIterator.hasNext()){

            String question = listIterator.next().toString();
            System.out.println(question);
            String answer = scanner.nextLine();

            if(answer.equalsIgnoreCase("S")){
                count++;
            }
        }

        System.out.println(resultFinder(count));

    }

    private static String resultFinder(int count){
        switch (count){

            case 0,1,2:
                return "\nVocê colocou seu melhor amigo na friendzone. O que é ótimo porque talvez ele seja " +
                        "apenas seu amigo";
            case 3,4:
                return "\nTalvez haja amor, talvez seja hormônios. Vale a pena experimentar uns cinco minutos " +
                        "de trocação de beijo sem estragar a amizade.";
            case 5,6:
                return "\nÉ o amor /Que mexe com minha cabeça e me deixa assim/ Que faz eu pensar em você e " +
                        "esquecer de mim/ Que faz eu esquecer que a vida é feita pra viver";
        }
        return null;
    }
}