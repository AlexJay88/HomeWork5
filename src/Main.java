public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }




    public static void task1 () {
        System.out.println("Задача 1");
        int clientOS=0;
        if (clientOS == 1)
            System.out.println("«Установите версию приложения для iOS по ссылке»");
            if (clientOS == 1)
                System.out.println("«Установите версию приложения для Android по ссылке»");}


        public static void task2 () {
            System.out.println("Задача 2");
            int clientOS = 1;
            int clientDeviceYear = 2015;
            if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("«Установите облегченную версию приложения для iOS по ссылке»");}
            if (clientOS == 0 && clientDeviceYear >= 2015){
                System.out.println("«Установите версию приложения для iOS по ссылке»");}
            if (clientOS == 1 && clientDeviceYear < 2015) {
                System.out.println("«Установите облегченную версию приложения для Android по ссылке»");}
            if (clientOS == 1 && clientDeviceYear >= 2015) {
                System.out.println("«Установите версию приложения для Android по ссылке»");}


}


        public static void task3 () {
            System.out.println("Задача 3");
            int year = 2020;

            if (year%4!=0||year%100==0&&year%400!=0) {
                System.out.println("«год  не является високосным»");}
            else {
                System.out.println ("«год  является високосным»");}
        }

    public static void task4 () {
        System.out.println("Задача 4");

     int deliveryDistance = 80;
        if (deliveryDistance>0&&deliveryDistance<20){
            System.out.println("« доставка занимает 1 день,если расстояние до 20 км»");}
        if (deliveryDistance>=20&&deliveryDistance<60){
            System.out.println("«доставка занимает 2 дня ,если расстояние от 20 до 60 км»");}
        if (deliveryDistance>=60&&deliveryDistance<100){
            System.out.println("«доставка занимает 3 дня,если расстояние от 60 до 100 км»");}
        if (deliveryDistance>=100){
            System.out.println("«нет доставки,если расстояние более 100 км»");}


}
    public static void task5 () {
        System.out.println("Задача 5");
        int monthNumber = 2;

            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Зима");
                    break;

                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Такого времени года не существует");
            }
            }
            }



















