import java.util.*;

public class UniqueEvenElmentsFrom2Arrays {

    //Program asked in Infosys Interview June 2022
    public static void main(String[] args) {

        //find unique even numbers from 2 arays ->> output should be 4,6,8
        int a[] = {1, 2, 4, 5, 10};
        int b[] = {2, 6, 8, 10};



        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        int newArrayLength = a.length + b.length;
        int d[] = new int[newArrayLength];


        //Adding elements from 1st array to arrayCreated for storing elemtns from both array
        for(int i=0;i<a.length;i++){
            d[i]=a[i];
        }

        // Adding element from 2nd Array to arrayCrrated for storing elemtns from both array
        for(int i=a.length;i<newArrayLength;i++){
            for (int i1 = 0; i1 < b.length; i1++) {
                d[i]=b[i1];
                i++;
            }
            break;
        }


        // Logic to find common elements from both the array and storing it to new list
        for (int i = 0; i < a.length; i++) {

            for (int i1 = 0; i1 < b.length; i1++) {
                if(a[i]==b[i1]){
                    al.add(a[i]);
                }
            }
        }



        //Logic to find even number from newly created common array
        for (int i = 0; i < d.length; i++) {
            if(d[i]%2==0){
                evenList.add(d[i]);
            }

        }

        // removing common element list from evenLement list
        evenList.removeAll(al);


        //finally, printing unique even elements from both the arrays
        System.out.println("Below is the final list as per requirement");
        for (int i = 0; i < evenList.size(); i++) {
            System.out.println(evenList.get(i));
        }

    }
}
