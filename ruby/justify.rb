# A classic example of text justification. My solution is greedy, but a
# better solution is to optimize based of "badness" of a solution. The
# general outline of such a solution can be found on MIT OCW Dynamic Programming
# lectures.

# MY INSTRUCTIONS: Specify the width and the input sentence on line 46.
# Then go to line 98 and type in the same width.


def line_break(width, text)
  text_array = text.split(" ") # Create an array of each word and non-word characters
  final_array_of_words = [] # loop through the text array, create a final array of words

  while text_array.length > 0
    current_line = populate_current_line_array(text_array, width)
    final_array_of_words << current_line
    if current_line == []
      raise RuntimeError.new("The width specified is less than the length of a word. Increase the width.")
    end
  end
  final_array_of_words
end

def populate_current_line_array(text_array, width)
  words_in_current_line = []

  while true
    head = text_array[0]
    break unless can_insert?(words_in_current_line, head, width)

    break if head.nil?

    words_in_current_line << text_array.shift
  end
  words_in_current_line
end

def total_string_length(words_in_current_line, head)
  current_line_clone = words_in_current_line.clone
  current_line_clone << head
  current_line_clone.join(" ").length
end

def can_insert?(words_in_current_line, head, width)
  return total_string_length(words_in_current_line, head) <= width
end

lines = line_break(20, "Once upon a time there were three little pigs and the time came for them to leave home and seek their fortunes.")

def justify(lines, width)
  empty_string_to_fill = ""

  lines.each do |line|
    number_of_spaces = width - line.join("").length # join together spaces with the line array
    number_of_words = line.length # length of the line array
    number_of_slots = number_of_words - 1
    space_array = []

    if number_of_slots == 0 # no spaces needed
      space_array = [0]
    elsif number_of_slots == 1
      space_array = [1]
    else
      initial_spaces_per_slot = number_of_spaces / number_of_slots
      remainder = number_of_spaces % number_of_slots
      number_of_slots.times do
        space_array << initial_spaces_per_slot
      end
      space_array[0] += remainder
    end
    sentence = fusion(line, space_array)
    empty_string_to_fill << sentence + "\n"
  end
  empty_string_to_fill
end

def fusion(words, spaces)
  string = ""
  words = words.clone
  spaces = spaces.clone

  while true
    break if words[0].nil?
    string << words.shift
    break if spaces[0].nil?
    num = spaces.shift
    string << create_spaces(num)
  end
  string
end

def create_spaces(num)
  string = ""

  num.times do
    string << " "
  end
  string
end

puts justify(lines, 20)
