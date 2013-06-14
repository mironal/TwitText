package com.github.mironal.twitter.twittext

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;

object App {
  def main(args: Array[String]) {
    args.toList match {
      case Nil => usage()
      case "-s"::xs => tweet(xs)
      case xs  => tweetWithPrint(xs)
    }
  }


  def tweet(args: List[String]):Status = {
    val text = args.mkString(" ")
    val twitter = new TwitterFactory().getInstance()
    twitter.updateStatus(text)
  }

  def tweetWithPrint(args: List[String]) = println(tweet(args).getText())



  def usage() {
    println("java -jar TweetText.jar [text to tweet]")
    println("no stdout. -s option.")
    println("java -jar TweetText.jar -s [text to tweet]");
  }
}
