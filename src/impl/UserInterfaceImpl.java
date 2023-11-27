package impl;

import Interface.UserInterface;

public class UserInterfaceImpl implements UserInterface {


    @Override
    public void Pay() {

        System.out.println("Ваш счет состовляет:");
        int a = 2000;
        int pay = 200000;
        System.out.println(pay-a);
        System.out.println("Бронирование машины прошла успешно");




    }

    @Override
    public void Deposit() {



    }


}
