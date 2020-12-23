package game


class Game extends  NewGame {
  var cache:Map[Int,Int] = Map()

  def stopGame(): Boolean = {
    print("Would you like to finish game, press yes, if yes or no if no")
    val answer = scala.io.StdIn.readLine()
    if(answer.toLowerCase.contains("yes")){
      return true
    }
    false
  }


  def addToCash(gameNumber: Int, counter: Int): Any ={
    cache  += (gameNumber -> counter)
    print("Current result: "+counter)
    println(s"Best  result: game number: ${cache.minBy(_._2)._1} game result: ${cache.minBy(_._2)._2}")
    cache
  }

  override def createNumber(): Int = {
    val r = scala.util.Random
    val guess = r.nextInt(10)
    println(guess)
    guess
  }

  override def enterYouAnswer(): Int = {
    println("Enter a number from 0 to 10: ")
    var userNumber = scala.io.StdIn.readInt()
    println(userNumber)
    userNumber
  }

   def checkResult(userNumber:Int, guess: Int ): Any={
   if(userNumber==guess){
     println("You Win!!!")
     true
   } else {
     println("Try again");
     false
   }

  }


}
