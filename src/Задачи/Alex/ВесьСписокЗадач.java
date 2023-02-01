package Задачи.Alex;/*
Алексей Филатьев, [25.05.2022 11:02]
Решение дополнительных задач по 1-й части курса

Лекция 18 работа с массивами.
Задачи:
1) Создать массив из 10 элементов [0,1,2,3,4,5,6,7,8,9], вывести на экран
вывод:
0
1
2
3
4
5
6
7
8
9

2) Создать массив из 100 элементов от 1 до 100, вывести на экран только четные элементы
2
4
6
8
10
...
100

3) Создать массив из 100 элементов от 1 до 100, вывести на экран только элементы с четными индексами
3
5
7
...
99

4) Создать массив из 10 элементов от 0 до 9 вывести элеменнты в каждой строке чтобы кол-во пробелов перед строкой было равно элементу который выводим.
0
 1
  2
   3
    4
     5
      6
       7
        8
         9
          10

5) Создать массив  Array1 из 100 элементов от 1 до 100. Создать второй массив Array2 где каждый элемент равен удвоенному элементу из первого массива стоящего на том же индексе.
Array1[0] = 1
Array2[0] = 2
Array1[1] = 2
Array2[2] = 4

6) Создать массив из 100 элементов от 1 до 100 заменить элементы на нечетных индексах 0, вывести на экран ИНДЕКСЫ где значение стало 0


7) написать метод поиска максимума в массиве, на вход метод принимает массив на выход получаем индекс максимального элемента.

8) написать метод подсчитывающий сумму элементов всего массива

9) написать метод подсчитывающий среднее арифметическое в массиве

10) создать массив на 10 элементов {-1,2,-3,4,-5,6,-7,8,-9,10}, развернуть массив чтобы получить {10,-9,8,-7,6,-5,4,-3,2,-1}

11*) сделать второй вариант задачи не прибегая к созданию нового массива
Можно не делать


12) Создать массив от 0 до 99, создать второй массив который заполнить только четными элементами из первого.

13) Изучить информации по генерации случайных чисел. Изучить два способа генерации случайных чисел. 1) С помощью метода класса Math.random() 2) С помощью класса Random

14) Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).

15) Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку. Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.

16) Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.

17) Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым индексом к элементу из второго массива с i-ым индексом. Вывести все три массива на экран (каждый на отдельной строке), затем вывести количество целых элементов в третьем массиве.

18) Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку. Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.

19) Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99]. Вывести массив на экран.

20) Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99]. Вывести массив на экран. После на отдельной строке вывести на экран значение максимального элемента этого массива (его индекс не имеет значения).

21) Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5]. Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов. Если таких строк несколько, то вывести индекс первой встретившейся из них.

Алексей Филатьев, [25.05.2022 11:02]
22) Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9]. Вывести массив на экран. Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял её наибольший элемент. При этом изменять состав массива нельзя, а можно только переставлять элементы в рамках одной строки. Порядок остальных элементов строки не важен (т.е. можно соврешить только одну перестановку, а можно отсортировать по убыванию каждую строку)

Алексей Филатьев, [25.05.2022 11:07]
Есть класс Employee(Создать самостоятельно) с полями:
табельный номер, имя,отчество, фамилия, возраст, должность, зарплата
Задача 1.

1) Создать 20-ть тестовых сотрудников. Добавить в список
2) Вывести список сотрудников отсортированный по зарплате
3) Вывести список сотрудников отсортированный по Фамилии
4) Вывести список сотрудников отсортированный по возрасту
5) Вывести список табельных номеров.

Задача 2.
Есть список из 10 сотрудников работающих на фирме и хранящийся в базе(например).
Нам приходит из отдела кадров список в котором отражены сотрудники на текущий момент состоящий из 10 сотрудников
в котором отражены 5 сотрудников которые продолжают работать, и 5 новых сотрудников. те сотрудники которые уволены в списке отсутствуют.
Необходимо произвести изменение списка в базе. чтобы в нем появились новые сотрудники, сохранились старые, а уволенным был присвоен статус "уволен"
в виде булевого поля active. У работающих сотрудников в статусе должно стоять True а у уволенных False

Алексей Филатьев, [25.05.2022 11:02]
Решение дополнительных задач по 1-й части курса

Лекция 18 работа с массивами.
Задачи:
1) Создать массив из 10 элементов [0,1,2,3,4,5,6,7,8,9], вывести на экран
вывод:
0
1
2
3
4
5
6
7
8
9

2) Создать массив из 100 элементов от 1 до 100, вывести на экран только четные элементы
2
4
6
8
10
...
100

3) Создать массив из 100 элементов от 1 до 100, вывести на экран только элементы с четными индексами
3
5
7
...
99

4) Создать массив из 10 элементов от 0 до 9 вывести элеменнты в каждой строке чтобы кол-во пробелов перед строкой было равно элементу который выводим.
0
 1
  2
   3
    4
     5
      6
       7
        8
         9
          10

5) Создать массив  Array1 из 100 элементов от 1 до 100. Создать второй массив Array2 где каждый элемент равен удвоенному элементу из первого массива стоящего на том же индексе.
Array1[0] = 1
Array2[0] = 2
Array1[1] = 2
Array2[2] = 4

6) Создать массив из 100 элементов от 1 до 100 заменить элементы на нечетных индексах 0, вывести на экран ИНДЕКСЫ где значение стало 0


7) написать метод поиска максимума в массиве, на вход метод принимает массив на выход получаем индекс максимального элемента.

8) написать метод подсчитывающий сумму элементов всего массива

9) написать метод подсчитывающий среднее арифметическое в массиве

10) создать массив на 10 элементов {-1,2,-3,4,-5,6,-7,8,-9,10}, развернуть массив чтобы получить {10,-9,8,-7,6,-5,4,-3,2,-1}

11*) сделать второй вариант задачи не прибегая к созданию нового массива
Можно не делать


12) Создать массив от 0 до 99, создать второй массив который заполнить только четными элементами из первого.

13) Изучить информации по генерации случайных чисел. Изучить два способа генерации случайных чисел. 1) С помощью метода класса Math.random() 2) С помощью класса Random

14) Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).

15) Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку. Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.

16) Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.

17) Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым индексом к элементу из второго массива с i-ым индексом. Вывести все три массива на экран (каждый на отдельной строке), затем вывести количество целых элементов в третьем массиве.

18) Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку. Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.

19) Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99]. Вывести массив на экран.

20) Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99]. Вывести массив на экран. После на отдельной строке вывести на экран значение максимального элемента этого массива (его индекс не имеет значения).

21) Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5]. Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов. Если таких строк несколько, то вывести индекс первой встретившейся из них.

Алексей Филатьев, [25.05.2022 11:02]
22) Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9]. Вывести массив на экран. Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял её наибольший элемент. При этом изменять состав массива нельзя, а можно только переставлять элементы в рамках одной строки. Порядок остальных элементов строки не важен (т.е. можно соврешить только одну перестановку, а можно отсортировать по убыванию каждую строку)

Алексей Филатьев, [25.05.2022 11:07]
Есть класс Employee(Создать самостоятельно) с полями:
табельный номер, имя,отчество, фамилия, возраст, должность, зарплата
Задача 1.

1) Создать 20-ть тестовых сотрудников. Добавить в список
2) Вывести список сотрудников отсортированный по зарплате
3) Вывести список сотрудников отсортированный по Фамилии
4) Вывести список сотрудников отсортированный по возрасту
5) Вывести список табельных номеров.

Задача 2.
Есть список из 10 сотрудников работающих на фирме и хранящийся в базе(например).
Нам приходит из отдела кадров список в котором отражены сотрудники на текущий момент состоящий из 10 сотрудников
в котором отражены 5 сотрудников которые продолжают работать, и 5 новых сотрудников. те сотрудники которые уволены в списке отсутствуют.
Необходимо произвести изменение списка в базе. чтобы в нем появились новые сотрудники, сохранились старые, а уволенным был присвоен статус "уволен"
в виде булевого поля active. У работающих сотрудников в статусе должно стоять True а у уволенных False

Алексей Филатьев, [25.05.2022 11:32]
Задача:
        Написать программу, которая анализирует кол-во слов в текстовом файле.
        И по запросу пользователя какого-либо слова выводящая кол-во употреблений данного слова в тексте.
        Путь до файла для анализа передается в параметрах командной строки.
        Далее программа выводит предложение пользователю ввести слово, пользователь вводит,
        программа сообщает ему сколько раз встречается данное слово в тексе и снова выводит предложение о вводе.
        И так до тех пор пока пользователь не введет команду для выхода \end.
Требования:
        Программа должна быть сделана с использованием сборщика проектов Maven.
        Программа должна собираться сборщиком в исполняемый JAR файл.
        Исходные коды программы должны быть сохранены в системе контроля версий GitHub

        Алексей Филатьев, [25.05.2022 11:02]
Решение дополнительных задач по 1-й части курса

Лекция 18 работа с массивами.
Задачи:
1) Создать массив из 10 элементов [0,1,2,3,4,5,6,7,8,9], вывести на экран
вывод:
0
1
2
3
4
5
6
7
8
9

2) Создать массив из 100 элементов от 1 до 100, вывести на экран только четные элементы
2
4
6
8
10
...
100

3) Создать массив из 100 элементов от 1 до 100, вывести на экран только элементы с четными индексами
3
5
7
...
99

4) Создать массив из 10 элементов от 0 до 9 вывести элеменнты в каждой строке чтобы кол-во пробелов перед строкой было равно элементу который выводим.
0
 1
  2
   3
    4
     5
      6
       7
        8
         9
          10

5) Создать массив  Array1 из 100 элементов от 1 до 100. Создать второй массив Array2 где каждый элемент равен удвоенному элементу из первого массива стоящего на том же индексе.
Array1[0] = 1
Array2[0] = 2
Array1[1] = 2
Array2[2] = 4

6) Создать массив из 100 элементов от 1 до 100 заменить элементы на нечетных индексах 0, вывести на экран ИНДЕКСЫ где значение стало 0


7) написать метод поиска максимума в массиве, на вход метод принимает массив на выход получаем индекс максимального элемента.

8) написать метод подсчитывающий сумму элементов всего массива

9) написать метод подсчитывающий среднее арифметическое в массиве

10) создать массив на 10 элементов {-1,2,-3,4,-5,6,-7,8,-9,10}, развернуть массив чтобы получить {10,-9,8,-7,6,-5,4,-3,2,-1}

11*) сделать второй вариант задачи не прибегая к созданию нового массива
Можно не делать


12) Создать массив от 0 до 99, создать второй массив который заполнить только четными элементами из первого.

13) Изучить информации по генерации случайных чисел. Изучить два способа генерации случайных чисел. 1) С помощью метода класса Math.random() 2) С помощью класса Random

14) Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).

15) Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку. Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью.

16) Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.

17) Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел. Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым индексом к элементу из второго массива с i-ым индексом. Вывести все три массива на экран (каждый на отдельной строке), затем вывести количество целых элементов в третьем массиве.

18) Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку. Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран.

19) Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10;99]. Вывести массив на экран.

20) Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99]. Вывести массив на экран. После на отдельной строке вывести на экран значение максимального элемента этого массива (его индекс не имеет значения).

21) Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5]. Вывести массив на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов. Если таких строк несколько, то вывести индекс первой встретившейся из них.

Алексей Филатьев, [25.05.2022 11:02]
22) Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9]. Вывести массив на экран. Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял её наибольший элемент. При этом изменять состав массива нельзя, а можно только переставлять элементы в рамках одной строки. Порядок остальных элементов строки не важен (т.е. можно соврешить только одну перестановку, а можно отсортировать по убыванию каждую строку)

Алексей Филатьев, [25.05.2022 11:07]
Есть класс Employee(Создать самостоятельно) с полями:
табельный номер, имя,отчество, фамилия, возраст, должность, зарплата
Задача 1.

1) Создать 20-ть тестовых сотрудников. Добавить в список
2) Вывести список сотрудников отсортированный по зарплате
3) Вывести список сотрудников отсортированный по Фамилии
4) Вывести список сотрудников отсортированный по возрасту
5) Вывести список табельных номеров.

Задача 2.
Есть список из 10 сотрудников работающих на фирме и хранящийся в базе(например).
Нам приходит из отдела кадров список в котором отражены сотрудники на текущий момент состоящий из 10 сотрудников
в котором отражены 5 сотрудников которые продолжают работать, и 5 новых сотрудников. те сотрудники которые уволены в списке отсутствуют.
Необходимо произвести изменение списка в базе. чтобы в нем появились новые сотрудники, сохранились старые, а уволенным был присвоен статус "уволен"
в виде булевого поля active. У работающих сотрудников в статусе должно стоять True а у уволенных False

Алексей Филатьев, [25.05.2022 11:32]
Задача:
        Написать программу, которая анализирует кол-во слов в текстовом файле.
        И по запросу пользователя какого-либо слова выводящая кол-во употреблений данного слова в тексте.
        Путь до файла для анализа передается в параметрах командной строки.
        Далее программа выводит предложение пользователю ввести слово, пользователь вводит,
        программа сообщает ему сколько раз встречается данное слово в тексе и снова выводит предложение о вводе.
        И так до тех пор пока пользователь не введет команду для выхода \end.
Требования:
        Программа должна быть сделана с использованием сборщика проектов Maven.
        Программа должна собираться сборщиком в исполняемый JAR файл.
        Исходные коды программы должны быть сохранены в системе контроля версий GitHub

Алексей Филатьев, [25.05.2022 11:39]
курсовая задача по 2-м курсам Трегулова. которую я даю ученикам.

Алексей Филатьев, [25.05.2022 11:39]
Цель: Разработать консольную программу по поиску дубликатов файлов в заданной директории.

Требования к программе:
1) Проверка идентичности файлов производится методом на усмотрение исполнителя.
2) проверяются также вложенные поддиректории.
3) сравнение по имени файла не производится. Интересует только содержимое.
4) программа должна использовать элементы многопоточности.
5) при старте программы происходит засечка времени программы. При завершении работы выводится затраченное на работу время в секундах.
6) При завершении поиска производится расчет места которое освободится при удалении всех дубликатов с оставлением только по одной копии файла имеющего дубликаты.
7) Программа должна быть разработана с учетом принципов SOLID в ООП стиле
8) путь до директории указывается параметром командной строки
9) Исходный код программы должен быть сохранен на GitHub
10) в качестве сборщика использовать maven
11) В случае неправильного указания дирректории должна выводится подсказка, также как и при простом запуске без параметров
*/
public class ВесьСписокЗадач {
}
