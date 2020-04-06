package com.designpatterns.creational.factory;

public class Blog extends Website {

    // Only the pages needed to create a blog.
    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new CommentPage());
        pages.add(new ContactPage());
    }
}
