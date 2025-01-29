package linkedlist.singlylinkedlist.socialmediafriendconnection;

// Class representing a friend's node (used in UserNode)
class FriendNode {
    int friendId;
    FriendNode next;

    public FriendNode(int friendId) {
        this.friendId = friendId;
        this.next = null;
    }
}