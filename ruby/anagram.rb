# Your task is to
# • write a function that determines for each pair if it’s an anagram or not
# • for each pair of words your function will print to standard output (stdout) the value 1 if the pair is an anagram or 0 otherwise (one result per line)
# Note that your function will receive the following arguments:
# • firstWords
# o which is an array of strings giving the first word for each of the pairs
# • secondWords
# o which is an array of strings giving the corresponding second word
# Data constraints
# • the number of word pairs will not exceed 100
# • the maximum length of any word in the pairs will not exceed 100 characters
# • all words will contain only lowercase English letters (a-z)
# Efficiency constraints
# • your function is expected to print the result in less than 2 seconds
# Example
# Input Output
# firstWords: “cinema”, “host”, “aba”, “train”
# secondWords: “iceman”, “shot”, “bab”, “rain”
# iceman shot bab rain
# 1
# 1
# 0
# 0
# Explanation
# • for the given arguments above we have the following pairs:
# o (cinema, iceman) (host, shot) (aba, bab) (train, rain)

def anagram?(first_words, second_words)
  # instead of .split(''), can use chars since Ruby 1.9.2
  # first_words = first_words.split('').sort
  first_words = first_words.chars.sort
  second_words = second_words.chars.sort
  first_words == second_words ? 1 : 0
end

p anagram?("cinema", "iceman")
p anagram?("host", "shot")
p anagram?("aba", "bab")
p anagram?("train", "rain")
