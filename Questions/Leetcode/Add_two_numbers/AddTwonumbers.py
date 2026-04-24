class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
        
def add_two_lists(l1, l2):
    carry = 0
    l3 = ListNode(0)
    curr = l3
    while l1 or l2 or carry:
        val1 = l1.val if l1 else 0
        val2 = l2.val if l2 else 0
        sum = 0            
        sum = val1 + val2 + carry
        carry = sum // 10
        res = sum % 10
        new_node = ListNode(res)
        curr.next = new_node 
        curr = curr.next
        if l1:
            l1 = l1.next
        if l2:
            l2 = l2.next
    return l3.next
        

l1 = ListNode(2, ListNode(4, ListNode(3)))
l2 = ListNode(5, ListNode(6, ListNode(4)))

l3 = add_two_lists(l1, l2)

def display_list(l):
     curr  = l
     while curr:
        print(curr.val , end="->")
        curr = curr.next
        
print(display_list(l3))