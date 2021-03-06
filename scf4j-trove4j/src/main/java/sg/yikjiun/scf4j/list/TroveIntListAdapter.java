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

import gnu.trove.list.TIntList;

/**
 * @author Lee Yik Jiun
 */
public class TroveIntListAdapter implements IntList {
    private final TIntList list;

    public TroveIntListAdapter(TIntList list) {
        this.list = list;
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean contains(int i) {
        return list.contains(i);
    }

    public int[] toArray() {
        return list.toArray();
    }

    public boolean add(int i) {
        return list.add(i);
    }

    public boolean remove(int i) {
        return list.remove(i);
    }

    public void clear() {
        list.clear();
    }

    public int get(int index) {
        return list.get(index);
    }

    public int set(int index, int i) {
        return list.set(index, i);
    }

    public void add(int index, int i) {
        list.insert(index, i);
    }

    public int removeAt(int index) {
        return list.removeAt(index);
    }

    public int indexOf(int i) {
        return list.indexOf(i);
    }

    public int lastIndexOf(int i) {
        return list.lastIndexOf(i);
    }
}