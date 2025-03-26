package pipeandfilters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PipeAndFilters {

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Function<List<Integer>, List<Integer>>> filters = new ArrayList<>();
        filters.add(PipeAndFilters::filterEvenNumbers);
        filters.add(PipeAndFilters::squareNumbers);
        filters.add(PipeAndFilters::filterNumbersGreaterThanTen);
        filters.add(PipeAndFilters::addFiveToEachNumber); // Add the new filter

        List<Integer> result = PipeAndFilters.processPipeline(input, filters);

        System.out.println("Final Result: " + result);
    }

    private static List<Integer> processPipeline(List<Integer> input, List<Function<List<Integer>, List<Integer>>> filters) {
        List<Integer> output = input;
        for (Function<List<Integer>, List<Integer>> filter : filters) {
            output = filter.apply(output);
            System.out.println("Pipeline Step: " + output);
        }
        return output;
    }

    private static List<Integer> filterEvenNumbers(List<Integer> input) {
        return input.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    private static List<Integer> squareNumbers(List<Integer> input) {
        return input.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    private static List<Integer> filterNumbersGreaterThanTen(List<Integer> input) {
        return input.stream()
                .filter(n -> n > 10)
                .collect(Collectors.toList());
    }

    private static List<Integer> addFiveToEachNumber(List<Integer> input) {
        return input.stream()
                .map(n -> n + 5)
                .collect(Collectors.toList());
    }
}