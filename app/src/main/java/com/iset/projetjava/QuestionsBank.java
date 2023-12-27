package com.iset.projetjava;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {
    private static List<QuestionsList>SportQuestion(){
        final List<QuestionsList>questionsLists =new ArrayList<>();
        //create objet questionlist class and pass a question along with options and answer
        final  QuestionsList question1 =new QuestionsList("Quelle est la durée réglementaire d'un match de football (soccer) au niveau international ?","80 minutes","90 minutes","100 minutes"," 120 minutes","","90 minutes");
        final  QuestionsList question2 =new QuestionsList("Qui a remporté le Tour de France en 2020 ?"," Chris Froome","Egan Bernal"," Tadej Pogačar"," Tadej Pogačar","","adej Pogačar");
        final  QuestionsList question3=new QuestionsList("Dans quel sport le terme \"birdie\" est-il utilisé ?","Tennis","Golf","Natation","Basketball","","Golf");
        final  QuestionsList question4 =new QuestionsList("Quelle est la longueur d'un marathon en kilomètres ?","21 km","26,2 km","42 km"," 50 km","","42 km");
        final  QuestionsList question5 =new QuestionsList("Quelle équipe a remporté la Coupe du Monde de la FIFA en 2018 ?"," Allemagne"," Brésil"," France","Argentine","","France");
        final  QuestionsList question6 =new QuestionsList("Dans quel sport l'équipement appelé \"épée\" est-il utilisé ?","Escrime","Tennis","Cricket"," Lutte","","Escrime");
        //add all question to <QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        return questionsLists;

    }
    private static List<QuestionsList>GéographieQuestion(){
        final List<QuestionsList>questionsLists =new ArrayList<>();
        //create objet questionlist class and pass a question along with options and answer
        final  QuestionsList question1 =new QuestionsList("Quel pays est à la fois en Europe et en Asie ?"," Grèce","Italie"," Turquie"," Ukraine","","Turquie");
        final  QuestionsList question2 =new QuestionsList("Quelle est la plus grande rivière d'Amérique du Sud en termes de débit ?"," L'Amazone","Le Parana","L'Orénoque"," Le Rio de la Plata","","L'Amazone");
        final  QuestionsList question3=new QuestionsList("Quelle mer est située entre l'Europe et l'Asie ?","Mer Méditerranée"," Mer Noire"," Mer Caspienne","Mer Rouge","","Mer Caspienne");
        final  QuestionsList question4 =new QuestionsList("Dans quel pays se trouve le Mont Everest, la plus haute montagne du monde ?"," Népal"," Inde"," Chine"," Bhoutan","","Népal");
        final  QuestionsList question5 =new QuestionsList("Quelle est la capitale de l'Australie ?"," Sydney","Melbourne","  Brisbane","Canberra","","Canberra");
        final  QuestionsList question6 =new QuestionsList("Quel est le plus grand continent en superficie ?"," Afrique","Europe"," Asie"," Amérique du Nord","","Asie");
        //add all question to <QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        return questionsLists;

    }
    private static List<QuestionsList>PolitiqueQuestion(){
        final List<QuestionsList>questionsLists =new ArrayList<>();
        //create objet questionlist class and pass a question along with options and answer
        final  QuestionsList question1 =new QuestionsList("Qui est le président des États-Unis en 2022 ?","Joe Biden","Donald Trump","  Barack Obama"," George W. Bush","","Joe Biden");
        final  QuestionsList question2 =new QuestionsList("Quel pays est dirigé par le président Emmanuel Macron ?","Allemagne"," Royaume-Uni"," Espagne"," France","","France");
        final  QuestionsList question3=new QuestionsList("Dans quel pays le président Jair Bolsonaro est-il en fonction ?","Mexique"," Brésil"," Argentine","Chili",""," Brésil");
        final  QuestionsList question4 =new QuestionsList("Quelle organisation internationale est basée à New York et a pour objectif principal de promouvoir la paix mondiale ?","  OTAN"," ONU","OPEP"," UNESCO","","ONU");
        final  QuestionsList question5 =new QuestionsList("Quel poste Angela Merkel a-t-elle occupé en Allemagne pendant plusieurs années ?","  Présidente","Chancelière","  Ministre des Finances","Ministre des Affaires étrangères","","Chancelière");
        final  QuestionsList question6 =new QuestionsList("Quel pays est gouverné par le président Vladimir Poutine ?"," Ukraine","Biélorussie"," Russie","  Kazakhstan","","Russie");
        //add all question to <QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        return questionsLists;

    }

    private static List<QuestionsList>technologieQuestion(){
        final List<QuestionsList>questionsLists =new ArrayList<>();
        //create objet questionlist class and pass a question along with options and answer
        final  QuestionsList question1 =new QuestionsList("Quelle entreprise a lancé le smartphone iPhone ?"," Samsung","Google"," Apple"," Microsoft","","Apple");
        final  QuestionsList question2 =new QuestionsList("Quel système d'exploitation est développé par Google et basé sur le noyau Linux ?","Windows","iOS","Android"," macOS","","Android");
        final  QuestionsList question3=new QuestionsList("Quelle technologie sans fil est utilisée pour la connexion entre les appareils à courte distance, comme les écouteurs et les smartphones ?"," 3G","Bluetooth"," NFC","Wi-Fi",""," Bluetooth");
        final  QuestionsList question4 =new QuestionsList("Quel terme désigne un grand réseau d'ordinateurs connectés à travers le monde ?","   LAN"," Intranet"," Extranet"," Internet","","Internet");
        final  QuestionsList question5 =new QuestionsList("Quel est le nom de la technologie utilisée pour stocker des données sur des disques durs à l'aide de lasers ?"," SSD","HDD","  Blu-ray","CD-ROM","","Blu-ray");
        final  QuestionsList question6 =new QuestionsList("Quel langage de programmation est principalement utilisé pour le développement web côté client ?","  Java","C#"," PHP"," JavaScript","","JavaScript");
        //add all question to <QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        return questionsLists;

    }
public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "Sport":
                return SportQuestion();
            case "Géographie":
                return GéographieQuestion();
            case "Politique":
                return PolitiqueQuestion();
            case "Technologie":
                return technologieQuestion();
        }
    return null;
}


}
