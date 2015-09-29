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

import java.util.List;
/**
 * @author Lee Yik Jiun
 */
public class JDKLongListAdapter implements LongList {
    private final List<Long> list;

    public JDKLongListAdapter(List<Long> list) {
        this.list = list;
    }

public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean contains(Object o) {
        return list.contains(o);
    }

    public long[] toArray() {
        long[] arr = new long[list.size()];
        int i = 0;
        for (Long l : list) {
            arr[i++] = l;
        }
        return arr;
    }

    public boolean add(long l) {
        return list.add(l);
    }

    public boolean remove(Object o) {
        return list.remove(o);
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
        list.add(index, l);
    }

    public long remove(int index) {
        return list.remove(index);
    }

    public int indexOf(Object o) {
        return list.indexOf(o);
    }

    public int lastIndexOf(Object o) {
        return list.lastIndexOf(o);
    }
}