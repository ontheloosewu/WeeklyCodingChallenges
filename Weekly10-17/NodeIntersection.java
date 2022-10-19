import java.util.LinkedList;

public class NodeIntersection {

    public static int findIntersectingNode(LinkedList<Integer> listA, LinkedList<Integer> listB){
        while(listA.size() > listB.size()){
            listA.pop();
        }
        while(listB.size() > listA.size()){
            listB.pop();
        }
        while(listA.size() > 0 || listB.size() > 0){
            int data1 = listA.pop();
            int data2 = listB.pop();
            if(data1 == data2){
                return data1;
            }
        }
        return -1;
    }
}
