package com.felight.benchmarkingactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class AlgorithmBenchmarkActivity extends Activity {
    int [] secondarray;
    int myfirstarray[];
    RadioButton one,two,three;
    EditText getarrayvalue,resultarraysize;
    static  EditText bubblearrayvalue,myselection,myinsertionsort,mymergesort,myquicksort,myheapsort;

    RadioGroup mygroups;
    String getvaluesforarrayinput;
    int myarrayvalue;
    static long starttime,lasttime,finaltime;
    GridLayout mylayouts;
    static int N;
    static Button mybubblesort,mySelectionSort,myinsertionsorts,mymergesorts,myquicksorts,myheapsorts,myBenchmarkAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algorithm_benchmark);
           /* one=(RadioButton)findViewById(R.id.radioButton);
            two=(RadioButton)findViewById(R.id.radioButton2);
            three=(RadioButton)findViewById(R.id.radioButton3);*/

        getarrayvalue=(EditText) findViewById(R.id.getvaluearrays);
        resultarraysize=(EditText) findViewById(R.id.getarraysizes);
        mygroups=(RadioGroup) findViewById(R.id.myradio);
        bubblearrayvalue=(EditText) findViewById(R.id.bubblesorttext);
        myselection=(EditText) findViewById(R.id.SelectionSorttext);
        myinsertionsort=(EditText)findViewById(R.id.insertionsortstext);
        mymergesort=(EditText)findViewById(R.id.mergesorttext);
        myquicksort=(EditText)findViewById(R.id.quicksorttext);
        myheapsort=(EditText)findViewById(R.id.heapsorttext);
        mybubblesort=(Button)findViewById(R.id.bubblesort);
        mySelectionSort=(Button)findViewById(R.id.SelectionSort);
        myinsertionsorts=(Button)findViewById(R.id.insertionsorts);
        mymergesorts=(Button)findViewById(R.id.mergesort);
        myquicksorts=(Button)findViewById(R.id.quicksort);
        myheapsorts=(Button)findViewById(R.id.heapsort);

        myBenchmarkAll=(Button)findViewById(R.id.BenchmarkAll);
        mylayouts=(GridLayout) findViewById(R.id.myscroll);



    }

    public void genaratemyarraysize( View view) {


        getvaluesforarrayinput = getarrayvalue.getText().toString();


        try {

            if (checktextbox()) {
                mylayouts.setVisibility(View.VISIBLE);

                myinsertionsorts.setEnabled(true);
                mybubblesort.setEnabled(true);

                myheapsorts.setEnabled(true);
                myquicksorts.setEnabled(true);
                mymergesorts.setEnabled(true);
                myinsertionsorts.setEnabled(true);
                mySelectionSort.setEnabled(true);
                myBenchmarkAll.setEnabled(true);

                myarrayvalue = Integer.parseInt(getvaluesforarrayinput);
                int radiovalue = mygroups.getCheckedRadioButtonId();
                one = (RadioButton) findViewById(radiovalue);
                String myvalues = one.getText().toString();
                myfirstarray = new int[myarrayvalue];
                secondarray = new int[myarrayvalue];


                bubblearrayvalue.setText("");
                myinsertionsort.setText("");

                myheapsort.setText("");
                mymergesort.setText("");
                myquicksort.setText("");
                myselection.setText("");


                switch (myvalues) {

                    case ("Basecase"):

                        for (int i = 0; i < myfirstarray.length; i++) {

                            secondarray[i] = i;
                        }
                        int myarrayssize = secondarray.length;
                        String myarrayssizes = Integer.toString(myarrayssize);
                        resultarraysize.setText(myarrayssizes);


                        Toast.makeText(AlgorithmBenchmarkActivity.this,
                                one.getText(), Toast.LENGTH_SHORT).show();

                        break;

                    case ("AverageCase"):


                        for (int i = 0; i < myfirstarray.length; i++) {

                            int random = (int) (Math.random() * 50);
                            secondarray[i] = random;
                        }

                        int myarrayaverage = secondarray.length;
                        String myarrayaverages = Integer.toString(myarrayaverage);
                        resultarraysize.setText(myarrayaverages);


                        Toast.makeText(AlgorithmBenchmarkActivity.this,
                                one.getText(), Toast.LENGTH_SHORT).show();

                        break;
                    case ("WorstCase"):


                        for (int i = myfirstarray.length - 1; i >= 0; i--) {


                            secondarray[i] = i;
                        }

                        int myarrayWorstCase = secondarray.length;
                        String myarrayWorstCases = Integer.toString(myarrayWorstCase);
                        resultarraysize.setText(myarrayWorstCases);

                        Toast.makeText(AlgorithmBenchmarkActivity.this,
                                one.getText(), Toast.LENGTH_SHORT).show();

                        break;


                }


            } else {

                Toast.makeText(AlgorithmBenchmarkActivity.this,
                        "plz enter the value", Toast.LENGTH_SHORT).show();


            }
        }
        catch (Exception e)
        {



        }
    }
    public  boolean checktextbox()
    {


        if(getvaluesforarrayinput.isEmpty())
        {

            return  false;


        }
        return true;


    }


    public  void  algorithm(View vie)
    {



        switch (vie.getId())

        {




            case (R.id.bubblesort):
            {






                bubbleSort( secondarray);
                myinsertionsorts.setEnabled(false);
                mybubblesort.setEnabled(false);

                myheapsorts.setEnabled(false);
                myquicksorts.setEnabled(false);
                mymergesorts.setEnabled(false);
                myinsertionsorts.setEnabled(false);
                mySelectionSort.setEnabled(false);
                myBenchmarkAll.setEnabled(false);


/*
*/









/*/**/



                Toast.makeText(AlgorithmBenchmarkActivity.this,
                        "bubblesort", Toast.LENGTH_SHORT).show();

                break;
            }

            case (R.id.SelectionSort):
            {

                selectionSort(secondarray);
                myinsertionsorts.setEnabled(false);
                mybubblesort.setEnabled(false);

                myheapsorts.setEnabled(false);
                myquicksorts.setEnabled(false);
                mymergesorts.setEnabled(false);
                myinsertionsorts.setEnabled(false);
                mySelectionSort.setEnabled(false);
                myBenchmarkAll.setEnabled(false);

                Toast.makeText(AlgorithmBenchmarkActivity.this,
                        "SelectionSort", Toast.LENGTH_SHORT).show();
                break;
            }

            case (R.id.insertionsorts):
            {
                insertion(secondarray);
                myinsertionsorts.setEnabled(false);
                mybubblesort.setEnabled(false);

                myheapsorts.setEnabled(false);
                myquicksorts.setEnabled(false);
                mymergesorts.setEnabled(false);
                myinsertionsorts.setEnabled(false);
                mySelectionSort.setEnabled(false);
                myBenchmarkAll.setEnabled(false);
                Toast.makeText(AlgorithmBenchmarkActivity.this,
                        "insertionsorts", Toast.LENGTH_SHORT).show();

                break;
            }

            case (R.id.mergesort):
            {

                mergeSort(secondarray);
                myinsertionsorts.setEnabled(false);
                mybubblesort.setEnabled(false);

                myheapsorts.setEnabled(false);
                myquicksorts.setEnabled(false);
                mymergesorts.setEnabled(false);
                myinsertionsorts.setEnabled(false);
                mySelectionSort.setEnabled(false);
                myBenchmarkAll.setEnabled(false);

                Toast.makeText(AlgorithmBenchmarkActivity.this,
                        "mergesort", Toast.LENGTH_SHORT).show();

                break;

            }


            case (R.id.quicksort):
            {

                quick(secondarray);
                myinsertionsorts.setEnabled(false);
                mybubblesort.setEnabled(false);

                myheapsorts.setEnabled(false);
                myquicksorts.setEnabled(false);
                mymergesorts.setEnabled(false);
                myinsertionsorts.setEnabled(false);
                mySelectionSort.setEnabled(false);
                myBenchmarkAll.setEnabled(false);
                Toast.makeText(AlgorithmBenchmarkActivity.this,
                        "quicksort", Toast.LENGTH_SHORT).show();

                break;

            }
            case (R.id.heapsort):
            {
                heapify(secondarray);

                myinsertionsorts.setEnabled(false);
                mybubblesort.setEnabled(false);

                myheapsorts.setEnabled(false);
                myquicksorts.setEnabled(false);
                mymergesorts.setEnabled(false);
                myinsertionsorts.setEnabled(false);
                mySelectionSort.setEnabled(false);
                myBenchmarkAll.setEnabled(false);
                Toast.makeText(AlgorithmBenchmarkActivity.this,
                        "heapsort", Toast.LENGTH_SHORT).show();

                break;

            }
            case (R.id.BenchmarkAll):
            {
                myBenchmarkAll.setEnabled(false);
                bubbleSort( secondarray);
                mybubblesort.setEnabled(false);
                selectionSort(secondarray);
                mySelectionSort.setEnabled(false);
                insertion(secondarray);
                myinsertionsorts.setEnabled(false);
                mergeSort(secondarray);
                mymergesorts.setEnabled(false);

                quick(secondarray);
                myquicksorts.setEnabled(false);
                heapify(secondarray);
                myheapsorts.setEnabled(false);
                myBenchmarkAll.setEnabled(false);
                Toast.makeText(AlgorithmBenchmarkActivity.this,
                        "BenchmarkAll", Toast.LENGTH_SHORT).show();

                break;

            }











        }







    }

    public static void bubbleSort(int[] arry) {






        int swap = 0;
        int[] array = new int[arry.length];
        starttime=(long) System.currentTimeMillis();
        for (int i = 0; i < arry.length; i++) {
            array[i] = arry[i];
        }
        for (int a = 0; a < (array.length - 1); a++) {
            for (int b = 0; b < (array.length - a - 1); b++) {
                if (array[b] > array[b + 1]) /* For descending order use < */
                {
                    swap = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = swap;
                }
            }
        }
        lasttime=(long) System.currentTimeMillis();
        finaltime=lasttime-starttime;

        String mybubblesortvale=Long.toString(finaltime);
        bubblearrayvalue.setText(mybubblesortvale);

    }

    public static void selectionSort(int[] arr) {
        starttime=(long) System.currentTimeMillis();
        for (int i = 0; i < arr.length - 1; i++) {

            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;

        }
        lasttime=(long) System.currentTimeMillis();
        finaltime=lasttime-starttime;

        int selectionsortvale=arr.length;
        String myselectionsortvale=Long.toString(finaltime);;
        myselection.setText(myselectionsortvale);


    }

    public static void insertion(int[] input) {
        starttime=(long) System.currentTimeMillis();
        int temp;
        for (int i = 1; i < input.length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j] < input[j - 1]) {
                    temp = input[j];
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                }
            }
        }
        lasttime=(long) System.currentTimeMillis();
        finaltime=lasttime-starttime;


        String myselectionsortvale=Long.toString(finaltime);;
        myinsertionsort.setText(myselectionsortvale);


    }

    public static void mergeSort(int[] array) {
        starttime=(long) System.currentTimeMillis();
        if (array.length > 1) {
            int[] left = leftHalf(array);
            int[] right = rightHalf(array);
            mergeSort(left);
            mergeSort(right);
            merge(array, left, right);
            lasttime=(long) System.currentTimeMillis();
            finaltime=lasttime-starttime;
            String myselectionsortvale=Long.toString(finaltime);
            mymergesort.setText(myselectionsortvale);



        }
    }
    public static int[] leftHalf(int[] array) {
        int size1 = array.length / 2;
        int[] left = new int[size1];
        for (int i = 0; i < size1; i++) {
            left[i] = array[i];
        }
        return left;
    }

    public static int[] rightHalf(int[] array) {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int[] right = new int[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = array[i + size1];
        }
        return right;
    }

    public static void merge(int[] result, int[] left, int[] right) {
        int i1 = 0;
        int i2 = 0;

        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
                result[i] = left[i1];
                i1++;
            } else {
                result[i] = right[i2];
                i2++;
            }
        }


    }
    public static void quick(int[] arr) {
        starttime=(long) System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        lasttime=(long) System.currentTimeMillis();
        finaltime=lasttime-starttime;
        String myselectionsortvale=Long.toString(finaltime);
        myquicksort.setText(myselectionsortvale);
    }

    public static void quickSort(int arr[], int low, int high) {
        int i = low, j = high;
        int temp;
        int pivot = arr[(low + high) / 2];

        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(arr, low, j);
        if (i < high)
            quickSort(arr, i, high);
    }

    public static void heapify(int arr[]) {
        starttime=(long) System.currentTimeMillis();
        N = arr.length - 1;
        for (int i = N / 2; i >= 0; i--)
            maxheap(arr, i);
        lasttime=(long) System.currentTimeMillis();
        finaltime=lasttime-starttime;
        String myselectionsortvale=Long.toString(finaltime);
        myheapsort.setText(myselectionsortvale);
    }

    /* Function to swap largest element in heap */
    public static void maxheap(int arr[], int i) {
        int left = 2 * i;
        int right = 2 * i + 1;
        int max = i;
        if (left <= N && arr[left] > arr[i])
            max = left;
        if (right <= N && arr[right] > arr[max])
            max = right;

        if (max != i) {
            swapNumbers(i, max, arr);
            maxheap(arr, max);
        }
    }

    private static void swapNumbers(int i, int j, int[] array) {
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }



}
