package org.springTask2;

import lombok.Data;

@Data
public class Application {
    private BankClientsApp bankClientsApp;
    private DataBase dataBase;
    private TransferByPhoneApp transferByPhoneApp;
    void checkUser(){
        if (bankClientsApp.getOurСlients().equals(false)){
            System.out.println("Не наш паренек");
        }else{
            System.out.println("На номер" + transferByPhoneApp.getNumber() + "Положено" + transferByPhoneApp.getSum());
            System.out.println("История номера" + dataBase.getStory());
        }
    }

}
