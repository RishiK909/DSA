package GFG;

import java.util.ArrayList;

public class AddingOneToArray
{
    public static void main(String[] args)
    {
        int[] arr = {1,9,9};
        AddingOneToArray addingOneToArray = new AddingOneToArray();
        System.out.println(addingOneToArray.addOne(arr));
    }

    ArrayList<Integer> addOne(int[] arr)
    {
        // code here
        /*ArrayList<Integer> list = new ArrayList<>();
        String num = "";

        for(int i = 0; i < arr.length; i++)
        {
            num += arr[i];
        }

        Integer num1 = Integer.parseInt(num);
        num1 = num1+1;

        for(char ch : num1.toString().toCharArray())
        {
            list.add(ch - '0');
        }
        return  list;*/

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;

                for (int digit : arr) {
                    list.add(digit);
                }
                return list;
            } else {
                arr[i] = 0;
            }
        }

        list.add(1);
        for (int i = 0; i < arr.length; i++) {
            list.add(0);
        }

        return list;

    }
}
