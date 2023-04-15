package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    String[] intArray;
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        return Arrays.stream(array).filter((str) -> (Arrays.stream(array).filter((fil) -> fil.equals(str)).count())
                < maxNumberOfDuplications).toArray(size -> Arrays.copyOf(array, size));
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return Arrays.stream(array).filter((str) -> (Arrays.stream(array).filter((fil) -> fil.equals(str)).count())
                != exactNumberOfDuplications).toArray(size -> Arrays.copyOf(array, size));
    }
}
