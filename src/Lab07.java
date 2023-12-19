public class Lab07 {
    public static void main(String[] args) {
        // Test the Set implementation
        MySet<String> mySet = new HashMapSet<>();

        mySet.add("Apple");
        mySet.add("Banana");
        mySet.add("Orange");

        System.out.println("Set contains 'Banana': " + mySet.contains("Banana"));
        System.out.println("Set size: " + mySet.size());

        mySet.remove("Apple");

        System.out.println("Set contains 'Apple': " + mySet.contains("Apple"));
        System.out.println("Set size after removal: " + mySet.size());
    }
}

// Reference : https://chat.openai.com/