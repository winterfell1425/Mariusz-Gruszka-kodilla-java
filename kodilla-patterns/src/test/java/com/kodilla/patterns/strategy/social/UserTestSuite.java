package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;
public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User mike = new Millenials("Mike Smith");
        User jane = new YGeneration("Jane Snow");
        User frank = new ZGeneration("Frank Greene");

        //When
        String mikeWantsShare = mike.sharePost();
        System.out.println("Mike wants to share with: " + mikeWantsShare);
        String janeWantsShare = jane.sharePost();
        System.out.println("Jane wants to share with: " + janeWantsShare);
        String frankWantsShare = frank.sharePost();
        System.out.println("Frank wants to share with: " + frankWantsShare);

        //Then
        Assert.assertEquals("Facebook", mikeWantsShare);
        Assert.assertEquals("Twitter", janeWantsShare);
        Assert.assertEquals("Snapchat", frankWantsShare);
    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User mike = new Millenials("Mike Smith");

        //When
        String mikeWantsShare = mike.sharePost();
        System.out.println("Mike wants to share with: " + mikeWantsShare);
        mike.setSharingStrategy(new TwitterPublisher());
        mikeWantsShare = mike.sharePost();
        System.out.println("Mike now wants to share with: " + mikeWantsShare);

        //Then
        Assert.assertEquals("Twitter", mikeWantsShare);
    }
}
