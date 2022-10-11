package com.mycompany.mavenproject1;
import java.awt.Point;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author danil
 */
public class Mavenproject1 {
  

public interface PacientyInterface {

    public String getText();
    public Integer getAge();
    public String getColor();
    public String getObject();
    
    public void destructor();
}    


public class Raccons implements PacientyInterface   
{
    private String color; 
    private Integer age; 
    private Integer sizeOfMasck;
    
    
    public Raccons(){
        this.color = "Unknown";
        this.age = -1;
        this.sizeOfMasck = -1;
    }
    
    public Raccons(String color,Integer age,Integer sizeOfMasck){
        this.color = color;
        this.age = age;
        this.sizeOfMasck = sizeOfMasck;
    }
    
    public Raccons(Raccons raccons){
        this.color=raccons.color;
        this.age=raccons.age;
        this.sizeOfMasck = raccons.sizeOfMasck;
    }

        @Override
        public Integer getAge() {
            return age;
        }

        @Override
        public String getObject() {
            return sizeOfMasck.toString();
        }

        @Override
        public String getColor() {
            return color;
        }

        @Override
        public String getText() {
            return "Размер маски енотика ";
        }

        @Override
        public void destructor() {
            System.gc();
        }


    }

public class Golubi implements PacientyInterface  
{
    private String color; 
    private Integer age; 
    private Integer sizeOfPeryev;
    
    public Golubi(String color,Integer age,Integer sizeOfPeryev){
        this.color = color;
        this.age = age;
        this.sizeOfPeryev = sizeOfPeryev;
    }
    public Golubi(){
        this.color = "Unknown";
        this.age = -1;
        this.sizeOfPeryev = -1;
    }
    
    public Golubi(Golubi golubi){
        this.color = golubi.color;
        this.age = golubi.age;
        this.sizeOfPeryev = golubi.sizeOfPeryev;

    }
    

        @Override
        public Integer getAge() {
            return age;
        }

        @Override
        public String getColor() {
            return color;
        }

        @Override
        public String getObject() {
            return sizeOfPeryev.toString();
        }

        @Override
        public String getText() {
            return "Размер перьев голубя ";
        }

        @Override
        public void destructor() {
             System.gc();
        }
    }




public static void main(String[] args) {     
        ArrayList list = new ArrayList();
        Scanner in = new Scanner(System.in);
                   
        System.out.println("Выберите, что сделать");
        System.out.println("0) Выйти");
        System.out.println("1) Добавить элемент");
        System.out.println("2) Удалить элемент");
        int n = in.nextInt();
        
        while(n!=0){

            
            if (n==1){
                int num = 3;
                while(num!=0){
                    System.out.println("Добавить Енотика или Голубя?");
                    System.out.println("0) Нет");
                    System.out.println("1) Енотик:xD");
                    System.out.println("2) Голубь(P.s. курлык)");
                    num = in.nextInt();
                    if (num == 1)
                    {
                        System.out.println("Введите цвет живтоного");
                        String color = in.next();
                        System.out.println("Введите сколько полных лет енот-енотычу");
                        int age = in.nextInt();
                        System.out.println("Введите размер маски енотика");
                        int sizeOfMasck = in.nextInt();

                        Raccons raccons = new Mavenproject1().new Raccons(color,age,sizeOfMasck);

                        System.out.println("Создан обьект:\n"+"\nс возрастом: "+
                                raccons.getAge()+"\nимеющее цвет: " + raccons.getColor()+
                                "\nразмер маски енотика: "+ raccons.getObject());
                        list.add(raccons);
                    }
                    if (num == 2)
                    {
                        System.out.println("Введите цвет живтоного");
                        String color = in.next();
                        System.out.println("Введите сколько полных лет курлыкычу");
                        int age = in.nextInt();
                        System.out.println("Введите размер перьев голубя");
                        int sizeOfPeryev = in.nextInt();


                        Golubi golubi = new Mavenproject1().new Golubi(color,age,sizeOfPeryev);

                        System.out.println("Создан обьект:\n"+"\nс возрастом: "+
                                golubi.getAge()+"\nимеющее цвет: " + golubi.getColor()+"\nразмер перьев голубя: "+ golubi.getObject());
                        list.add(golubi);
                    }

                }

            }
            if (n == 2){
                if (list.size()==0)
                {System.out.println("В листе нету обьектов");}
                else {
                    printList1(list);
                    System.out.println("Введите номер, который вы хотите удалить");
                    int code = in.nextInt();
                    if (code <= list.size()) {
                        list.remove(code - 1);
                    }
                }
            }
                //in.close();
                System.out.println("Выберите, что сделать");
                System.out.println("0) Выйти");
                System.out.println("1) Добавить элемент");
                System.out.println("2) Удалить элемент");
                n = in.nextInt();
        }
    }
    public static void printList1(ArrayList<PacientyInterface> list) {
            System.out.println("");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(i+1+") ");
                System.out.println("Возраст животного: "+list.get(i).getAge());
                System.out.println("Цвет живтоного: "+list.get(i).getColor());
                System.out.println(list.get(i).getText() + " " + list.get(i).getObject());
                System.out.println("");
            }}
}
