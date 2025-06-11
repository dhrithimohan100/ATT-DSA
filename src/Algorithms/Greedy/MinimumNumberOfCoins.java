package Algorithms.Greedy;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MinimumNumberOfCoins {
    static void findMinimumOfCoins(List<Integer> coins,int V) {
        //If the array or list is not sorted,sort it first
        //Traverse the sorted array
        List<Integer> result = new ArrayList<>();
        for (int i = coins.size()-1; i >= 0; i--) {
            while (V >=coins.get(i)) {
                V -= coins.get(i);
                result.add(coins.get(i));
            }
        }
        System.out.println("Coins Selected:->");
        for (int coin : result) {
            System.out.print(coin + " ");
        }
        System.out.println();
        System.out.println("min number of coins" + result.size());
    }

    public static void main(String[] args) {
        List<Integer>coins=Arrays.asList(1,2,5,10,20,50,100,200,300);
        int v1=91;
        findMinimumOfCoins(coins,v1);
    }

    }

