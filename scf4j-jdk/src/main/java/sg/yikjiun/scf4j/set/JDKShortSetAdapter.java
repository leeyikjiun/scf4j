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
public class JDKShortSetAdapter implements ShortSet {
    private final Set<Short> set;

    public JDKShortSetAdapter(Set<Short> set) {
        this.set = set;
    }

    public boolean add(short s) {
        return set.add(s);
    }

    public void clear() {
        set.clear();
    }

    public boolean contains(short s) {
        return set.contains(s);
    }

    public boolean isEmpty() {
        return set.isEmpty();
    }

    public boolean remove(short s) {
        return set.remove(s);
    }

    public int size() {
        return set.size();
    }

    public short[] toArray() {
        int i = 0;
        short[] arr = new short[set.size()];

        for (short s : set) {
            arr[i++] = s;
        }
        return arr;
    }
}
