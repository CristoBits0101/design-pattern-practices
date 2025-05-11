package com.patterns.behavior.iterator.iterators;

import com.patterns.behavior.iterator.models.User;

// Step 2.1: Create an interface for the iterator
public interface UserIterator {

    /**
     * Common methods
     */

    // Step 2.2: Return the next element in the iteration
    User next();

    // Step 2.3: Check if there are more elements in the iteration
    boolean hasMore();

    // Step 2.4: Reset the iterator to the beginning 0 of the collection
    void reset();

}
