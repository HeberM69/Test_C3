bool isPalindrome(ListNode* head) {
    ListNode *slow = head, *fast = head;
    while (fast && fast->next) {
        slow = slow->next;
        fast = fast->next->next;
    }
    // Bug: falta revertir la segunda mitad de la lista
    while (slow) {
        if (head->val != slow->val) return false;
        head = head->next;
        slow = slow->next;
    }
    return true;
}
