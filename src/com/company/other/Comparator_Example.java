package com.company.other;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Comparator_Example {

    public static void main(String[] args) {

        ArrayList<Question> list = new ArrayList<>();

        list.add(new Question(2, 2, "a"));
        list.add(new Question(3, 3, "b"));
        list.add(new Question(4, 4, "c"));
        list.add(new Question(4, 1, "d"));
        list.add(new Question(2, 5, "e"));
        list.add(new Question(3, 6, "f"));
        list.add(new Question(2, 9, "g"));
        list.add(new Question(3, 8, "h"));
        list.add(new Question(2, 7, "i"));
        list.add(new Question(3, 11, "j"));
        list.add(new Question(2, 15, "k"));
        list.add(new Question(3, 12, "l"));
        list.add(new Question(3, 14, "m"));
        list.add(new Question(2, 10, "n"));
        list.add(new Question(3, 11, "o"));

//        list.sort(Comparator.comparingInt(Question::getPriority));

        Collections.sort(list, (o1, o2) -> o1.getPriority() - o2.getPriority());

        for(Question question: list) {
            System.out.println(question.getName() + " " + question.getPriority());
        }


    }

}

class Question{
    int id;
    int priority;
    String name;

    Question(int id, int priority, String name){
        this.id =id;
        this.priority =priority;
        this.name=name;
    }

    int getPriority(){
        return priority;
    }
    String getName(){
        return name;
    }
}