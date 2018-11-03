package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(1001,"Dylan Murphy", 'M', 1976, 7,22,32));
        theForumUserList.add(new ForumUser(1002,"Phoebe Pearson", 'F', 1991, 4,13, 12));
        theForumUserList.add(new ForumUser(1003,"Richard Walsh", 'M',2000,1,4, 20));
        theForumUserList.add(new ForumUser(1004,"Donald Murphy", 'M',1980, 3,3,0));
        theForumUserList.add(new ForumUser(1005,"Ryan Talley",'M', 1972,7,7,3));
        theForumUserList.add(new ForumUser(1006,"Mathilda Carson", 'F', 1957,8,2,1));
        theForumUserList.add(new ForumUser(1007,"Richard Winters", 'M',1992,5,3,111));
        theForumUserList.add(new ForumUser(1008,"Mark Greene", 'M', 1967,3,12,1));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUserList);
    }
}
