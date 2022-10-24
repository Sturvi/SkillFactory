public class Print {
    private String exit = "Выход из программы (S) /t (ВНИМАНИЕ! Все несохраненные данные будут утеряны)";
    private String selectMenyu = "Выберите действие: ";
    public String catsCondition = "Состояние кота ";
    public String feedingTheCat = "Кормление кота ";
    private String playingWithCat = "Игры с котом ";
    private String saveTheGame = "Сохранить прогресс игры ";
    public String error = "Вы ввели неправильную команду. Попробуйте снова.";
    public String name = "Имя: ";
    public String age = "Возраст: ";
    public String weight = "Вес: ";
    public String satiety = "Сытость: ";
    public String satietyDanger = "СРОЧНО ПОКОРМИТЕ КОТА";
    public String desireToPlay = "Желание играть: ";
    public String desireToPlayDanger = "ВАМ СЛЕДУЕТ ПОИГРАТЬ С КОТОМ! ЕМУ ОЧЕНЬ СКУЧНО";
    public String returnMainMenu = "Вернуться в главное меню ";
    private String foodSelection = "Выберите чем хотите покормить кота:";
    private String dryFood = "Сухой корм (+30 сытости и +100 гр. веса) ";
    private String liquidFeed = "Жидкий корм WHISKAS (+40 сытости и +120 гр. веса) ";
    private String salmon = "Лосось (+50 сытости и +250 гр. веса) ";
    private String protein = "Протеин (+20 сытости и +500 гр. веса) ";
    private String dietaryFood = "Диетический корм (+20 сытости и -50 гр. веса) ";
    private String dollarBill = "Купюра в 100$ (+100 сытости ) ";
    public String hungryToPlay = "Ваш кот слишком голоден для игры. СРОЧНО ПОКОРМИТЕ ВАШЕГО КОТА";
    public String fullToPlay = "Ваш кот слишком сыт для игр. Попробуйте поиграть с ним позже";

    public String playedEnough = "Кот уже наигрался и больше не хочет играть";
    private String howToPlay = "Выберите как хотите поиграть с котом:";
    private String petTheCat = "Погладить кота (+20 к счастью кота) ";
    private String laserPointer = "Поиграть с лазерной указкой (+40 к счастью кота, -100 гр веса) ";
    private String giveDollarBill = "Дать коту 100$ (+100 к счастью кота) ";
    private String kickTheCat = "Пнуть кота (-50 к счастью кота) ";

    public void playingWithCatMenu() {
        System.out.println(returnMainMenu + "(1)");
        System.out.println(howToPlay);
        System.out.println(petTheCat + "(2)");
        System.out.println(laserPointer + "(3)");
        System.out.println(giveDollarBill + "(4)");
        System.out.println(kickTheCat + "(5)");
    }

    public void feedingMenu() {
        System.out.println();
        System.out.println(foodSelection);
        System.out.println(dryFood + "(2) ");
        System.out.println(liquidFeed + "(3)");
        System.out.println(salmon + "(4)");
        System.out.println(protein + "(5)");
        System.out.println(dietaryFood + "(6)");
        System.out.println(dollarBill + "(7)");

    }

    public void mainMenu() {
        System.out.println(selectMenyu);
        System.out.println(catsCondition + "(1)");
        System.out.println(feedingTheCat + "(2)");
        System.out.println(playingWithCat + "(3)");
        System.out.println(saveTheGame + "(4)");
        System.out.println(exit);
    }

    public void conditionMenu() {
        System.out.println();
        System.out.println(selectMenyu);
        System.out.println(returnMainMenu + "(1)");
        System.out.println(feedingTheCat + "(2)");
        System.out.println(playingWithCat + "(3)");
    }

    public void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
}
