package Model;

import java.util.Arrays;
import java.util.Scanner;

public class User {

private  int money ;

Bank [] banks;

    public User(Bank[] banks) {
        this.banks = banks;
    }

    public User(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void Pay(int pay) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ваш счет состовляет:");
        int a  = money-pay;
        System.out.println(a);
        if (a<pay){
            System.out.println("ЕСЛИ ХОТИТЕ МОЖЕТЕ ПОПОЛНИТЬ БАЛАНС НЕ ВЫХОДЯ ИЗ СИСТЕМЫ, ВЫ ЖЕЛАЕТЕ?(ДА/НЕТ)");
            String ch = sc.next();
            if (ch.equals("ДА")){
                System.out.println("Введите сумму:");
                int s = new Scanner(System.in).nextInt();
                int e = money + s;
                int dep = e-pay;
                System.out.println("Успешно! На вашем счёте осталось:"+dep);
            }else  {
               System.out.println("Неверный лоин или пароль, повторите попытку:");
            }
        }
        System.out.println("Бронирование машины прошла успешно");




    }

public  void Deposit( int dep,int pay){
        Scanner sc = new Scanner(System.in);
        int a = 777;
    int b = a+dep;
    System.out.println(b-pay);

    System.out.println("Бронирование машины прошла успешно");
}


    @Override
    public String toString() {
        return "User{" +
                "money='" + money + '\'' +
                '}';
    }
}
