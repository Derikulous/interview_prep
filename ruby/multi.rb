# multiplication if a number is non-zero
def mult(a, b = a)
  puts " #{a} and #{b} "
  return 0 if a == 0
  return b + mult(a-1, b)
end

p mult(10)
