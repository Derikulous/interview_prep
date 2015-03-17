# Your task is to
# • write a function that checks whether the braces in each string are correctly matched
# • prints 1 to standard output (stdout) if the braces in each string are matched and 0 if they're not (one result per line)
# Note that your function will receive the following arguments:
# • expressions
# o which is an array of strings containing braces
# Data constraints
# • the length of the array will not exceed 100
# • the length of any string will not exceed 5000
# Efficiency constraints
# • your function is expected to print the result in less than 2 seconds

# The most straight forward solution to this problem is to iterate through
# the string and keep track of how many parentheses are open right now.
# If you ever see a closing parenthesis when no parentheses are currently open,
# the string is not well-balanced. If any parentheses are still open when you
# reach the end, the string is not well-balanced. Otherwise it is.

def check_braces(expressions)

  mirrored = { "[" => "]", "{" => "}", "(" => ")" }
  arr = Array.new

  expressions.chars.each do |char|
    if char.match(/[\[|\{|\(]/) then arr << char
    elsif char.match(/[\]|\}|\)]/)
      if mirrored[arr.pop] != char
        return 0
      else
        return 1
      end
    end
  end
  arr.empty?
end


# expressions = [ ")(){}", "[]({})", "([])", "{()[]}", "([)]" ]
# output => 0 1 1 1 0

p check_braces(")(){}") # => 0 SyntaxError: unexpected ')'
p check_braces("[]({})") # => 1
p check_braces("([])") # => 1
p check_braces("{()[]}") # => 1
p check_braces("([)]") # => 0 raises SyntaxError: unexpected ')', expecting ']'
p check_braces("[{(})]") # => 0
p check_braces("(){[]}}(){") # => 1, why is this failing...
