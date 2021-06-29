package com.tutrit.java.quickstart;

import com.tutrit.java.quickstart.constants.Status;
import com.tutrit.java.quickstart.service.MenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
    // Alt+Enter помогайка как исправить ошибку

    static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        /* code from 1st video "Primitive types"
        double uah = 9.1 / 100;
        double usd = 2.6;
        double eur = 3.0;

        double byn = Double.parseDouble(args[0]);

        double bynInUah = byn / uah;
        double bynInUsd = byn / usd;
        double bynInEur = byn / eur;

        log.info("BYN in UAH {}", bynInUah);
        log.info("BYN in USD {}", bynInUsd);
        log.info("BYN in EUR {}", bynInEur);
*/

        /* Do it by List

              List<Animal> animalList = List.of(
                new Animal("unknown"),
                new Dog(9, 45.2),
                new Wolf()
        );

        List<Barkable> barkableList = List.of(
                new AnimalService(animalList.get(0)),
                new AnimalService(animalList.get(1)),
                new AnimalService(animalList.get(2)),

                new HomeAnimalService(animalList.get(0)),
                new HomeAnimalService(animalList.get(1)),
                new HomeAnimalService(animalList.get(2)),

                new WildAnimalService(animalList.get(0)),
                new WildAnimalService(animalList.get(1)),
                new WildAnimalService(animalList.get(2)),
                () -> System.out.println("haaaaaau haaaaaau")
        );

        for (Barkable barkable : barkableList) {
            barkable.bark();
        }
*/

        /* Do it by Array

        Animal[] animals = {
                new Animal("unknown"),
                new Dog(9, 45.2),
                new Wolf()
        };

        Barkable[] barkables = {
                new AnimalService(animals[0]),
                new AnimalService(animals[1]),
                new AnimalService(animals[2]),

                new HomeAnimalService(animals[0]),
                new HomeAnimalService(animals[1]),
                new HomeAnimalService(animals[2]),

                new WildAnimalService(animals[0]),
                new WildAnimalService(animals[1]),
                new WildAnimalService(animals[2]),
                () -> System.out.println("haaaaaau haaaaaau")
        };


        for (Barkable barkable : barkables) {
            barkable.bark();
        }

 */
        /*

        List, Set, Map and how it works

        List<String> cityList = new ArrayList<>();
        Set<String> citySet = new HashSet<>();
        Map<Integer,String> cityMap = new HashMap<>();

        cityList.add("Minsk");
        cityList.add("Kiiv");
        cityList.add("Batumi");

        citySet.add("Minsk");
        citySet.add("Kiiv");
        citySet.add("Batumi");

        // key can be String type
        cityMap.put(10, "Minsk");
        cityMap.put(20, "Kiiv");
        cityMap.put(30, "Batumi");

        cityList.get(0);
        cityList.get(1);
        cityList.get(2);

        cityMap.get(10);
        cityMap.get(20);
        cityMap.get(30);

        citySet.contains("Minsk");
        citySet.contains("Batumi");
        citySet.contains("Istambul");

        List<String> cityOfSet = new ArrayList<>(citySet);
        cityOfSet.get(0);
        cityOfSet.get(1);
        cityOfSet.get(2);

         */

        /*  Boolean operators


        logger.info("true \t= {}", true);
        logger.info("!true \t= {}", !true);

        logger.info("0 == 0 \t= {}", 0 == 0);
        logger.info("1 == 0 \t= {}", 1 == 0);
        logger.info("0 < 0 \t= {}", 0 < 0);
        logger.info("1 < 0 \t= {}", 1 < 0);
        logger.info("0 > 0 \t= {}", 0 > 0);
        logger.info("1 > 0 \t= {}", 1 > 0);
        logger.info("0 <= 0 \t= {}", 0 <= 0);
        logger.info("1 <= 0 \t= {}", 1 <= 0);
        logger.info("0 >= 0 \t= {}", 0 >= 0);
        logger.info("1 >= 0 \t= {}", 1 >= 0);
        logger.info("0 != 0 \t= {}", 0 != 0);
        logger.info("1 != 0 \t= {}", 1 != 0);

        logger.info("true && true \t= {}", true && true);
        logger.info("true && false \t= {}", true && false);
        logger.info("true || true \t= {}", true ||true);
        logger.info("true || false \t= {}", true || false);
 */

        MenuService.choice(Status.IN_PROGRESS);
        MenuService.choice(Status.DONE);
        MenuService.choice(Status.BLOCKED);
    }
}
