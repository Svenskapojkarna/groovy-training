class Tweet {
    String username
    String text
    Integer retweets
    Integer favorites
    Date createdOn

    Tweet(String user, String tweet){
        username = user
        text = tweet
        retweets = 0
        favorites = 0
        createdOn = new Date()
    }

    String toString(){
        "Username: $username\nTweet: $text\nRetweets: $retweets\nFavorites: $favorites\nCreated on: $createdOn"
    }

    void addToRetweets(){
        retweets++
    }

    void addToFavorites(){
        favorites++
    }
}