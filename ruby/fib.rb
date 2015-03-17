# Find the nth number of a fibonacci sequence

# this solution is not good for large numbers because of recursion
def fibonacci(num)
  return num if [0, 1].include? num
  fibonacci(num - 2) + fibonacci(num - 1)
end

p fibonacci(4)
p fibonacci(5)
p fibonacci(7)


# Given a number, is the number a fibonacci number?

def is_fibonacci?(num)
  arr = [0, 1]
  while num > arr.last
    x, y = arr.pop(2)
    arr.push(x, y, x + y)
  end

  return true if num == arr.last
  return false
end

# Find the nth number of a fibonacci sequence
def fib(a, b = 1, c = 0, count = 2)
  return 0 if a == 0
  return 1 if a == 1
  return b + c if count == a
  fib(a, b + c, b, count += 1)
end

p fib(10)

