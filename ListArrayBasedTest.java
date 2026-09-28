public class ListArrayBasedTest
{
  public static void main(String[] args)
  {
    ListArrayBased list = new ListArrayBased();

    System.out.println("isEmpty: " + list.isEmpty());   // true

    list.add(1, "A");
    list.add(2, "B");
    list.add(3, "C");
    displayList(list);                                   // [A, B, C]

    System.out.println("size: " + list.size());          // 3
    System.out.println("get(2): " + list.get(2));        // B

    list.remove(2);
    displayList(list);                                   // [A, C]

    list.removeAll();
    displayList(list);                                   // List is empty
    System.out.println("isEmpty: " + list.isEmpty());    // true
  }

  public static void displayList(ListInterface list)
  {
    if (list.isEmpty())
    {
      System.out.println("List is empty");
      return;
    }
    String output = "[";
    for (int i = 1; i <= list.size(); i++)
    {
      output = output + list.get(i);
      if (i < list.size())
      {
        output = output + ", ";
      }
    }
    output = output + "]";
    System.out.println(output);
  }
}