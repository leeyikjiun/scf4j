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
public class JDKFloatListAdapter implements FloatList {
    private final List<Float> list;

    public JDKFloatListAdapter(List<Float> list) {
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
        float[] arr = new float[list.size()];
        int i = 0;
        for (Float f : list) {
            arr[i++] = f;
        }
        return arr;
    }

    public boolean add(float f) {
        return list.add(f);
    }

    public boolean remove(float f) {
        return list.remove((Object) f);
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
        list.add(index, f);
    }

    public float removeAt(int index) {
        return list.remove(index);
    }

    public int indexOf(float f) {
        return list.indexOf(f);
    }

    public int lastIndexOf(float f) {
        return list.lastIndexOf(f);
    }
}