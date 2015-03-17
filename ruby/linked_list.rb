# This is a linked list built with three functions:
# 1) an entry at the top of the list
# 2) an entry at the bottom of the list
# 3) removing an entry from the top of the list
# Thanks to Commander Coriander @http://www.commandercoriander.net/blog/2012/12/23/reversing-a-linked-list-in-ruby/

class Entry #create a list entry that holds the data and the next functionality
  attr_accessor :next, :data

  def initialize(data)
    @next = nil #pointer to the following entry
    @data = data
  end
end

class List
  include Enumerable
  attr_accessor :name

  def initialize #why not add the nil here? head and tail are not exposed to entry
    @head = nil
    @tail = nil
  end

  def put_on_top(entry)
    if @head.nil?
      @head = entry #set the head to entry, thus entry.next = nil
      @tail = entry
    else
      entry.next = @head #we already have entries, so set @head pointer to the list current head
      @head = entry
    end
    return self
  end

  def put_on_bottom(entry)
    if @head.nil?
      @head = entry
      @tail = entry
    else
      @tail.next = entry
      @tail = entry #reassign to tail point to the next entry
    end
    return self
  end

  def remove_from_top
    return nil if @head.nil?
    entry = @head #grab the head entry
    @head = @head.next #sets @head to the next entry
    return entry #returns old head entry
  end

  def reverse! #pop all entries and put on stack, then assign @head to the top of the entry which was the old tail
    return if @head.nil? #empty list

    @tmp_head = self.remove_from_top #remove top entry and assign to tmp_head
    @tmp_head.next = nil #this terminates the reversed list
    @tail = @tmp_head #assign @tail to the same entry

    until @head.nil?
      entry = self.remove_from_top #pop entry off current list
      entry.next = @tmp_head #tmp_head points to the entry that preceded the current entry
      @tmp_head = entry
    end

    @head = @tmp_head #destructive reversal
    return self
  end

  def each
    return nil if @head.nil?
    entry = @head #starting with @head, spits out an entry
    until entry.nil?
      yield entry
      entry = entry.next
    end
  end

  def reverse
    new_list = List.new
    self.each { |entry| new_list.put_on_top(Entry.new(entry.data)) }
    return new_list
  end
end

