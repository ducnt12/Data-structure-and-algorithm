import java.util.Hashtable;

public class HashTableData {

    // Hashtable = A data structure that stores unique keys to values
    // ex.<Integer,String>
    // Each key/value pair is known as an Entry
    // FAST CRUD of key/value pairs
    // Not ideal for small data sets, great with large data sets
    // Index = key.hashCode() % capacity

    // Bucket = an indexed storage location for an or more Entries
    // Can store multiple Entries in case of collision (Entries with same index
    // stored as LinkedList)
    // Less collisions = more effeciency (more capacity = less collisions)

    // Runtime complexity: Best Case O(1)
    // Worst Case O(n)

    private static int capacity = 100;

    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>(capacity);

        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(322, "Sandy");
        table.put(555, "Squidward");
        table.put(777, "Gary");

        for (Integer key : table.keySet()) {
            System.out.println(key.hashCode() % capacity + "\t" + key + "\t" + table.get(key));
        }

        System.out.println(table.get(322));
    }
}
