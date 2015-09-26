/*
 * Copyright 2015 Lee Yik Jiun
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sg.yikjiun.scf4j.set;

import java.util.Set;

/**
 * @author Lee Yik Jiun
 */
public class JDKCharSetAdapter implements CharSet {
    private final Set<Character> set;

    public JDKCharSetAdapter(Set<Character> set) {
        this.set = set;
    }

    public boolean add(char c) {
        return set.add(c);
    }

    public void clear() {
        set.clear();
    }

    public boolean contains(char c) {
        return set.contains(c);
    }

    public boolean isEmpty() {
        return set.isEmpty();
    }

    public boolean remove(char c) {
        return set.remove(c);
    }

    public int size() {
        return set.size();
    }

    public char[] toArray() {
        int i = 0;
        char[] arr = new char[set.size()];

        for (Character c : set) {
            arr[i++] = c;
        }
        return arr;
    }
}
