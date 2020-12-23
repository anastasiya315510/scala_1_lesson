package game

object Main {
  def main(args: Array[String]): Unit = {
    var userNumber = -1
    var gameNumber = 0
    val obj = new Game();
    var stopGame = false
    do {
      val guess = obj.createNumber()
      var counter = 0;
      do {
        userNumber = obj.enterYouAnswer()
        counter += 1;
      } while (obj.checkResult(guess, userNumber) != true)
      gameNumber += 1
      obj.addToCash(gameNumber, counter)
      stopGame = obj.stopGame

    } while (stopGame != true)

  }
}