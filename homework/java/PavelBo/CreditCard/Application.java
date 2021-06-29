package by.jrr.start;

import by.jrr.start.bean.CreditCard;
import org.apache.log4j.BasicConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Executable;

public class Application {

    static Logger log = LoggerFactory.getLogger("");
    public static void main(String[] args) {
        BasicConfigurator.configure();
        CreditCard creditCard = null;
        try {
            creditCard = new CreditCard("1111111111111112", "1111");
        } catch (Exception e) {
           log.warn(e.toString());
        }
        try {
            if (creditCard != null) creditCard.setCreditLimit(125);
        } catch (Exception e){
            log.warn(e.toString());
        }
        if (creditCard.deposit(120, "1111"))
            log.info("Баланс равен {}, Задолженность равна {}, Кредитный лимит {}",
                    creditCard.getBalance(), creditCard.getIndebtedness(), creditCard.getCreditLimit());
        else log.info("Неверный ПИН код. Деньги на счет не зачислены");

        if (creditCard.withdraw(245, "11112"))
            log.info("Баланс равен {}, Задолженность равна {}, Кредитный лимит {}",
                    creditCard.getBalance(), creditCard.getIndebtedness(), creditCard.getCreditLimit());
        else if (creditCard.getTempInt() == 0){
            log.info("Недостаточно средств. Баланс равен {}, Задолженность равна {}, Кредитный лимит {}",
                    creditCard.getBalance(), creditCard.getIndebtedness(), creditCard.getCreditLimit());
        } else {
            log.info("ПИН код введен неверно!");
        }


    }
}
