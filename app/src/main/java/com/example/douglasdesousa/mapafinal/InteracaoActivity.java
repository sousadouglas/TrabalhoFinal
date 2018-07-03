package com.example.douglasdesousa.mapafinal;

public class InteracaoActivity {

private String Questions[]={
        "Qual a Capital do Brasil?",
        "Quantas Vezes o Brasil foi Campeao do mundo de futebol?",
        "Quantos estados tem o Brasil?",
        "Quem é o atual presidente?",
        "Qual a Capital do Japão?",
        "Quantas Vezes o Japão foi Campeao do mundo de futebol?",
        "Quantos estados tem o Japão?",
        "Quem é o atual presidente Japão?",
        "Qual a Capital do Canada?",
        "Quantas Vezes o Canada foi Campeao do mundo de futebol?",
        "Quantos estados tem o Canada?",
        "Quem é o atual presidente Canada?",
        "Qual a Capital da Russia?",
        "Quantas Vezes o Russia foi Campeao do mundo de futebol?",
        "Quantos estados tem a Russia?",
        "Quem é o atual presidente da Russia?",
        "Qual a Capital do China?",
        "Quantas Vezes o China foi Campeao do mundo de futebol?",
        "Quantos estados tem a China?",
        "Quem é o atual presidente da China?",
        "Qua a Capital do Argentina?",
        "Quantas Vezes o Argentina foi Campeao do mundo de futebol?",
        "Quantos estados tem o Argentina?",
        "Quem é o atual presidente da Argentina?",
        "Qua a Capital do Alemanha?",
        "Quantas Vezes o Alemanha foi Campeao do mundo de futebol?",
        "Quantos estados tem o Alemanha?",
        "Quem é o atual presidente da Alemanha?",
        "Qua a Capital do Italia?",
        "Quantas Vezes o Italia foi Campeao do mundo de futebol?",
        "Quantos estados tem a Italia?",
        "Quem é o atual presidente da Italia?",
        "Qua a Capital do Eua?",
        "Quantas Vezes o EUA foi Campeao do mundo de futebol?",
        "Quantos estados tem o EUA?",
        "Quem é o atual presidente do EUA?",
        "Qua a Capital do França?",
        "Quantas Vezes o França foi Campeao do mundo de futebol?",
        "Quantos estados tem o Franca?",
        "Quem é o atual presidente da França?"


};



private String Choise [][]={

        {"Brasilia", "Rio de Janeiro", "Amazonia","São paulo"},
        {"2","5","6","7"},
        {"26","27","24","23"},
        {"Lula","Dilma","Mixel Temer","Fernando Henrrique"},
        {"Tokyo","Takau","Moscou","Honkong"},
        {"0","1","2","3"},
        {"46","10","11","47"},
        {"Jack Chan","Akihito","Tacarache","Takaro"},
        {"Vilage","Toronto","Ottawa","Van Couver"},
        {"0","1","3","4"},
        {"9","8","7","10"},
        {"Michael","Stephen Haper","Douglas caio", "Morgan"},
        {"Moscou","Tokyo","Toronto","Brasil"},
        {"0","1","2","3"},
        {"50","80","70","40"},
        {"Vladimir Putin", "Cristina", "Leonardo","Mickelangelo"},
        {"Toquio","Pequim", "Irochima", "Tanakara"},
        {"0","1","2","4"},
        {"40","41","45","48"},
        {"Akihito", "Jack Chan","Xi Jinping","Marco"},
        {"Florença","LA Bomboneira","Buenos Aires","Coco"},
        {"1","2","3","4"},
        {"21","20","23","24"},
        {"Mauricio Macri","Cristina","Margarita","Vladimir"},
        {"Monaco","Berlim","Soto","João Envile"},
        {"4","3","2","1"},
        {"16","17","15","14"},
        {"Vladimir","Chicago","Mauro","Frank Walter"},
        {"Roma","Chicago","Romenia","Kioto"},
        {"3","4","5","6"},
        {"20","21","22","23"},
        {"Sergio Mattarella","Marieta","Morgana","Matilda"},
        {"Washington","Chicago","New York","Moscou"},
        {"0","1","3","4"},
        {"50","55","60","70"},
        {"Donald Trump","Bill Gates","Obama","Maria do Rosario"},
        {"Paris","Berlim","Chicago","Rio"},
        {"1","2","3","4"},
        {"26","24","23","22"},
        {"Emmanuel Macron","Vladimir","Dilma","Joelma"},




};


private String CorrectAnsers[]={"Brasilia","5","26","Mixel Temer","Tokyo","0","46","Akihito","Ottawa","0","10","Stephen Haper","Toronto","0","50","Vladimir Putin","Pequim","4","40","Xi Jinping","Buenos Aires","3","21","Mauricio Macri",

        "Berlim","4","14","Frank Walter","Roma","3","20","Sergio Mattarella","Washington","0","50","Donald Trump","Paris","1","26","Emmanuel Macron"};




public String getQuestion (int a){

String question= Questions[a];
return question;

}



public String getChoice(int a){
    String choice0=Choise[a][0];
    return choice0;

}


    public String getChoice1(int a){
        String choice1=Choise[a][1];
        return choice1;

    }

    public String getChoice2(int a){
        String choice2=Choise[a][2];
        return choice2;

    }
    public String getChoice3(int a){
        String choice3=Choise[a][3];
        return choice3;

    }

    public String getChoice4(int a){
        String choice4=Choise[a][4];
        return choice4;

    }

    public String getCorrectAwnser(int a){
    String answer=  CorrectAnsers[a];
    return answer;

    }




}
