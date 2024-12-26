import java.util.*;

public class JavaCollection{
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("Red");  // Insert element
        list.add("Blue");
        list.add("Yellow");
        list.add("Green");
        list.add("Violet");  // Insert duplicate
        
        System.out.println("List after insertion: " + list);
        
        boolean containsRed = list.contains("Red");  // Searching
        System.out.println("List contains 'Red': " + containsRed);
        
        
        Collections.sort(list);
        
        System.out.println("Sorted List: " + list);

        
        list.set(2, "Black");  
        System.out.println("List after modification: " + list);

        
        list.remove("Yellow");  
        System.out.println("List after deletion: " + list);

        
        Set<String> set = new HashSet<>();
        set.add("Red");
        set.add("Blue");
        set.add("Yellow");
        set.add("Green");
        set.add("Violet");  
        
        System.out.println("Set after insertion: " + set);

       
        Map<String, Integer> map = new HashMap<>();
        map.put("Red", 3);   
        map.put("Blue", 5);
        map.put("Green", 2);
        map.put("Violet", 4);

        // 8. Searching in the Map
        Integer redCount = map.get("Red");
        System.out.println("Count of Red: " + redCount);
        
        // 9. Iterating through the Map
        System.out.println("Map contents:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 10. Deleting an entry from the Map
        map.remove("Violet");  // Removing key "Violet"
        System.out.println("Map after deletion: " + map);

        // 11. Create a Queue (LinkedList) and perform operations
        Queue<String> queue = new LinkedList<>();
        queue.add("Red");  
        queue.add("Blue");
        queue.add("Green");

        System.out.println("Queue after insertion: " + queue);

        // (remove from the front)
        String removedItem = queue.poll();
        System.out.println("Removed from queue: " + removedItem);
        System.out.println("Queue after dequeue: " + queue);
    }
}
