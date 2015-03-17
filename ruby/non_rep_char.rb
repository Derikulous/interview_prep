# Find the first non-repeating character in a string, ex:  BABY => A

def non_rep?(str)
  @h = Hash.new
  str.downcase.chars.each do |char|
    if @h[char]
      @h[char] += 1
    else
      @h[char] = 1
    end
  end

  str.chars.each do |char|
    if @h[char.downcase] == 1
      return char
    end
  end
end


p non_rep?("ZebraaaAAA")
p @h
p non_rep?("lIttle")
p @h
p non_rep?("AbhgugaCjAl")
p @h
