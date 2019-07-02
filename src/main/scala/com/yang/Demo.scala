package com.yang

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Demo {
  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setAppName("WordCount").setMaster("local")
    val sc = new SparkContext(sparkConf)
    //val ss: RDD[Int] = sc.makeRDD(List(1,2,3,4,5))
    //val ss:RDD[Int] = sc.parallelize(List(1,2,3,4))
    val ss:RDD[String] = sc.textFile("input")
    ss.collect().foreach(println)
    println("nihao")

  }

}
