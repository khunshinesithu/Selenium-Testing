public class ArrayExample{
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        findAndPrintPairs(list, 5);
        bubblesort(list);
        showList(list);

        list = new int[]{5, 4, 3, 2, 1};
        bubblesort(list);
        showList(list);

        list = new int[]{5, 4, 3, 2, 1};
        bubblesort(list);
        showList(list);

        list = new int[]{1};
        bubblesort(list);
        showList(list);
    }

    public static int FINDMIN(int[] list){
        assert list != null && list.length > 0 : "Array is empty";
        int indexofmin = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] < list[indexofmin]) {
                indexofmin = i;
            }
        }
        return indexofmin;
    }

    public static void BadResize(int[] list, int newsize){
        assert list != null && list.length > 0 : "Array is empty";
        int[] temp = new int[newsize];
        int limit = Math.min(list.length, newsize);
        for (int i = 0; i < limit; i++) {
            temp[i] = list[i];
        }
        list = temp;
    }

    public static void findAndPrintPairs(int[] list, int target){
        assert list != null && list.length > 0 : "Array is empty";
        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] + list[j] == target) {
                    System.out.println("Pair found at index " + i + " and " + j + " (" + list[i] + " + " + list[j] + " = " + target + ")");
                }
            }
        }
    }

    public static void bubblesort(int[] list){
        assert list != null && list.length > 0 : "Array is empty";
        int temp;
        boolean changed = true;
        for(int i=0; i<list.length && changed; i++){
            changed = false;
            for(int j=0; j<list.length-i-1; j++){
                assert (j>=0) && (j+1 < list.length) : "Index out of bounds";
                if(list[j] > list[j+1]){
                    temp = list[j+1];
                    list[j+1] = list[j];
                    list[j] = temp;
                    changed = true;
                }
            }
        }
        isAccending(list);
    }

    public static void showList(int[] list){
        assert list != null && list.length > 0 : "Array is empty";
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public static boolean isAccending(int[] list){
        boolean ascending = true;
        int index = 1;
        while(ascending && index < list.length){
            assert index >= 0 && index < list.length:
            ascending = list[index-1] <= list[index];
            index++;
        }
        return ascending;
    }
}







  