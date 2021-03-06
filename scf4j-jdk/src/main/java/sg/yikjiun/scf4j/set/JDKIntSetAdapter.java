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
public class JDKIntSetAdapter implements IntSet {
    private final Set<Integer> set;

    public JDKIntSetAdapter(Set<Integer> set) {
        this.set = set;
    }

    public void clear() {
        set.clear();
    }

    public boolean contains(int i) {
        return set.contains(i);
    }

    public boolean isEmpty() {
        return set.isEmpty();
    }

    public boolean add(int i) {
        return set.add(i);
    }

    public boolean remove(int i) {
        return set.remove(i);
    }

    public int size() {
        return set.size();
    }

    public int[] toArray() {
        int i = 0;
        int[] arr = new int[set.size()];

        for (Integer integer : set) {
            arr[i++] = integer;
        }
        return arr;
    }
}
