import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList placesTovisit = new  LinkedList<>();
        placesTovisit.add("Sydney");
        placesTovisit.add(0,"Canberra");
        System.out.println(placesTovisit);
        addElements(placesTovisit);
        System.out.println(placesTovisit);
        removeElements(placesTovisit);
        System.out.println(placesTovisit);

    }
    private  static  void addElements(LinkedList<String> list)
    {
        list.addFirst("Darwin");
        list.addLast("Hobart");
        //queue methods
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

    }
    private static  void removeElements(LinkedList<String> list)
    {
        list.remove(0);
        list.remove("Melbourne");
        System.out.println(list);
        String  s1=list.remove();
        System.out.println(s1 +" was removed");//first element was removed
        String  s2=list.removeFirst();
        System.out.println(s2+" was removed");//first element was removed
        String  s3=list.removeLast();
        System.out.println(s3+" was removed");//last element was removed


        //queue,deque,poll methods
        String p1= list.poll();
        System.out.println(p1+" was removed");//first element was removed
        String p2= list.pollFirst();
        System.out.println(p2+" was removed");//first element was removed
        String p3= list.pollLast();
        System.out.println(p3+" was removed");//first element was removed
        list.push("aaa");
        list.push("bbb");
        list.push("ccc");
        System.out.println(list);
        String p4= list.pop();
        System.out.println(p4+" was removed");//first element was removed


    }

}