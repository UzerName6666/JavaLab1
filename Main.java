
// 6 вариант
class Main {

	public static void main(String[] args){
		boolean cycle = true;
		InputManager in = new InputManager();
		Laba1 tasklist = new Laba1();
		in.clearConsole();
		while(cycle){
			System.out.println("");
			System.out.println("Выберите номер задачи из списка (0 для выхода)");
			System.out.println("1  - Букву в число.");
			System.out.println("2  - Есть ли позитив.");
			System.out.println("3  - Делитель.");
			System.out.println("4  - Равенство.");
			System.out.println("5  - Многократный вызов.");
			System.out.println("6  - Безопасное деление.");
			System.out.println("7  - Тройной максимум.");
			System.out.println("8  - Тройная сумма.");
			System.out.println("9  - Двойная сумма.");
			System.out.println("10 - Вывод дней недели.");
			System.out.println("11 - Числа подряд.");
			System.out.println("12 - Степень числа.");
			System.out.println("13 - Одинаковость.");
			System.out.println("14 - Квадрат.");
			System.out.println("15 - Правый треугольник.");
			System.out.println("16 - Поиск первого значения.");
			System.out.println("17 - Поиск последнего значения.");
			System.out.println("18 - Добавление массива в массив.");
			System.out.println("19 - Объединение");
			System.out.println("20 - Удалить негатив");
			System.out.print("Выберите задачу: ");
			int Inputint = in.inputInt();
			int num1, num2, num3;
			int[] arr1, arr2;
			switch (Inputint) {
				case 0:
					cycle = false;
					break;
				case 1:
					in.clearConsole();
					System.out.print("x =  ");
					num1 = tasklist.charToNum(in.inputSymbol());
					if(0 <= num1 && num1 <= 9){
						System.out.println("результат: " + num1);
					}
					else{
						System.err.println("Была введена не цифра");
					}
					break;
				case 2:
					in.clearConsole();
					System.out.print("x =  ");
					num1 = in.inputInt();
					System.out.println("результат: " + (num1 >= 0));
					break;
				case 3:
					in.clearConsole();
					System.out.print("a =  ");
					num1 = in.inputInt();
					System.out.print("b =  ");
					num2 = in.inputInt();
					System.out.println("результат: " + tasklist.isDivisor(num1, num2));
					break;
				case 4:
					in.clearConsole();
					System.out.print("a =  ");
					num1 = in.inputInt();
					System.out.print("b =  ");
					num2 = in.inputInt();
					System.out.print("c =  ");
					num3 = in.inputInt();
					System.out.println("результат: " + tasklist.isEqual(num1, num2, num3));
					break;
				case 5:
					in.clearConsole();
					System.out.print("Начальное число =  ");
					num1 = in.inputInt();
					for(int i = 0; i < 4; i++){
						System.out.print("Следующее число =  ");
						num2 = in.inputInt();
						System.out.print(num1 + " + " + num2 + " это ");
						num1 = tasklist.LastNumSum(num1, num2);
						System.out.println(num1);
					}
					System.out.println("Итого " + num1);
					break;
				case 6:
					in.clearConsole();
					System.out.print("x =  ");
					num1 = in.inputInt();
					System.out.print("y =  ");
					num2 = in.inputInt();
					System.out.println("результат: " + tasklist.saveDiv(num1, num2));
					break;
				case 7:
					in.clearConsole();
					System.out.print("x =  ");
					num1 = in.inputInt();
					System.out.print("y =  ");
					num2 = in.inputInt();
					System.out.print("z =  ");
					num3 = in.inputInt();
					System.out.println("результат: " + tasklist.max3(num1, num2, num3));
					break;
				case 8:
					in.clearConsole();
					System.out.print("x =  ");
					num1 = in.inputInt();
					System.out.print("y =  ");
					num2 = in.inputInt();
					System.out.print("z =  ");
					num3 = in.inputInt();
					System.out.println("результат: " + tasklist.sum3(num1, num2, num3));
					break;
				case 9:
					in.clearConsole();
					System.out.print("x =  ");
					num1 = in.inputInt();
					System.out.print("y =  ");
					num2 = in.inputInt();
					System.out.println("результат: " + tasklist.sum2(num1, num2));
					break;
				case 10:
					in.clearConsole();
					System.out.print("Введите день недели: ");
					String Day = in.inputStr();
					tasklist.PrintDays(Day);
					break;
				case 11:
					in.clearConsole();
					System.out.print("x =  ");
					num1 = in.inputInt();
					System.out.println("результат: " + tasklist.listNums(num1));
					break;
				case 12:
					in.clearConsole();
					System.out.print("x =  ");
					num1 = in.inputInt();
					System.out.print("y =  ");
					num2 = in.inputInt();
					System.out.println("результат: " + tasklist.pow(num1, num2));
					break;
				case 13:
					in.clearConsole();
					System.out.print("x =  ");
					num1 = in.inputInt();
					System.out.println("результат: " + tasklist.equalNum(num1));
					break;
				case 14:
					in.clearConsole();
					System.out.print("x =  ");
					num1 = in.inputInt();
					tasklist.square(num1);
					break;
				case 15:
					in.clearConsole();
					System.out.print("x =  ");
					num1 = in.inputInt();
					System.out.println("результат: ");
					tasklist.rightTriangle(num1);
					break;
				case 16:
					in.clearConsole();
					System.out.println("Введите размер списка и числа для заполнения массива");
					arr1 = in.inputIntArray();
					System.out.print("x =  ");
					num1 = in.inputInt();
					System.out.println("результат: " + tasklist.findFirst(arr1, num1));
					break;
				case 17:
					in.clearConsole();
					System.out.println("Введите размер списка и числа для заполнения массива");
					arr1 = in.inputIntArray();
					System.out.print("x =  ");
					num1 = in.inputInt();
					System.out.println("результат: " + tasklist.findLast(arr1, num1));
					break;
				case 18:
					in.clearConsole();
					System.out.println("Введите размер списка и числа для заполнения первого массива");
					arr1 = in.inputIntArray();
					System.out.println("Введите размер списка и числа для заполнения второго массива");
					arr2 = in.inputIntArray();
					System.out.print("pos =  ");
					num1 = in.inputInt();
					System.out.println("результат: " + in.intArrayToStr(tasklist.add(arr1, arr2, num1)));
					break;
				case 19:
					in.clearConsole();
					System.out.println("Введите размер списка и числа для заполнения первого массива");
					arr1 = in.inputIntArray();
					System.out.println("Введите размер списка и числа для заполнения второго массива");
					arr2 = in.inputIntArray();
					System.out.println("результат: " + in.intArrayToStr(tasklist.contan(arr1, arr2)));
					break;
				case 20:
					in.clearConsole();
					System.out.println("Введите размер списка и числа для заполнения массива");
					arr1 = in.inputIntArray();
					System.out.println("результат: " + in.intArrayToStr(tasklist.deleteNegative(arr1)));
					break;
				default:
					in.clearConsole();
					if(Inputint < 0){
						System.out.println("Введите положительное число");
					}
					else{
						System.out.println("Неизвестная команда");
					}
			}
		}
	}
}
