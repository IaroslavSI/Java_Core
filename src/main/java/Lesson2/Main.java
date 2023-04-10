package Lesson2;

import static java.lang.Integer.valueOf;

public class Main {

    public static void main(String[] args) {

        String[][] stringArray0 = new String[][] {
                {"1", "2", "3", "4"},
                {"4", "3", "2", "1"},
                {"1", "2", "3", "4"},
                {"4", "3", "2", ""}
        };

        String[][] stringArray1 = new String[][] {
                {"X", "2", "3", "4"},
                {"4", "3", "2", "1"},
                {"1", "2", "3", "4"},
                {"4", "3", "2", "1"}
        };

        String[][] stringArray2 = new String[][] {
                {"1", "2", "3", "4"},
                {"4", "3", "2", "1"},
                {"1", "2", "3", "4"},
                {"4", "3", "2"}
        };

        String[][] stringArray3 = new String[][] {
                {"1", "2", "3", "4"},
                {"4", "3", "2", "1"},
                {"1", "2", "3", "4"},
                {"5", "4", "3", "2", "1"}
        };

        String[][] stringArray4 = new String[][] {
                {"1", "2", "3", "4"},
                {"4", "3", "2", "1"},
                {"1", "2", "3", "4"},
                {"4", "3", "2", "1"},
                {"1", "2", "3", "4"},
        };

        String[][] stringArray5 = new String[][] {
                {"1", "2", "3", "4"},
                {"4", "3", "2", "1"},
                {"1", "2", "3", "4"},
        };

        String[][] stringArray6 = new String[][] {
                {"1", "2", "3", "4"},
                {"4", "3", "2", "1"},
                {"1", "2", "3", "4"},
                {"4", "3", "2", "1"},
        };

        try {
            System.out.println("Сумма элементов массива равна " + transformAndSum(stringArray0));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }

        try {
            System.out.println("Сумма элементов массива равна " + transformAndSum(stringArray1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }

        try {
            System.out.println("Сумма элементов массива равна " + transformAndSum(stringArray2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }

        try {
            System.out.println("Сумма элементов массива равна " + transformAndSum(stringArray3));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }

        try {
            System.out.println("Сумма элементов массива равна " + transformAndSum(stringArray4));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }

        try {
            System.out.println("Сумма элементов массива равна " + transformAndSum(stringArray5));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }

        try {
            System.out.println("Сумма элементов массива равна " + transformAndSum(stringArray6));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
    }

    private static int transformAndSum (String[][] in) throws MyArraySizeException, MyArrayDataException {
        int arrDim = 4;
        int sum = 0;

        if (in.length != 4) {
        throw new MyArraySizeException(String.format("Размерность массива должна быть %dх%d.", arrDim, arrDim));
        }
        for (int i = 0; i < in.length; i++) {
            if (in[i].length != 4) {
                throw new MyArraySizeException(String.format("Размерность массива должна быть %dх%d.", arrDim, arrDim));
            }
        }

        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[i].length; j++) {
                try {
                    sum += valueOf(in[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("В позиции [%d][%d] исходного массива находится не целое число %s.", i, j, in[i][j]));
                }
            }
        }

        return sum;
    }

}
