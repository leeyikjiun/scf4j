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
public class JDKBooleanSetAdapter implements BooleanSet {
    private final Set<Boolean> set;

    public JDKBooleanSetAdapter(Set<Boolean> set) {
        this.set = set;
    }

    public boolean add(boolean b) {
        return set.add(b);
    }

    public void clear() {
        set.clear();
    }

    public boolean contains(boolean b) {
        return set.contains(b);
    }

    public boolean isEmpty() {
        return set.isEmpty();
    }

    public boolean remove(boolean b) {
        return set.remove(b);
    }

    public int size() {
        return set.size();
    }

    public boolean[] toArray() {
        int i = 0;
        boolean[] arr = new boolean[set.size()];

        for (Boolean b : set) {
            arr[i++] = b;
        }
        return arr;
    }
}
