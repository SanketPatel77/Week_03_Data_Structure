package linkedlist.singlylinkedlist.socialmediafriendconnection;

class FriendList {
    private UserNode head;

    public void addUser(int userId, String name, int age) {
        UserNode newUser = new UserNode(userId, name, age);
        if (head == null) {
            head = newUser;
        } else {
            UserNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
        System.out.println("User added: " + name + " (ID: " + userId + ")");
    }

    private UserNode findUser(int userId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == userId) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void addFriend(int userId1, int userId2) {
        UserNode user1 = findUser(userId1);
        UserNode user2 = findUser(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found.");
            return;
        }

        user1.addFriend(userId2);
        user2.addFriend(userId1);

        System.out.println(user1.name + " and " + user2.name + " are now friends.");
    }

    public void removeFriend(int userId1, int userId2) {
        UserNode user1 = findUser(userId1);
        UserNode user2 = findUser(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found.");
            return;
        }

        user1.removeFriend(userId2);
        user2.removeFriend(userId1);

        System.out.println(user1.name + " and " + user2.name + " are no longer friends.");
    }

    public void findMutualFriends(int userId1, int userId2) {
        UserNode user1 = findUser(userId1);
        UserNode user2 = findUser(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found.");
            return;
        }

        System.out.print("Mutual Friends: ");
        FriendNode temp = user1.friendHead;
        boolean found = false;

        while (temp != null) {
            if (user2.isFriend(temp.friendId)) {
                System.out.print(temp.friendId + " ");
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.print("None");
        }
        System.out.println();
    }

    public void displayFriends(int userId) {
        UserNode user = findUser(userId);
        if (user != null) {
            user.displayFriends();
        } else {
            System.out.println("User not found.");
        }
    }

    public void searchUser(String query) {
        UserNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(query) || String.valueOf(temp.userId).equals(query)) {
                System.out.println("User Found: ID: " + temp.userId + ", Name: " + temp.name + ", Age: " + temp.age);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("No user found with name or ID: " + query);
        }
    }

    public void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            System.out.println(temp.name + " (ID: " + temp.userId + ") has " + temp.countFriends() + " friend(s).");
            temp = temp.next;
        }
    }

    public void displayUsers() {
        if (head == null) {
            System.out.println("No users available.");
            return;
        }

        UserNode temp = head;
        System.out.println("All Users:");
        while (temp != null) {
            System.out.println("ID: " + temp.userId + ", Name: " + temp.name + ", Age: " + temp.age);
            temp = temp.next;
        }
    }
}
