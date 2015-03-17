# Compute the binary representation of an integer

def bin(num)
  return 0 if num == 0
  return 1 if num == 1
  return num / 2 + num % 2
end

p bin(0)
p bin(1)
p bin(3)
p bin(145)
