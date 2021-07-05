package com.github.pavelbo.fitbot.constant;

public class StringConctant {
    public static final String[] monthNames = { "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь" };
    public static final String DESCRIPTION_MESSAGE = "Данный телеграм бот способен забронировать Вам время посещения нашего фитнес клуба!";
    public static final String START_MESSAGE = "Вас приветствует фитнес клуб! Мы рады вас видеть в нашем телеграм-боте!";
    public static final String CONTACT_DETAILS_MESSAGE = "Наши контактные данные:\n @fitfitness_bot - телеграм бот\n" +
            "t.me/fitfitness - телеграм канал\n\n+375291234567;\n+375297654321;\n\nг.Минск, ул.Юбилейная, д. 1, 5 этаж!";
    public static final String SELECTION_OF_THE_MONTH = "Для начала выберете месяц, в котором Вы планируете посетить наш фитнес клуб. " +
            "Обращаем ваше внимание, что запись возможно произвести только на текущий и следующий месяцы!";
    public static final String SELECTION_OF_THE_DAY = "Отлично, месяц вы выбрали. Теперь выберите дату посещения из предложенных нами:";
    public static final String SELECTION_OF_THE_HOUR = "Осталось выбрать планируемое время посещения:";


}
//счетчик людей от десятки.Нашел похожий на необходимый код... Думаю надо выносить это в отдельный класс,
// чтоб не путаться
public class RemainPeople {

    public static void main(String[] args) {

        int people = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Количество мест - 10 чел. \n" +
                        "Введите количество человек, желающих прийти на занятие (не более 2х)."
        );
        while (people != 0) {
            int input = scanner.nextInt();

            if(input > people) {
                System.out.println("К сожалению, мест нет");
                continue;
            }
// Я бы тут вставил кнопки 1 и 2. Больше не надо, а то вдруг конкурент нажмет на 10 и займет время и не придет.
            switch (input) {
                case 1:
                    people -= input;
                    System.out.println("Осталось мест: " + volume);
                    continue;
                case 2:
                    people -= input;
                    System.out.println("Осталось мест: " + volume);
                    continue;
                default:
                    System.out.println("Вы ввели неправильное значение!");
            }


            if(people == 0) {
                System.out.println("К сожалению, мест нет. Выберите другое время");
                break;
            }

        }

    }

}

