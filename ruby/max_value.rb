# 4) Your task is to
# • write a function that computes the maximum value among the deviations of all the sequences considered above
# • print the value the standard output (stdout)
# Note that your function will receive the following arguments:
# • v
# o which is the array of integers
# • d
# o which is an integer value giving the length of the sequences
# Data constraints
# • the array will contain up to 100,000 elements
# • all the elements in the array are integer numbers in the following range: [1, 231 -1]
# • the value of d will not exceed the length of the given array
# Efficiency constraints
# • your function is expected to print the result in less than 2 seconds
# Input                 Output
# v: 6, 9, 4, 7, 4, 1
# d: 3                    6

# The sequences of length 3 are:
# • 6 9 4 having the median 5 (the minimum value in the sequence is 4 and the maximum is 9)
# • 9 4 7 having the median 5 (the minimum value in the sequence is 4 and the maximum is 9)
# • 7 4 1 having the median 6 (the minimum value in the sequence is 1 and the maximum is 7)
# • The maximum value among all medians is 6
# def find_deviation(v, d)
#     # Write your code here
#     # To print results to the standard output you can use puts
#     # Example puts "Hello world!"

# end
