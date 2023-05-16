public class TekrarEden {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 6, 2, 10, 8, 4, 6, 12};
        findDuplicateEvenNumbers(numbers);
    }

    public static void findDuplicateEvenNumbers(int[] numbers) {
        List<Integer> duplicateEvenNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];

           
            if (currentNumber % 2 == 0) {
                for (int j = i + 1; j < numbers.length; j++) {
                    int comparedNumber = numbers[j];

                    if (currentNumber == comparedNumber && !duplicateEvenNumbers.contains(currentNumber)) {
                        duplicateEvenNumbers.add(currentNumber);
                        break;
                    }
                }
            }
        }

        if (duplicateEvenNumbers.isEmpty()) {
            System.out.println("Tekrar eden çift sayi bulunamadi.");
        } else {
            System.out.println("Tekrar eden çift sayilar: " + duplicateEvenNumbers);
        }
    }
}