import Interface.CarInterface;
import Model.User;
import impl.CarInterfaceImpl;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        User user = new User(100000);
        Scanner sc= new Scanner(System.in);
//        System.out.print("ВВЕДИТЕ ИМЯ: ");
//        String name = scanner.nextLine();
//        System.out.print("ВВЕДИТЕ АДРЕС: ");
//        String address = scanner.nextLine();
//        System.out.print("ВВЕДИТЕ НОМЕР ТЕЛЕФОНА: ");
//        String phoneNumber = scanner.nextLine();
//        System.out.println("РЕГИСТРАЦИЯ КЛИЕНТА:");
//        System.out.println("ИМЯ: " + name);
//        System.out.println("АДРЕС: " + address);
//        System.out.println("НОМЕР ТЕЛЕФОНА: " + phoneNumber);

        System.out.println("ДОБРО ПОЖАЛОВАТЬ!");

             System.out.print("ВЫБЕРИТЕ МАРКУ МАШИНЫ, КОТОРУЮ ХОТЕЛИ БЫ ЗАБРОНИРОВАТЬ: ");
        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("ФЕРРАРИ");
                    break;
                case 2:
                    System.out.println("ХОНДА");
                    break;
                case 3:
                    System.out.println("МЕРС");
                    break;
                case 4:
                    System.out.println("ТОЙОТА");
                    break;
                case 5:
                    System.out.println("КИА");
                    break;
                case 6:
                    System.out.println("АУДИ");
                    break;
                case 7:
                    System.out.println("БМВ");
                default:
                    System.out.println("Неверный выбор.");

            }
            break;
        }

//            System.out.println("Цена  машины состовляет 200");
            System.out.println("РЕГИСТРАЦИЯ КЛИЕНТА");

            System.out.println("ВВЕДИТЕ ИМЯ: ");
             String name = sc.next();
            System.out.println("ВВЕДИТЕ АДРЕС: ");
            String address = sc.next();
            boolean ippp = true;
            while (ippp) {
                System.out.println("ВВЕДИТЕ НОМЕР ТЕЛЕФОНА: ");
                String num = sc.next();
                if (num.length() == 13 ) {
                    System.out.println();
                    ippp = false;
                } else {
                    System.out.println("Номер введен не корректно");
                }
            }
        System.out.println("ИМЯ: " + name);
            System.out.println("АДРЕС: " + address);

            System.out.println("Вы хотите оплатить ?");
            System.out.println("1.Да\n" +
                    "2.Пополнить счет ");
            int d = sc.nextInt();
            switch (d){
                case 1:
                    user.Pay(20000);
                    break;
                case 2 :
                     user.Deposit(2000,889);
                    break;
            }



















    }
















    }
