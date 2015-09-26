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

/**
 * @author Lee Yik Jiun
 */
public class FastUtilLongSetAdapter implements LongSet {
    private final it.unimi.dsi.fastutil.longs.LongSet set;

    public FastUtilLongSetAdapter(it.unimi.dsi.fastutil.longs.LongSet set) {
        this.set = set;
    }

    public boolean add(long l) {
        return set.add(l);
    }

    public void clear() {
        set.clear();
    }

    public boolean contains(long l) {
        return set.contains(l);
    }

    public boolean isEmpty() {
        return set.isEmpty();
    }

    public boolean remove(long l) {
        return set.remove(l);
    }

    public int size() {
        return set.size();
    }

    public long[] toArray() {
        return set.toLongArray();
    }
}