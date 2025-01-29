package linkedlist.singlylinkedlist.socialmediafriendconnection;

class UserNode {
    int userId;
    String name;
    int age;
    FriendNode friendHead;
    UserNode next;

    public UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendHead = null;
        this.next = null;
    }

    public void addFriend(int friendId) {
        if (!isFriend(friendId)) {
            FriendNode newFriend = new FriendNode(friendId);
            newFriend.next = friendHead;
            friendHead = newFriend;
        }
    }

    public void removeFriend(int friendId) {
        FriendNode temp = friendHead, prev = null;
        while (temp != null && temp.friendId != friendId) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) return;
        if (prev == null) {
            friendHead = temp.next;
        } else {
            prev.next = temp.next;
        }
    }

    public boolean isFriend(int friendId) {
        FriendNode temp = friendHead;
        while (temp != null) {
            if (temp.friendId == friendId) return true;
            temp = temp.next;
        }
        return false;
    }

    public void displayFriends() {
        FriendNode temp = friendHead;
        System.out.print(name + "'s Friends: ");
        if (temp == null) {
            System.out.println("No friends.");
            return;
        }
        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int countFriends() {
        int count = 0;
        FriendNode temp = friendHead;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
