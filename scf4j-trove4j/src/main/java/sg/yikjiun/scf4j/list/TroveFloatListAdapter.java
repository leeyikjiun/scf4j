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

import gnu.trove.list.TFloatList;

/**
 * @author Lee Yik Jiun
 */
public class TroveFloatListAdapter implements FloatList {
    private final TFloatList list;

    public TroveFloatListAdapter(TFloatList list) {
        this.list = list;
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean contains(float f) {
        return list.contains(f);
    }

    public float[] toArray() {
        return list.toArray();
    }

    public boolean add(float f) {
        return list.add(f);
    }

    public boolean remove(float f) {
        return list.remove(f);
    }

    public void clear() {
        list.clear();
    }

    public float get(int index) {
        return list.get(index);
    }

    public float set(int index, float f) {
        return list.set(index, f);
    }

    public void add(int index, float f) {
        list.insert(index, f);
    }

    public float removeAt(int index) {
        return list.removeAt(index);
    }

    public int indexOf(float f) {
        return list.indexOf(f);
    }

    public int lastIndexOf(float f) {
        return list.lastIndexOf(f);
    }
}