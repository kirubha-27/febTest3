import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int period = 4;
        int[] arr= new int[]{1,2,3,4,4};
        int k=0;
        int count = 0;
        int median;
        for(int i=5;i<arr.length;i++){
            int[] temp = new int[5];

            temp = Arrays.copyOfRange(arr,k,i);
            insertionSort(temp);

            int mid = period/5;
            if(period%2==0){
                median = (temp[mid]+temp[mid-1])/2;

            }else{
                median = (temp[mid]);


            }
            if(median*2>=arr[i]) count++;
            k++;
        }
        System.out.println(count);

    }
    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int temp = arr[i];
            while(j>=0&&arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;


        }

    }
}
