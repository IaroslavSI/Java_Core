package Lesson3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer arrays[] = {1, 2, 3, 4};
        swap(arrays,0,3);



        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

        System.out.println("Задание 2:");
        System.out.println("Добавление фруктов: ");
        orangeBox1.addFruit(new Orange(),10);
        orangeBox2.addFruit(new Orange(),6);
        appleBox1.addFruit(new Apple(),7);
        appleBox2.addFruit(new Apple(),9);
        System.out.println("Коробка с апельсинами 1: "+orangeBox1.getWeight());
        System.out.println("Коробка с апельсинами 2: "+orangeBox2.getWeight());
        System.out.println("Коробка с яблоками 1: "+appleBox1.getWeight());
        System.out.println("Коробка с яблоками 2: "+appleBox2.getWeight());
        System.out.println();

        System.out.println("Сравнение: ");
        System.out.println("Коробка с апельсинами 1 равна Коробке с яблоками 1: "+orangeBox1.compare(appleBox1));
        System.out.println("Коробка с апельсинами 2 равна Коробке с яблоками 2: "+orangeBox2.compare(appleBox2));
        System.out.println();

        System.out.println("Фрукты пересыпаны в одну коробку");
        orangeBox1.pourTo(orangeBox2);
        appleBox1.pourTo(appleBox2);
        System.out.println();

        System.out.println("Взвешивание: ");
        System.out.println("Коробка с апельсинами 1: "+orangeBox1.getWeight());
        System.out.println("Коробка с апельсинами 2: "+orangeBox2.getWeight());
        System.out.println("Коробка с яблоками 1: "+appleBox1.getWeight());
        System.out.println("Коробка с яблоками 2: "+appleBox2.getWeight());


    }
    public static void swap(Object[] arrays, int n1, int n2){
        System.out.println("Задание 1:");
        System.out.println("Изначальные данные: "+Arrays.toString(arrays));
        Object sw = arrays[n1];
        arrays[n1]=arrays[n2];
        arrays[n2]=sw;
        System.out.println("Результат замены: "+Arrays.toString(arrays)+"\n");
    }

}
