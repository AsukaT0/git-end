package org.example;

import java.math.BigInteger;
import java.util.*;

import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
    private static void ex1_1_1(){
        Scanner scan = new Scanner(System.in);
        System.out.print("a=");
        double a = scan.nextDouble();
        System.out.print("b=");
        double b = scan.nextDouble();
        System.out.print("c=");
        double c = scan.nextDouble();
        double z = (((a-3)*b/2)+c);
        System.out.print("z="+z);
    }
    private static void ex1_1_2(){
        Scanner scan = new Scanner(System.in);
        System.out.print("a=");
        double a = scan.nextDouble();
        System.out.print("b=");
        double b = scan.nextDouble();
        System.out.print("c=");
        double c = scan.nextDouble();
        double z = (( b+Math.sqrt(b*b+4*a*c) )/2*a) - Math.pow(a,3)*c - Math.pow(b,-2);
        System.out.print("z=" + z);

    }
    private static void ex1_1_3(){
        Scanner scan = new Scanner(System.in);
        System.out.print("x=");
        double x = scan.nextDouble();
        System.out.print("y=");
        double y = scan.nextDouble();
        double z = ((sin(x)+cos(y))/(cos(x)-sin(y)))*tan(x*y);
        System.out.println("z="+z);
    }
    private static void ex1_1_4(){
        Scanner scan = new Scanner(System.in);
        System.out.print("R=");
        double R = scan.nextDouble();
        double new_R = (R-(int)R)*1000+ (double) ((int) R) /1000;
        System.out.println("new R="+ String.format("%.3f", new_R));
    }
    private static void ex1_1_5(){
        Scanner scan = new Scanner(System.in);
        System.out.print("T=");
        double T = scan.nextDouble();
        System.out.println(T/3600 + " " + T/60 + " " + T);
    }
    private static boolean beth(double x,double y,double z){
        return (x <= y)&&(y <= z);
    }
    private static void ex1_1_6(){
        Scanner scan = new Scanner(System.in);
        System.out.print("x=");
        double x = scan.nextDouble();
        System.out.print("y=");
        double y = scan.nextDouble();
        System.out.println(beth(-1,x,1)&&beth(0,y,2)||beth(-2,x,2)&&beth(-1.5,y,0)?"true":"false");
    }
    private static void ex1_2_1(){
        Scanner scan = new Scanner(System.in);
        System.out.print("alpha=");
        double alpha = scan.nextDouble();
        System.out.print("betta=");
        double betta = scan.nextDouble();
        double gamma = 180-(betta+alpha);
        if(gamma > 0){
            System.out.print("существует,");
            if(gamma == 90||alpha == 90||betta == 90){
                System.out.println("прямоугольный");
            }
            else {
                System.out.println("не прямоугольный");
            }
        }else {
            System.out.println("не существует");
        }
    }
    private static void ex1_2_2(){
        Scanner scan = new Scanner(System.in);
        System.out.print("a=");
        double a = scan.nextDouble();
        System.out.print("b=");
        double b = scan.nextDouble();
        System.out.print("c=");
        double c = scan.nextDouble();
        System.out.print("d=");
        double d = scan.nextDouble();
        System.out.println(max(min(a,b),min(c,d)));
    }
    private static void ex1_2_3(){
        Scanner scan = new Scanner(System.in);
        System.out.print("(x1 y1)=");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        System.out.print("(x2 y2)=");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        System.out.print("(x3 y3)=");
        double x3 = scan.nextDouble();
        double y3 = scan.nextDouble();
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)){
            System.out.println("Лежат");
        }else {
            System.out.println("Не лежат");
        }
    }
    private static boolean checker(double A, double B,double x,double y){
        return (x <= A&&y <= B)||(y <= A&&x <= B);
    }
    private static void ex1_2_4(){
        Scanner scan = new Scanner(System.in);
        System.out.print("(A B)=");
        double A = scan.nextDouble();
        double B = scan.nextDouble();
        System.out.print("(x y z)=");
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();
        if(checker(A,B,x,y)||checker(A,B,z,y)||checker(A,B,x,z)){System.out.println("Can");}
        else {System.out.println("Can't");}
    }
    private static void ex1_2_5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("x=");
        double x = scanner.nextDouble();
        double F = (x <= 3)?x*x-3*x+9:1/(pow(x,3)+6);
        System.out.println("F(x)="+F);
    }
    private static void ex1_3_1(){
        Scanner scanner = new Scanner(System.in);
        out.println("A=");
        int A = scanner.nextInt(),sum = 0;
        for (int ii1 = 1;ii1 < A;ii1++){sum+=ii1;}
        out.println(sum);
    }
    private static void ex1_3_2(){
        Scanner scanner = new Scanner(in);
        out.print("[a b]=");
        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        out.print("h=");
        float h = scanner.nextFloat();
        double v = pow(10, Float.toString(h).length());
        for (float ii1 = a-h; ii1 <= b;ii1=(float) (round((ii1+h)* v)/ v)){
            out.println(ii1+"|"+((ii1>2)?ii1:-ii1));}
    }
    private static void ex1_3_3(){
        int sum = 0;
        for(int ii1 = 0;ii1 < 100;sum+=(pow(++ii1,2)));
        out.println(sum);
    }
    private static void ex1_3_4(){
        BigInteger s = BigInteger.valueOf(1);
        for(int i = 2; i <= 200; i++,s = s.multiply(BigInteger.valueOf((long) i * i)));
        out.println(s);
    }
    private static void ex1_3_5(){

    }
    private static void ex1_3_6(){
        for (int ii1 = 0; ii1 < 256; ii1++) {
            out.println(ii1+" ~ "+(char)ii1);
        }
    }
    private static void ex1_3_7(){
        out.println("Enter m n");
        Scanner scanner = new Scanner(in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        for(int ii1 = start;ii1 < end;ii1++){
            out.print(ii1 +"|");
            for(int ii2 = 2;ii2 <= ii1/2;ii2++){
                if((double)ii1/(double)ii2 == (int)((double)ii1/(double)ii2)){
                    out.print(ii2 + " ");}}
        out.println();}
    }
    public static boolean cheAcker(int res,int cont){
        int ii0 = res;
        while (ii0 > 1){
            if(ii0%10 == cont)return true;
            ii0/=10;}
        return ii0 == cont;
    }
    private static void ex1_3_8(){
        Scanner scanner = new Scanner(in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();


        int A = max(x,y);
        int B = min(x,y);
        while (A > 1){
            if(cheAcker(B,A%10)){
                out.println(A%10);
            }
            A/=10;}
        if(cheAcker(B,A%10)){
            out.println(A%10);
        }
    }
    private static void ex2_1_1(){}
    private static void ex2_1_2(){}
    private static void ex2_1_3(){}
    private static void ex2_1_4(){}
    private static void ex2_1_5(){}
    private static void ex2_1_6(){}
    private static void ex2_1_7(){}
    private static void ex2_1_8(){}
    private static void ex2_1_9(){}
    private static void ex2_1_10(){}
    private static void fillRand(double [][] arr){
        for(int ii1 = 0;ii1 < arr.length;ii1++){
            for(int ii2 = 0;ii2 < arr[ii1].length;ii2++){
                arr[ii1][ii2] = (random()*1000)-500;}}}
    private static void fillRand(int [][] arr){
        for(int ii1 = 0;ii1 < arr.length;ii1++){
            for(int ii2 = 0;ii2 < arr[ii1].length;ii2++){
                arr[ii1][ii2] = (int) ((random()*1000)-500);}}}
    private static void fillRandP(double [][] arr){
        for(int ii1 = 0;ii1 < arr.length;ii1++){
            for(int ii2 = 0;ii2 < arr[ii1].length;ii2++){
                arr[ii1][ii2] = (random()*1000);}}}
    private static void printMatrix(double [][] arr){
        for (double[] ints : arr) {
            for (double anInt : ints) {
                out.print(anInt + " ");}
            out.println();}}
    private static void printMatrix(int [][] arr){
        for (int[] ints : arr) {
            for (int anInt : ints) {
                out.print(anInt + " ");}
            out.println();}}
    private static void ex2_2_1(){
        Scanner scanner = new Scanner(in);
        int[][] arr = new int[scanner.nextInt()][scanner.nextInt()];
        fillRand(arr);
        printMatrix(arr);
        out.println();
        for(int ii1 = 0;ii1 < arr[0].length;ii1+=2){
            if(arr[0][ii1] > arr[arr.length-1][ii1]){
                for (int[] ints : arr) {
                    out.print(ints[ii1] + " ");}
                out.println();}}}
    private static void ex2_2_2(){
        Scanner scanner = new Scanner(in);
        int len = scanner.nextInt();
        int[][] arr = new int[len][len];
        fillRand(arr);
        printMatrix(arr);
        out.println();
        for(int ii1 = 0;ii1 < arr.length;ii1++){
            out.println(arr[ii1][ii1]);}
    }
    private static void ex2_2_3(){
        Scanner scanner = new Scanner(in);
        int[][] arr = new int[scanner.nextInt()][scanner.nextInt()];
        fillRand(arr);
        printMatrix(arr);
        out.println();
        int k = scanner.nextInt()-1,p = scanner.nextInt()-1;
        for(int ii1 = 0;ii1<arr[k].length;ii1++){out.print(arr[k][ii1]+" ");}
        out.println("\n");
        for (int[] ints : arr) {out.print(ints[p]+" ");}
    }
    private static void ex2_2_4(){
        Scanner scanner = new Scanner(in);
        int size = scanner.nextInt();
        int[][] arr = new int[size][size];
        for(int ii1 = 0;ii1 < arr.length;ii1++){
            for(int ii2 = 0;ii2 < arr[0].length;ii2++){
                if(ii1%2 == 0){
                    arr[ii1][ii2] = ii2+1;
                }else {
                    arr[ii1][ii2] = arr[0].length - ii2;}}}
        printMatrix(arr);}
    private static void ex2_2_5(){
        Scanner scanner = new Scanner(in);
        int size = scanner.nextInt();
        int[][] arr = new int[size][size];
        for(int ii1 = 0;ii1 < arr.length;ii1++){
            for (int ii2 = 0;ii2 < arr[0].length;ii2++){
                arr[ii1][ii2] = (ii2 < arr[0].length-ii1)?ii1+1:0;}}
        printMatrix(arr);}
    private static void ex2_2_6(){
        Scanner scanner = new Scanner(in);
        int size = scanner.nextInt();
        int[][] arr = new int[size][size];
        for(int ii1 = 0;ii1 < arr.length/2;ii1++){
            for (int ii2 = 0;ii2 < arr[0].length/2;ii2++){
                if(ii2 >= ii1){
                    arr[ii1][ii2] =
                    arr[ii1][arr[ii1].length-1-ii2]=
                    arr[arr.length-ii1-1][ii2] =
                    arr[arr.length-ii1-1][arr[ii1].length-1-ii2] =
                    1;
                }
                else{
                    arr[ii1][ii2] =
                    arr[ii1][arr[ii1].length-1-ii2] =
                    arr[arr.length-ii1-1][ii2] =
                    arr[arr.length-ii1-1][arr[ii1].length-1-ii2] =
                    0;
                }
            }
        }
        printMatrix(arr);
    }
    private static void ex2_2_7(){
        Scanner scanner = new Scanner(in);
        int size = scanner.nextInt(),count = 0;
        double arr[][] = new double[size][size];
        for (int ii1 = 0; ii1 < arr.length; ii1++) {
            for (int ii2 = 0; ii2 < arr[ii1].length; ii2++) {
                arr[ii1][ii2] = sin((double) (ii1 * ii1 - ii2 * ii2) /size);
            if (arr[ii1][ii2]>0)count+=1;}}
        printMatrix(arr);
        out.println(count);
    }
    private static void ex2_2_8(){
        Scanner scanner = new Scanner(in);
        double[][] arr = new double[scanner.nextInt()][scanner.nextInt()];
        fillRand(arr);
        printMatrix(arr);
        int x = scanner.nextInt()-1,
                y = scanner.nextInt()-1;
        for(int ii1 = 0;ii1 < arr.length;ii1++){
            double a = arr[ii1][x];
            arr[ii1][x] = arr[ii1][y];
            arr[ii1][y] = a;}
        printMatrix(arr);
    }
    private static void ex2_2_9(){
        Scanner scanner = new Scanner(in);
        double[][] arr = new double[scanner.nextInt()][scanner.nextInt()];
        fillRandP(arr);
        printMatrix(arr);
        int max = -Integer.MAX_VALUE,maxPos = 0;
        for(int ii1 = 0;ii1 < arr[0].length;ii1++){
            int sum = 0;
            for (double[] doubles : arr) {
                sum += doubles[ii1];
            }
            if(max < sum){
                max = sum;
                maxPos = ii1;
            }
        }
        out.println(maxPos+1);
    }
    private static void ex2_2_10(){
        Scanner scanner = new Scanner(in);
        int size = scanner.nextInt();
        double[][] arr = new double[size][size];
        fillRand(arr);
        printMatrix(arr);
        out.println();
        for(int ii1 = 0;ii1 < arr.length;ii1++){
            if(arr[ii1][ii1]>0){
                out.println("#"+(ii1+1)+" "+(ii1+1)+"|"+arr[ii1][ii1]);}}
    }
    private static void ex2_2_11(){
        int[][] arr = new int[10][20];
        for(int ii1 = 0;ii1 < arr.length;ii1++){
            for (int ii2 = 0;ii2 < arr[ii1].length;ii2++){
                arr[ii1][ii2] = (int) (random()*16);
                out.print(arr[ii1][ii2]+" ");}
            out.println();}
        for (int ii1 = 0; ii1 < arr.length; ii1++) {
            int count = 0;
            for (int ii2:arr[ii1]) {
                if(ii2 == 5){count+=1;}}
            if(count>=3){
                out.print(ii1+1 + " ");}}
    }
    private static void ex2_2_12(){
        Scanner scanner = new Scanner(in);
        int[][] arr = new int[scanner.nextInt()][scanner.nextInt()];
        fillRand(arr);
        printMatrix(arr);
        out.println();
        for (int[] row : arr) {
            Arrays.sort(row);}
        printMatrix(arr);
        out.println();
        for (int[] row : arr) {
            Arrays.sort(row);
            for (int i = 0; i < row.length / 2; i++) {
                int temp = row[i];
                row[i] = row[row.length - 1 - i];
                row[row.length - 1 - i] = temp;
            }
        }
        printMatrix(arr);

    }
    private static void ex2_2_13(){
        Scanner scanner = new Scanner(in);
        int[][] arr = new int[scanner.nextInt()][scanner.nextInt()];
        fillRand(arr);
        printMatrix(arr);
        out.println();
        sortColumnsAscending(arr);
        printMatrix(arr);
        out.println();
        sortColumnsDescending(arr);
        printMatrix(arr);
    }
    public static void sortColumnsAscending(int[][] matrix) {
        for (int columnIndex = 0; columnIndex < matrix[0].length; columnIndex++) {
            for (int i = 0; i < matrix.length - 1; i++) {
                for (int j = 0; j < matrix.length - i - 1; j++) {
                    if (matrix[j][columnIndex] > matrix[j + 1][columnIndex]) {
                        int[] temp = matrix[j];
                        matrix[j] = matrix[j + 1];
                        matrix[j + 1] = temp;}}}}}
    public static void sortColumnsDescending(int[][] matrix) {
        for (int columnIndex = 0; columnIndex < matrix[0].length; columnIndex++) {
            for (int i = 0; i < matrix.length - 1; i++) {
                for (int j = 0; j < matrix.length - i - 1; j++) {
                    if (matrix[j][columnIndex] < matrix[j + 1][columnIndex]) {
                        int[] temp = matrix[j];
                        matrix[j] = matrix[j + 1];
                        matrix[j + 1] = temp;}}}}
    }
    private static void ex2_2_14(){

    }
    private static void ex2_2_15(){
        Scanner scanner = new Scanner(in);
        int[][] arr = new int[scanner.nextInt()][scanner.nextInt()];
        fillRand(arr);
        printMatrix(arr);
        out.println();
        int max = arr[0][0];
        for (int[] ints : arr) {
            for (int anInt : ints) {
                max = max(max, anInt);}}
        for (int ii1 = 0; ii1 < arr.length; ii1++) {
            for (int ii2 = 0; ii2 < arr[ii1].length; ii2++) {
                if (abs(arr[ii1][ii2]) % 2 == 1) {
                    arr[ii1][ii2] = max;}}}
        printMatrix(arr);
    }
    private static void ex2_2_16(){
        int n = 3;
        int[][] arr = new int[n][n];
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = num;
                num++;}}
        int row = n - 1;
        int col = n / 2;
        for (int numCount = 1; numCount <= n * n; numCount++) {
            arr[row][col] = numCount;
            if (numCount % n == 0) {
                row++;
            } else {
                row--;
                col++;
                if (row == -1) {
                    row = n - 1;
                }
                if (col == n) {
                    col = 0;
                }
            }
        }
        printMatrix(arr);
    }
    private static void ex3_2_8(){
        out.print("ENter string");
        String ss = (new Scanner(in)).nextLine();
        int max = 0;
        for(String arS:ss.split(" ")){max= max(arS.length(),max);}
        for(String arS:ss.split(" ")){
            if(arS.length() == max)out.println(arS);}

    }
    class CLASSES{
        static class Test1{
            private int a1;
            private int a2;

            public int sum(){return a1+a2;}
            public int getA1() {return a1;}
            public void setA1(int a1) {this.a1 = a1;}
            public int getA2() {return a2;}
            public void setA2(int a2) {this.a2 = a2;}
            public void print(){out.println("a1 = "+a1 + "; a2 = "+ a2);}
            public int max(){return Math.max(a1,a2);}}
        static class Test2{
            private int a1;
            private int a2;
            public Test2(int a1,int a2){
                this.setA1(a1);
                this.setA2(a2);}
            public Test2(){
                setA1(2);
                setA2(3);
            }

            public int getA1() {
                return a1;
            }

            public void setA1(int a1) {
                this.a1 = a1;
            }

            public int getA2() {
                return a2;
            }

            public void setA2(int a2) {
                this.a2 = a2;
            }
        }
    }
    public static void ex4_1_1(){
        CLASSES.Test2 da = new CLASSES.Test2();
        int i = da.getA2();
    }
}
