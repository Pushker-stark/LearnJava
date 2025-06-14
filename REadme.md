| Type      | Size    | Example                  | Description                          |
| --------- | ------- | ------------------------ | ------------------------------------ |
| `byte`    | 1 byte  | `byte b = 100;`          | Small integers (-128 to 127)         |
| `short`   | 2 bytes | `short s = 32000;`       | Larger than byte (-32,768 to 32,767) |
| `int`     | 4 bytes | `int i = 100000;`        | Most common for whole numbers        |
| `long`    | 8 bytes | `long l = 10000000000L;` | Very large integers                  |
| `float`   | 4 bytes | `float f = 5.75f;`       | Decimal numbers (less precision)     |
| `double`  | 8 bytes | `double d = 19.99;`      | Decimal numbers (more precision)     |
| `char`    | 2 bytes | `char c = 'A';`          | Single character (Unicode)           |
| `boolean` | 1 bit   | `boolean b = true;`      | True or false                        |





| Type          | Example                          | Description                          |
| ------------- | -------------------------------- | ------------------------------------ |
| `String`      | `String s = "Hello";`            | Sequence of characters (object)      |
| `Arrays`      | `int[] arr = {1, 2, 3};`         | Collection of elements of same type  |
| `Classes`     | `MyClass obj = new MyClass();`   | Any user-defined or built-in class   |
| `Interfaces`  | `Runnable r = new MyRunnable();` | Implement behaviors                  |
| `Collections` | `List<Integer> list = ...;`      | Java Collections like List, Set, Map |

| C++ STL          | Java Equivalent (Collections Framework)      |
| ---------------- | -------------------------------------------- |
| `vector<int>`    | `ArrayList<Integer>`                         |
| `list<int>`      | `LinkedList<Integer>`                        |
| `set<int>`       | `HashSet<Integer>` / `TreeSet<Integer>`      |
| `map<int, int>`  | `HashMap<Integer, Integer>` / `TreeMap<...>` |
| `stack<int>`     | `Stack<Integer>` / `Deque<Integer>`          |
| `queue<int>`     | `Queue<Integer>` / `LinkedList<Integer>`     |
| `priority_queue` | `PriorityQueue<Integer>`                     |
| `unordered_map`  | `HashMap<K, V>`                              |
| `unordered_set`  | `HashSet<T>`                                 |


| Collection Type    | Use Case Example                |
| ------------------ | ------------------------------- |
| `ArrayList<T>`     | Resizable array                 |
| `LinkedList<T>`    | Fast insert/delete              |
| `HashSet<T>`       | Unique unordered elements       |
| `TreeSet<T>`       | Sorted unique elements          |
| `HashMap<K,V>`     | Key-value storage (fast lookup) |
| `TreeMap<K,V>`     | Sorted key-value storage        |
| `PriorityQueue<T>` | Min-heap / Max-heap             |
| `Deque<T>`         | Double-ended queue              |
