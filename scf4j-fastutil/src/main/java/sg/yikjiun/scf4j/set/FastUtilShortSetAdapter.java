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
public class FastUtilShortSetAdapter implements ShortSet {
    private final it.unimi.dsi.fastutil.shorts.ShortSet set;

    public FastUtilShortSetAdapter(it.unimi.dsi.fastutil.shorts.ShortSet set) {
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
        return new short[0];
    }
}
