class chapter1 {

  // 1.1
  def isUnique(word: String): Boolean = {
    for (i <- 0 to word.length-1){
      for (j <- i to word.length-1)
        if (i != j && word(i) == word(j)) false
    }
    true
  }

  // 1.2
  def

}
