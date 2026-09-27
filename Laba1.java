public class Laba1 {
    public int charToNum(char x){
        return x - 48;
    }
    public boolean isPositive(int x){
        return x > 0;
    }
    public boolean isDivisor(int a, int b){
        return ((int)(a / b)) == 0 || ((int)(b / a)) == 0; 
    }
    public boolean isEqual(int a, int b, int c){
        return (a == b) && (a == c);
    }
    public int LastNumSum(int a, int b){
        return a % 10 + b % 10;
    }

    public double saveDiv(int x, int y){
        if(y == 0){
            return 0;
        }
        return x / y;
    }

    public int max3(int x, int y, int z){
        if(x > y){
            y = x;
        }
        if(y > z){
            return y;
        }
        return z;
    }

    public boolean sum3(int x, int y, int z){
        return (x + y == z) || (y + z == x) || (z + x == y);
    }

    public int sum2(int x, int y){
        int num = x + y;
        if(10 <= num && num <= 19){
            return 20;
        }
        return num;
    }

    public void PrintDays(String x){
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели.");
        }
    }
    
    public String listNums(int x){
        if(x < 0){
            return "";
        }
        String outString = "";
        for(int i = 0; i <= x; i++){
            outString += i + " "; 
        }
        return outString;
    }

    public int pow(int x, int y){
        int powNum = 1;
        if(x < 0){
            return 0;
        }
        for(int i = 0; i < y; i++){
            powNum *= x;
        }
        return powNum;
    }

    public boolean equalNum(int x){
        if(x < 0){
            x *= -1;
        }
        int comp = x % 10;
        x /= 10;
        while(x != 0){
            if(x % 10 != comp){
                return false;
            }
            x /= 10;
        }
        return true;
        
    }

    public void square(int x){
        System.out.print(("*".repeat(x) + '\n').repeat(x));
    }

    public void rightTriangle(int x){
        for(int i = 1; i <= x; i++){
            for(int j  = x - i; j >= 0; j--){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public int findFirst(int[] arr, int x){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public int findLast(int[] arr, int x){
        for(int i = arr.length - 1; i >= 0; i--){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public int[] add(int[] arr, int[] ins, int pos){
        int[] newArr = new int[arr.length + ins.length];
        System.arraycopy(arr, 0, newArr, 0, pos);
        System.arraycopy(ins, 0, newArr, pos, ins.length);
        System.arraycopy(arr, pos, newArr, pos + ins.length, arr.length - pos);
        return newArr;
    }

    public int[] contan(int[] arr1, int[] arr2){
        int[] newArr = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, newArr, 0, arr1.length);
        System.arraycopy(arr2, 0, newArr, arr1.length, arr2.length);
        return newArr;
    }

    public int[] deleteNegative(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 0){
                count++;
            }
        }
        int[] newArr = new int[count];
        count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 0){
                newArr[count] = arr[i];
                count++;
            }
        }
        return newArr;
    }

}
