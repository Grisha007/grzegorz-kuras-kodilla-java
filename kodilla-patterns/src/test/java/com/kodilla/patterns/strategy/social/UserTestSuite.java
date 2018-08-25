package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John Smith");
        User adam = new YGeneration("Adam Nowak");
        User jan = new ZGeneration("Jan Kowalski");

        //When
        String johnSocialMedia = john.socialMedia();
        System.out.println("John " + johnSocialMedia);

        String adamSocialMedia = adam.socialMedia();
        System.out.println("Adam " + adamSocialMedia);

        String janSocialMedia = jan.socialMedia();
        System.out.println("Jan " + janSocialMedia);

        //Then
        Assert.assertEquals("using TWITTER", johnSocialMedia);
        Assert.assertEquals("using FACEBOOK", adamSocialMedia);
        Assert.assertEquals("using SNAPCHAT", janSocialMedia);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User john = new Millenials("John Smith");
        User adam = new YGeneration("Adam Nowak");
        User jan = new ZGeneration("Jan Kowalski");

        //When
        String johnSocialMedia = john.socialMedia();
        System.out.println("John " + johnSocialMedia);
        john.setSocialMedia(new FacebookPublisher());
        johnSocialMedia = john.socialMedia();
        System.out.println("John now " + johnSocialMedia);

        String adamSocialMedia = adam.socialMedia();
        System.out.println("Adam " + adamSocialMedia);
        adam.setSocialMedia(new SnapchatPublisher());
        adamSocialMedia = adam.socialMedia();
        System.out.println("Adam now " + adamSocialMedia);

        String janSocialMedia = jan.socialMedia();
        System.out.println("Jan " + janSocialMedia);
        jan.setSocialMedia(new TwitterPublisher());
        janSocialMedia = jan.socialMedia();
        System.out.println("Jan now " + janSocialMedia);

        //Then
        Assert.assertEquals("using FACEBOOK", johnSocialMedia);
        Assert.assertEquals("using SNAPCHAT", adamSocialMedia);
        Assert.assertEquals("using TWITTER", janSocialMedia);
    }
}
