package com.yang

object Demo1 {
  def main(args: Array[String]): Unit = {
    new ChildUser
  }
}
trait MyTrait{
  println("nihao")
}
class ParentUser extends MyTrait {
  println("i am laozi")
}
class ChildUser extends ParentUser with MyTrait{
  println("i am erzi")
}