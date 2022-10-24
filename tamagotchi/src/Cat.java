import java.util.Scanner;

public class Cat {
    public String name;
    public int age;
    private int ageTimer = 0;
    public double weight;
    public int satiety;
    public int desireToPlay;
    boolean test = false;


    Scanner scanner = new Scanner(System.in);

    public void catMenu() {
        ageTimer++;
        if (ageTimer == 20) {
            age++;
            ageTimer = 0;
        }
        weight -= 0.05;
        satiety -= (int) (Math.random() * 10) + 6;
        desireToPlay -= (int) (Math.random() * 25) + 6;
        if (desireToPlay < 0) desireToPlay = 0;
        System.out.println("Выберите меню:");
        System.out.println("Состояние кота (1)");
        System.out.println("Кормление кота (2)");
        System.out.println("Игры с котом (3)");
        System.out.println("Выход из программы (S) /t (ВНИМАНИЕ! ВАШ ПИТОМЕЦ ИСЧЕЗНЕТ И ВЫ БОЛЬШЕ НИКОГДА НЕ СМОЖЕТЕ ЕГО НАЙТИ)");
        char menuSelection = scanner.next().charAt(0);
        while (!test) {
            switch (menuSelection) {
                case ('1'):
                    catsCondition();
                    break;
                case ('2'):
                    feedingTheCat();
                    break;
                case ('3'):
                    playingWithCat();
                    break;
                case ('S'):
                    test = true;
                    break;
                case ('s'):
                    test = true;
                    break;
                default:
                    System.out.println("Вы ввели неправильную команду. Попробуйте снова.");
                    break;
            }
        }
    }

    private void playingWithCat() {
        while (!test) {
            System.out.println("Желание играть: " + desireToPlay);
            System.out.println("Сытость: " + satiety);
            if (satiety < 25) {
                System.out.println("Ваш кот слишком голоден для игры. СРОЧНО ПОКОРМИТЕ ВАШЕГО КОТА");
                feedingTheCat();
            } else if (satiety > 80) {
                System.out.println("Ваш кот слишком сыт для игр. Попробуйте поиграть с ним позже");
                System.out.println("Для возвращения в главное меню нажмите (1)");
                while (!test) {
                    char menuSelection = scanner.next().charAt(0);
                    if (menuSelection == '1') {
                        catMenu();
                    } else {
                        System.out.println("Неправильная команда. Попробуйте снова");
                    }
                }
            } else if (desireToPlay == 100) {
                System.out.println("Кот уже наигрался и больше не хочет играть");
                while (!test) {
                    char menuSelection = scanner.next().charAt(0);
                    if (menuSelection == '1') {
                        catMenu();
                    } else {
                        System.out.println("Неправильная команда. Попробуйте снова");
                    }
                }
            } else {
                System.out.println("Вернуться в главное меню (1)");
                System.out.println("Выход из программы (S) /t (ВНИМАНИЕ! ВАШ ПИТОМЕЦ ИСЧЕЗНЕТ И ВЫ БОЛЬШЕ НИКОГДА НЕ СМОЖЕТЕ ЕГО НАЙТИ)");
                System.out.println("Выберите как поиграть с котом:");
                System.out.println("Погладить кота (+20 к счастью кота) (2)");
                System.out.println("Поиграть с лазерной указкой (+40 к счастью кота, -100 гр веса) (3)");
                System.out.println("Дать коту 100$ (+100 к счастью кота) (4)");
                System.out.println("Пнуть кота (-50 к счастью кота) (5)");
                char menuSelection = scanner.next().charAt(0);
                switch (menuSelection) {
                    case ('1'):
                        catMenu();
                        break;
                    case ('2'):
                        desireToPlay = desireToPlay + 20 > 100 ? 100 : desireToPlay + 30;
                        break;
                    case ('3'):
                        desireToPlay = desireToPlay + 40 > 100 ? 100 : desireToPlay + 40;
                        weight -= 0.1;
                        break;
                    case ('4'):
                        desireToPlay = 100;
                        break;
                    case ('5'):
                        desireToPlay = desireToPlay - 50 < 0 ? 0 : satiety - 50;
                        break;
                    case ('S'):
                        test = true;
                        return;
                    case ('s'):
                        test = true;
                        return;
                    default:
                        System.out.println("Вы ввели неправильную команду. Попробуйте снова.");
                        break;
                }
            }
        }
    }

