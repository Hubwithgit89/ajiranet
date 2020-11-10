#!/usr/bin/env python3
"""
dl_insert.py file contains the functions to insert the elements to 
doubly linked list.
This file supports two funtions to insert a node in the doubly 
linked list. (dl_insert_before, dl_insert_after)

Authour: ?
"""

from dlist_node import DListNode

def dl_insert_before(head, ins_node, new_node):
    """dl_insert_before function insert the new_node before ins_node
    in the doubly linked list and return head of the updated  list"""

    if ins_node is None: 
        print("ins_node is not present in the List") 
        return head
    # if new node to be inserted before the  head node
    if ins_node.val == head.val:
        new_node.next = ins_node
        new_node.next.prev = new_node
        head = new_node 
        return head
    # if new node to be inserted before other nodes of the list
    new_node.next = ins_node
    ins_node.prev.next = new_node
    new_node.prev = ins_node.prev
    new_node.next.prev = new_node
    return head

    

def dl_insert_after(head, ins_node, new_node):
    """dl_insert_after function insert the new_node after ins_node
    in the doubly linked list and return head of the updated  list"""

    if ins_node is None: 
        print("ins_node is not present in the List") 
        return head
    # set new node as next of ins_node 
    new_node.next = ins_node.next
    # set next of ins_node as new_node  
    ins_node.next = new_node 
    # set ins_node as previous of new_node 
    new_node.prev = ins_node 
    # update previous of new_node's next node 
    if new_node.next is not None: 
        new_node.next.prev = new_node 
    return head

