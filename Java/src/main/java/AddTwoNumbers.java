import java.util.ArrayList;

/**
 * AddTwoNumbers
 */
public class AddTwoNumbers {

    public static void selfTest() {
        ListNode listNode1 = makeListNode(321);
        
        ListNode listNode2 = makeListNode(123);

        ListNode sumNode = addTwoNumbers(listNode1, listNode2);
        ListNode sumNextNode = sumNode;
        while(sumNextNode!=null)
            {
                if(sumNextNode!=null)
                {
                    System.out.print(sumNextNode.val);
                    sumNextNode = sumNextNode.next;
                }
            }
    }
    
public static ListNode makeListNode(long n) {
        ListNode listNode = new ListNode((int)(n % 10));
        ListNode listNextNode = listNode;
        n = n / 10;
        while (n != 0) {
            listNextNode.next = new ListNode((int)(n % 10));
            listNextNode = listNextNode.next;
            n = n / 10;
        }
    return listNode;
}

        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode l1NextNode = l1;
            ListNode l2NextNode = l2;
            ListNode resultNode = new ListNode(0);
            ListNode resultNextNode = resultNode;
            int l1Tmp,l2Tmp,resultTmp=0;
            while(l1NextNode!=null||l2NextNode!=null)
            {
                if(l1NextNode!=null)
                {
                l1Tmp = l1NextNode.val;
                l1NextNode = l1NextNode.next;
                }
                else
                l1Tmp = 0;
                if(l2NextNode!=null)
                {
                l2Tmp = l2NextNode.val;
                l2NextNode = l2NextNode.next;
                }
                else
                l2Tmp = 0;
                resultTmp = resultTmp + l1Tmp + l2Tmp;
                resultNextNode.val = resultTmp%10;
                if(l1NextNode!=null||l2NextNode!=null)
                {
                    resultNextNode.next = new ListNode(0);
                    resultNextNode = resultNextNode.next;
                }
                resultTmp /= 10;
            }
            if (resultTmp > 0) 
            resultNextNode.next = new ListNode(resultTmp);
            return resultNode;
        }

}

/**
 * ListNode
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
    
}