    private void feedingTheCat() {
        while (!test) {
            System.out.println("Сытость: " + satiety);
            if (satiety <= 20) System.out.println("СРОЧНО ПОКОРМИТЕ КОТА");
            System.out.println("Вернуться в главное меню (1)");
            System.out.println("Выход из программы (S) /t (ВНИМАНИЕ! ВАШ ПИТОМЕЦ ИСЧЕЗНЕТ И ВЫ БОЛЬШЕ НИКОГДА НЕ СМОЖЕТЕ ЕГО НАЙТИ)");
            System.out.println("Выберите чем хотите покормить кота:");
            System.out.println("Сухой корм (+30 сытости и +100 гр. веса) (2) ");
            System.out.println("Жидкий корм WHISKAS (+40 сытости и +120 гр. веса) (3)");
            System.out.println("Лосось (+50 сытости и +250 гр. веса) (4)");
            System.out.println("Протеин (+20 сытости и +500 гр. веса) (5)");
            System.out.println("Диетический корм (+20 сытости и -50 гр. веса) (6)");
            System.out.println("Купюра в 100$ (+100 сытости ) (7)");
            char menuSelection = scanner.next().charAt(0);
            if (menuSelection != '1' && menuSelection != 'S' && menuSelection != 's' && satiety > 50) {
                System.out.println("Ваш кот не хочет сейчас есть!");
            } else {
                switch (menuSelection) {
                    case ('1'):
                        catMenu();
                        break;
                    case ('2'):
                        satiety = satiety + 30 > 100 ? 100 : satiety + 30;
                        weight += 0.1;
                        break;
                    case ('3'):
                        satiety = satiety + 40 > 100 ? 100 : satiety + 40;
                        weight += 0.12;
                        break;
                    case ('4'):
                        satiety = satiety + 50 > 100 ? 100 : satiety + 50;
                        weight += 0.25;
                        break;
                    case ('5'):
                        satiety = satiety + 20 > 100 ? 100 : satiety + 20;
                        weight += 0.5;
                        break;
                    case ('6'):
                        satiety = satiety + 20 > 100 ? 100 : satiety + 20;
                        weight -= 0.05;
                        break;
                    case ('7'):
                        satiety = 100;
                        break;
                    case ('S'):
                        test = true;
                        return;
                    case ('s'):
                        test = true;
                        return;
                    default:
                        System.out.println("Вы ввели неправильную команду. Попробуйте снова.");
                        break;
                }
            }
        }
    }

    private void catsCondition() {
        System.out.println("Состояние кота");
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Вес: " + weight);
        System.out.println("Сытость: " + satiety);
        if (satiety <= 20) System.out.println("СРОЧНО ПОКОРМИТЕ КОТА");
        System.out.println("Желание играть: " + desireToPlay);
        if (desireToPlay <= 20) System.out.println("ВАМ СЛЕДУЕТ ПОИГРАТЬ С КОТОМ! ЕМУ ОЧЕНЬ СКУЧНО");
        System.out.println("");
        System.out.println("Выберите действие которое хотите совершить:");
        System.out.println("Вернуться в главное меню (1)");
        System.out.println("Кормление кота (2)");
        System.out.println("Игры с котом (3)");
        System.out.println("Выход из программы (S) /t (ВНИМАНИЕ! ВАШ ПИТОМЕЦ ИСЧЕЗНЕТ И ВЫ БОЛЬШЕ НИКОГДА НЕ СМОЖЕТЕ ЕГО НАЙТИ)");
        char menuSelection = scanner.next().charAt(0);
        while (!test) {
            switch (menuSelection) {
                case ('1'):
                    catMenu();
                    break;
                case ('2'):
                    feedingTheCat();
                    break;
                case ('3'):
                    playingWithCat();
                    break;
                case ('S'):
                    test = true;
                    return;
                case ('s'):
                    test = true;
                    return;
                default:
                    System.out.println("Вы ввели неправильную команду. Попробуйте снова.");
                    break;
            }
        }
    }

    public void creatingANewPet() {
        System.out.print("Пожалуйста введите имя вашего питомца: ");
        name = scanner.nextLine();
        age = 0;
        weight = 3;
        satiety = (int) (Math.random() * 30) + 41;
        desireToPlay = (int) (Math.random() * 30) + 41;
    }
}
