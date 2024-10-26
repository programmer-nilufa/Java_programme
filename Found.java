public class Found {
        public static void main(String[] args) {

            int[] array = {1, 2, 5, 3, 9, 7};
            int target = 5;
            boolean found = false;

            for (int i = 0; i < array.length; i++) {
                if (array[i] == target) {
                    System.out.println("Number found at index: " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Not found");
            }
        }
}
