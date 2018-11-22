package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsComputationTestSuite {
    @Test
    public void testStatisticsComputationZeroPosts() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsComputation statisticsComputation = new StatisticsComputation();
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(5);
        when(statisticsMock.postsCount()).thenReturn(0);

        //When
        statisticsComputation.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticsComputation.getAveNumOfPostPerUser(), 0.001);
        Assert.assertEquals(2.5, statisticsComputation.getAveNumOfCommPerUser(), 0.001);
        Assert.assertEquals(0, statisticsComputation.getAveNumOfCommPerPost(), 0.001);
    }

    @Test
    public void testStatisticsComputation1000Posts() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsComputation statisticsComputation = new StatisticsComputation();
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        users.add("user3");
        users.add("user4");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(20);
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        statisticsComputation.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(250, statisticsComputation.getAveNumOfPostPerUser(), 0.001);
        Assert.assertEquals(5, statisticsComputation.getAveNumOfCommPerUser(), 0.001);
        Assert.assertEquals(0.02, statisticsComputation.getAveNumOfCommPerPost(), 0.001);
    }

    @Test
    public void testStatisticsComputationZeroComments() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsComputation statisticsComputation = new StatisticsComputation();
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        users.add("user3");
        users.add("user4");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        statisticsComputation.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(250, statisticsComputation.getAveNumOfPostPerUser(), 0.001);
        Assert.assertEquals(0, statisticsComputation.getAveNumOfCommPerUser(), 0.001);
        Assert.assertEquals(0, statisticsComputation.getAveNumOfCommPerPost(), 0.001);
    }

    @Test
    public void testStatisticsComputationCommLessThanPosts() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsComputation statisticsComputation = new StatisticsComputation();
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(5);
        when(statisticsMock.postsCount()).thenReturn(10);

        //When
        statisticsComputation.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(5, statisticsComputation.getAveNumOfPostPerUser(), 0.001);
        Assert.assertEquals(2.5, statisticsComputation.getAveNumOfCommPerUser(), 0.001);
        Assert.assertEquals(0.5, statisticsComputation.getAveNumOfCommPerPost(), 0.001);
    }

    @Test
    public void testStatisticsComputationCommMoreThanPosts() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsComputation statisticsComputation = new StatisticsComputation();
        List<String> users = new ArrayList<>();
        users.add("user1");
        users.add("user2");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(5);

        //When
        statisticsComputation.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(2.5, statisticsComputation.getAveNumOfPostPerUser(), 0.001);
        Assert.assertEquals(5, statisticsComputation.getAveNumOfCommPerUser(), 0.001);
        Assert.assertEquals(2, statisticsComputation.getAveNumOfCommPerPost(), 0.001);
    }

    @Test
    public void testStatisticsComputationZeroUsers() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsComputation statisticsComputation = new StatisticsComputation();
        List<String> users = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.postsCount()).thenReturn(100);

        //When
        statisticsComputation.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticsComputation.getAveNumOfPostPerUser(), 0.001);
        Assert.assertEquals(0, statisticsComputation.getAveNumOfCommPerUser(), 0.001);
        Assert.assertEquals(0.1, statisticsComputation.getAveNumOfCommPerPost(), 0.001);
    }

    @Test
    public void testStatisticsComputation100Users() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsComputation statisticsComputation = new StatisticsComputation();
        List<String> users = new ArrayList<>();
        for (int n = 0; n < 100; n++) {
            users.add("user " + n);
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.commentsCount()).thenReturn(200);
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        statisticsComputation.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(10, statisticsComputation.getAveNumOfPostPerUser(), 0.001);
        Assert.assertEquals(2, statisticsComputation.getAveNumOfCommPerUser(), 0.001);
        Assert.assertEquals(0.2, statisticsComputation.getAveNumOfCommPerPost(), 0.001);
    }
}