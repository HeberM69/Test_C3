struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(nullptr) {}
};

ListNode* reverseList(ListNode* head) {
    ListNode* prev = nullptr;
    ListNode* curr = head;
    while (curr != nullptr) {
        ListNode* next_node = curr->next;
        curr->next = prev;
        prev = curr;
        // Bug: falta curr = next_node;
    }
    return prev;
}
