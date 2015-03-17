# Compute the square root of a number

def sqRt?(num)
  def goodEnough(guess)
    return (num-(guess^2)).abs < 0.0001
    guess = 1
  end
  while not goodEnough(guess)
    guess = avg(guess,num/guess)
    return guess
  end
end


p goodEnough(10)
