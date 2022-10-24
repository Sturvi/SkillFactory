public class Print {
    private String exit = "Выход из программы (S) /t (ВНИМАНИЕ! Все несохраненные данные будут утеряны)";
    private String selectMenyu = "Выберите меню: ";
    private String catsCondition = "Состояние кота ";
    private String feedingTheCat = "Кормление кота ";
    private String playingWithCat = "Сохранить прогресс игры ";
    private String saveTheGame = "Сохранить прогресс игры ";

    public void printMenyu(){
        System.out.println(selectMenyu);
        System.out.println(catsCondition + "(1)");
        System.out.println(feedingTheCat + "(2)");
        System.out.println(playingWithCat + "(3)");
        System.out.println(saveTheGame + "(4)");
        System.out.println(exit);
    }
}
