import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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
    Print print = new Print();

    public void maimMenu() throws IOException, InterruptedException {
        print.clearConsole();
        ageTimer++;
        if (ageTimer == 20) {
            age++;
            ageTimer = 0;
        }
        weight -= 0.05;
        satiety -= (int) (Math.random() * 10) + 6;
        desireToPlay -= (int) (Math.random() * 25) + 6;
        if (desireToPlay < 0) desireToPlay = 0;
        print.mainMenu();
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
                case ('4'):
                    saveTheGame();
                    break;
                case ('S'):
                    test = true;
                    break;
                case ('s'):
                    test = true;
                    break;
                default:
                    System.out.println(print.error);
                    break;
            }
        }
    }

    private void playingWithCat() throws IOException, InterruptedException {
        while (!test) {
            print.clearConsole();
            System.out.println(print.desireToPlay + desireToPlay);
            System.out.println(print.satiety + satiety);
            if (satiety < 25) {
                while (!test) {
                    System.out.println(print.hungryToPlay);
                    System.out.println(print.returnMainMenu + "(1)");
                    System.out.println(print.feedingTheCat + "(2)");
                    char menuSelection = scanner.next().charAt(0);
                    switch (menuSelection) {
                        case ('1'):
                            maimMenu();
                            break;
                        case ('2'):
                            feedingTheCat();
                            break;
                        default:
                            System.out.println(print.error);
                            break;
                    }
                }
            } else if (satiety > 80) {
                System.out.println(print.fullToPlay);
                System.out.println(print.returnMainMenu + "(1)");
                while (!test) {
                    char menuSelection = scanner.next().charAt(0);
                    if (menuSelection == '1') {
                        maimMenu();
                    } else {
                        System.out.println(print.error);
                    }
                }
            } else if (desireToPlay == 100) {
                System.out.println(print.playedEnough);
                while (!test) {
                    char menuSelection = scanner.next().charAt(0);
                    if (menuSelection == '1') {
                        maimMenu();
                    } else {
                        System.out.println(print.error);
                    }
                }
            } else {
                print.playingWithCatMenu();
                char menuSelection = scanner.next().charAt(0);
                switch (menuSelection) {
                    case ('1'):
                        maimMenu();
                        break;
                    case ('2'):
                        desireToPlay = desireToPlay + 20 > 100 ? 100 : desireToPlay + 20;
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
                    default:
                        System.out.println(print.error);
                        break;
                }
            }
        }
    }

    private void feedingTheCat() throws IOException, InterruptedException {
        print.clearConsole();
        while (!test) {
            System.out.println(print.satiety + satiety);
            if (satiety <= 20) System.out.println(print.satietyDanger);
            print.feedingMenu();
            char menuSelection = scanner.next().charAt(0);
            if (menuSelection != '1' && menuSelection != 'S' && menuSelection != 's' && satiety > 50) {
                System.out.println("Ваш кот не хочет сейчас есть!");
            } else {
                switch (menuSelection) {
                    case ('1'):
                        maimMenu();
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
                    default:
                        System.out.println(print.error);
                        break;
                }
            }
        }
    }

    private void catsCondition() throws IOException, InterruptedException {
        print.clearConsole();
        System.out.println(print.catsCondition);
        System.out.println(print.name + name);
        System.out.println(print.age + age);
        System.out.println(print.weight + weight);
        System.out.println(print.satiety + satiety);
        if (satiety <= 20) System.out.println(print.satietyDanger);
        System.out.println(print.desireToPlay + desireToPlay);
        if (desireToPlay <= 20) System.out.println(print.desireToPlayDanger);
        print.conditionMenu();
        char menuSelection = scanner.next().charAt(0);
        while (!test) {
            switch (menuSelection) {
                case ('1'):
                    maimMenu();
                    break;
                case ('2'):
                    feedingTheCat();
                    break;
                case ('3'):
                    playingWithCat();
                    break;
                default:
                    System.out.println(print.error);
                    break;
            }
        }
    }

    public void creatingANewPet() throws IOException, InterruptedException {
        System.out.print("Пожалуйста введите имя вашего питомца: ");
        name = scanner.nextLine();
        age = 0;
        weight = 3;
        satiety = (int) (Math.random() * 30) + 41;
        desireToPlay = (int) (Math.random() * 30) + 41;
        Thread.sleep(2000);
        maimMenu();
    }

    private void saveTheGame() throws IOException, InterruptedException {
        String saveData = name + " " + age + " " + ageTimer + " " + weight + " " + satiety + " " + desireToPlay;
        Save save = new Save();
        save.save(saveData);
        System.out.println("Ваш прогресс успешно сохранен");
        Thread.sleep(2000);
        maimMenu();
    }

    public void resumeGame() throws IOException, InterruptedException {
        File file = new File("save.txt");
        Scanner scanner = new Scanner(file);
        name=scanner.next();
        age=scanner.nextInt();
        ageTimer=scanner.nextInt();
        weight=scanner.nextDouble();
        satiety=scanner.nextInt();
        desireToPlay= scanner.nextInt();
        Thread.sleep(2000);
        maimMenu();
    }
}
