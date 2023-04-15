package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    Integer[] intArray;
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {

   return Arrays.stream(array).filter((numb) -> (Arrays.stream(array).filter((fil) -> fil.equals(numb)).count())
           < maxNumberOfDuplications).toArray(size -> Arrays.copyOf(array, size));

    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array).filter((number) -> (Arrays.stream(array).filter((fil) -> fil.equals(number)).count())
                != exactNumberOfDuplications).toArray(size -> Arrays.copyOf(array, size));


//        List<Integer> list = Arrays.asList(intArray);
//        List<Integer> listWithout = list.stream()
//                .distinct()
//                .collect(Collectors.toList());
//        return listWithout.toArray(new Integer[0]);
    }
}
