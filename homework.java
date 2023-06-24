// Подумать над структурой класса Ноутбук для магазина техники
// - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя
// критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД hd hdd
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев
// - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести
// проходящие по условиям.

// Класс сделать в отдельном файле
// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих

import java.util.HashSet;
import java.util.Arrays;
import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        var notebooks = GenerateSetNotebooks();
        Menu(notebooks);
    }
     public static void Menu(HashSet<Notebook> notebooks) {
        Scanner sc = new Scanner(System.in, "cp866");
        int input = 0;
        while (input != 7) {
            System.out.print(
                    "Какой ноутбук хотите?\n [1] - Поиск по объему ОЗУ\n [2] - Поиск по объему жесткого диска\n [3] - Поиск по операционной системе\n [4] - Поиск по цвету\n [5] - Поиск по диагонали\n [6] - Поиск по цене\n [7] - Выход\n ---> ");
            input = Integer.valueOf(sc.nextLine());
            switch (input) {
                case 1:
                    SearchRAM(notebooks);
                    break;
                case 2:
                    SearchSSD(notebooks);
                    break;
                case 3:
                    SearchOS(notebooks);
                    break;
                case 4:
                    SearchColor(notebooks);
                    break;
                case 5:
                    SearchDiagonal(notebooks);
                    break;
                case 6:
                    SearchPrice(notebooks);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Выбирай правильные варианты.");
                    break;
            }
        }
    }

    public static HashSet<Notebook> GenerateSetNotebooks() {
        Notebook notebook1 = new Notebook("ASUS", "Vivobook Pro", "Gray", 16, 512, "Windows", 16, 99900);

        Notebook notebook2 = new Notebook("F+", "Flaptop", 46980);
        notebook2.setColor("Silver");
        notebook2.setRAM(8);
        notebook2.setSSD(256);
        notebook2.setOs("Linux");
        notebook2.setDiagonal(15);

        Notebook notebook3 = new Notebook("HONOR", "MagicBook", "Black", 8, 512, "Windows", 14, 59999);

        Notebook notebook4 = new Notebook("IRBIS", "NB121", "Black", 4, 64, "Windows", 11, 16999);

        Notebook notebook5 = new Notebook("Apple", "MacBook", 164999);
        notebook5.setColor("White");
        notebook5.setRAM(8);
        notebook5.setSSD(256);
        notebook5.setOs("iOS");
        notebook5.setDiagonal(15);

        var notebooks = new HashSet<Notebook>(Arrays.asList(notebook1, notebook2, notebook3, notebook4, notebook5));
        return notebooks;
    }

    public static void SearchRAM(HashSet<Notebook> notebooks) {
        Scanner sc = new Scanner(System.in, "cp866");
        int input = 0;
        System.out.println("Введите минимальный объем ОЗУ: ");
        input = Integer.valueOf(sc.nextLine());
        int count = 0;
        for (Notebook notebook : notebooks) {
            if (notebook.getRAM() >= input) {
                System.out.print(notebook);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Таких ноутбуков нет в наличии.");
        }
    }

    public static void SearchSSD(HashSet<Notebook> notebooks) {
        Scanner sc = new Scanner(System.in, "cp866");
        int input = 0;
        System.out.println("Введите минимальный объем жесткого диска: ");
        input = Integer.valueOf(sc.nextLine());
        int count = 0;
        for (Notebook notebook : notebooks) {
            if (notebook.getSSD() >= input) {
                System.out.print(notebook);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Таких ноутбуков нет в наличии.");
        }
    }

    public static void SearchOS(HashSet<Notebook> notebooks) {
        Scanner sc = new Scanner(System.in, "cp866");
        int input = 0;
        System.out
                .println("Выберите необходимую операционную систему\n [1] - Windows\n [2] - Linux\n [3] - iOS\n ---> ");
        input = Integer.valueOf(sc.nextLine());
        switch (input) {
            case 1:
                for (Notebook notebook : notebooks) {
                    if (notebook.getOs().equals("Windows")) {
                        System.out.print(notebook);
                    }
                }
                break;
            case 2:
                for (Notebook notebook : notebooks) {
                    if (notebook.getOs().equals("Linux")) {
                        System.out.print(notebook);
                    }
                }
                break;
            case 3:
                for (Notebook notebook : notebooks) {
                    if (notebook.getOs().equals("iOS")) {
                        System.out.print(notebook);
                    }
                }
                break;
            default:
                System.out.println("Неверный вариант.");
                break;
        }
    }

    public static void SearchColor(HashSet<Notebook> notebooks) {
        Scanner sc = new Scanner(System.in, "cp866");
        int input = 0;
        System.out
                .println(
                        "Выберите желаемый цвет:\n [1] - Белый\n [2] - Черный\n [3] - Серебристый\n [4] - Серый\n ---> ");
        input = Integer.valueOf(sc.nextLine());
        switch (input) {
            case 1:
                for (Notebook notebook : notebooks) {
                    if (notebook.getColor().equals("White")) {
                        System.out.print(notebook);
                    }
                }
                break;
            case 2:
                for (Notebook notebook : notebooks) {
                    if (notebook.getColor().equals("Black")) {
                        System.out.print(notebook);
                    }
                }
                break;
            case 3:
                for (Notebook notebook : notebooks) {
                    if (notebook.getColor().equals("Silver")) {
                        System.out.print(notebook);
                    }
                }
                break;
            case 4:
                for (Notebook notebook : notebooks) {
                    if (notebook.getColor().equals("Gray")) {
                        System.out.print(notebook);
                    }
                }
                break;
            default:
                System.out.println("Неверный вариант.");
                break;
        }
    }

    public static void SearchDiagonal(HashSet<Notebook> notebooks) {
        Scanner sc = new Scanner(System.in, "cp866");
        int input = 0;
        System.out.println("Введите минимальный размер диагонали: ");
        input = Integer.valueOf(sc.nextLine());
        int count = 0;
        for (Notebook notebook : notebooks) {
            if (notebook.getDiagonal() >= input) {
                System.out.print(notebook);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Таких ноутбуков нет в наличии.");
        }
    }

    public static void SearchPrice(HashSet<Notebook> notebooks) {
        Scanner sc = new Scanner(System.in, "cp866");
        int input = 0;
        System.out.println("Введите максимальную цену: ");
        input = Integer.valueOf(sc.nextLine());
        int count = 0;
        for (Notebook notebook : notebooks) {
            if (notebook.getPrice() <= input) {
                System.out.print(notebook);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Таких ноутбуков нет в наличии.");
        }
    }

}