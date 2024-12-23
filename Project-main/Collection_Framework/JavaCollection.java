import java.util.*;

public class JavaCollection{
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("Apple");  // Insert element
        list.add("Banana");
        list.add("Orange");
        list.add("Mango");
        list.add("Banana");  // Insert duplicate
        
        System.out.println("List after insertion: " + list);
        
        boolean containsApple = list.contains("Apple");  // Searching
        System.out.println("List contains 'Apple': " + containsApple);
        
        
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        
        list.set(2, "Pineapple");  
        System.out.println("List after modification: " + list);

        
        list.remove("Banana");  
        System.out.println("List after deletion: " + list);

        
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Mango");
        set.add("Banana");  
        
        System.out.println("Set after insertion: " + set);

       
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);   
        map.put("Banana", 5);
        map.put("Orange", 2);
        map.put("Mango", 4);

        // 8. Searching in the Map
        Integer appleCount = map.get("Apple");
        System.out.println("Count of Apple: " + appleCount);
        
        // 9. Iterating through the Map
        System.out.println("Map contents:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 10. Deleting an entry from the Map
        map.remove("Banana");  // Removing key "Banana"
        System.out.println("Map after deletion: " + map);

        // 11. Create a Queue (LinkedList) and perform operations
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");  
        queue.add("Banana");
        queue.add("Orange");

        System.out.println("Queue after insertion: " + queue);

        // (remove from the front)
        String removedItem = queue.poll();
        System.out.println("Removed from queue: " + removedItem);
        System.out.println("Queue after dequeue: " + queue);
    }
}
