package com.github.mironal.twitter.twittext

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;

object App {
  def main(args: Array[String]) {
    args.toList match {
      case Nil => usage()
      case xs  => tweet(xs)
    }
  }

  def tweet(args: List[String]) {
    val text = args.mkString(" ")
    val twitter = new TwitterFactory().getInstance()
    val status = twitter.updateStatus(text)
    println(status.getText())

  }

  def usage() {
    println("java -jar TweetText.jar text to tweet")
  }
}
