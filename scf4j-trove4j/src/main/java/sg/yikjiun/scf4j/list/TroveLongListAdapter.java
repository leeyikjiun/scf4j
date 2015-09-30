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

package sg.yikjiun.scf4j.list;

import gnu.trove.list.TLongList;

/**
 * @author Lee Yik Jiun
 */
public class TroveLongListAdapter implements LongList {
    private final TLongList list;

    public TroveLongListAdapter(TLongList list) {
        this.list = list;
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean contains(long l) {
        return list.contains(l);
    }

    public long[] toArray() {
        return list.toArray();
    }

    public boolean add(long l) {
        return list.add(l);
    }

    public boolean remove(long l) {
        return list.remove(l);
    }

    public void clear() {
        list.clear();
    }

    public long get(int index) {
        return list.get(index);
    }

    public long set(int index, long l) {
        return list.set(index, l);
    }

    public void add(int index, long l) {
        list.insert(index, l);
    }

    public long removeAt(int index) {
        return list.removeAt(index);
    }

    public int indexOf(long l) {
        return list.indexOf(l);
    }

    public int lastIndexOf(long l) {
        return list.lastIndexOf(l);
    }
}