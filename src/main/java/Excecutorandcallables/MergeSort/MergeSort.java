package Excecutorandcallables.MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSort implements Callable<List<Integer>> {

    List<Integer> arraytosort;
    ExecutorService executorService;


    public MergeSort(List<Integer> arraytosort,ExecutorService executorService){
        this.arraytosort = arraytosort;
        this.executorService = executorService;
    }

    public List<Integer> call() throws Exception{

        if(arraytosort.size()<=1){
            return arraytosort;
        }


        int mid = arraytosort.size()/2;

        List<Integer> leftarray = new ArrayList<>();
        List<Integer> rightarray = new ArrayList<>();

            for(int i =0;i<mid;i++){
                leftarray.add(arraytosort.get(i));
            }

            for(int i = mid;i<arraytosort.size();i++){
                rightarray.add(arraytosort.get(i));
            }

            MergeSort leftmergesorter = new MergeSort(leftarray,executorService);
            MergeSort rightmergesorter = new MergeSort(rightarray,executorService);

            Future<List<Integer>> leftsortedarrayFuture = executorService.submit(leftmergesorter);
            Future<List<Integer>> rightsortedarrayFuture = executorService.submit(rightmergesorter);

            List<Integer> leftsortedarray = leftsortedarrayFuture.get();
            List<Integer> rightsortedarray = rightsortedarrayFuture.get();




            int i =0,j=0;

            List<Integer> sortedarray = new ArrayList<>();
            while(i<leftsortedarray.size() &&j<rightsortedarray.size()){
                if(leftsortedarray.get(i)<rightsortedarray.get(j)){
                    sortedarray.add(leftsortedarray.get(i));
                    i++;
                }
                else{
                    sortedarray.add(rightsortedarray.get(j));
                    j++;
                }
            }

            while(i<leftsortedarray.size()){
                sortedarray.add(leftsortedarray.get(i));
                i++;
            }

            while(j<rightsortedarray.size()){
                sortedarray.add(rightsortedarray.get(j));
                j++;
            }


            return sortedarray;


     }


}
