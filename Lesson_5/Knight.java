package Lesson_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Knight {
    public static void main(String[] args) {
        long start = System.nanoTime();
        int n = 5;
        int[][] board = new int[n][n];
        int x = 2; // точка начала
        int y = 2;
        int knight = 1; // счетчик
        board[x][y] = knight;
        while (knight != n * n) {
            int count = countMoves(board, x, y);
            ArrayList<Integer> knightOptions = findMoves(board, x, y);
            // System.out.println("Количество допустимых ходов");
            // System.out.println(count);
            // System.out.println("Координаты допустимых ходов");
            // System.out.println(knightOptions);
            ArrayList<Integer> nextMove = new ArrayList<>();
            nextMove = nextMove(knightOptions, board, count);
            x = nextMove.get(0);
            y = nextMove.get(1);
            // System.out.println("координаты новой точки");
            // System.out.println(x);
            // System.out.println(y);
            knight++;
            board[x][y] = knight;
        }
        // распечатка двумерного массива
        for (int[] ints : board) {
            for (int i : ints)
                System.out.printf("%3d ", i);
            System.out.print("\n");
        }
        System.out.println();
        long finish = System.nanoTime();
        System.out.println(finish - start);
    }

    // считает количество ходов коня с конкретной клетки
    private static int countMoves(int[][] board, int x, int y) {
        // список ходов коня
        ArrayList<Integer> knighsMove = new ArrayList<>(
                Arrays.asList(1, -2, 2, -1, 2, 1, 1, 2, -1, 2, -2, 1, -2, -1, -1, -2));
        // количество всех ходов с одной клетки
        int countMoves = 0;
        for (int i = 0; i < knighsMove.size(); i += 2) {
            int x1 = x + knighsMove.get(i);
            int y1 = y + knighsMove.get(i + 1);
            if (x1 >= 0 && x1 < board.length && y1 >= 0 && y1 < board.length && board[x1][y1] == 0) {
                countMoves++;
            }
        }
        return countMoves;
    }

    // выдает все ходы коня с конкретной клетки
    private static ArrayList<Integer> findMoves(int[][] board, int x, int y) {
        // список ходов коня
        ArrayList<Integer> knighsMove = new ArrayList<>(
                Arrays.asList(1, -2, 2, -1, 2, 1, 1, 2, -1, 2, -2, 1, -2, -1, -1, -2));
        // for (int i = 0; i < knighsMove.size(); i += 2) {
        // System.out.printf("x:%d y:%d\n", knighsMove.get(i), knighsMove.get(i + 1));
        // }
        //
        // список всех ходов с одной клетки
        ArrayList<Integer> knightOptions = new ArrayList<>();
        for (int i = 0; i < knighsMove.size(); i += 2) {
            int x1 = x + knighsMove.get(i);
            int y1 = y + knighsMove.get(i + 1);
            if (x1 >= 0 && x1 < board.length && y1 >= 0 && y1 < board.length && board[x1][y1] == 0) {
                knightOptions.add(x1);
                knightOptions.add(y1);
            }
        }
        return knightOptions;
    }

    // поиск минимальных значений (следующего хода)
    private static ArrayList<Integer> nextMove(ArrayList<Integer> knightOptions, int[][] board, int count) {
        // список для поиска минимального
        ArrayList<Integer> minMoves = new ArrayList<>();
        for (int i = 0; i < knightOptions.size(); i += 2) {
            minMoves.add(countMoves(board, knightOptions.get(i), knightOptions.get(i + 1)));
        }
        // System.out.println("количество ходов для текущих выборов");
        // System.out.println(minMoves);
        // ищем индекс минимального количества ходов и находим координаты для слеюущего
        // шага
        int min = minMoves.indexOf(Collections.min(minMoves));
        // System.out.println("индекс минимального значения из последнего списка");
        // System.out.println(min);
        int x = knightOptions.get(min * 2);
        int y = knightOptions.get(min * 2 + 1);
        ArrayList<Integer> nextMove = new ArrayList<>();
        nextMove.add(x);
        nextMove.add(y);
        return nextMove;
    }
}
