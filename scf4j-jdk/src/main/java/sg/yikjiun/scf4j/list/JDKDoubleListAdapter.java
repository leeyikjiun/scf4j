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
public class JDKDoubleListAdapter implements DoubleList {
    private final List<Double> list;

    public JDKDoubleListAdapter(List<Double> list) {
        this.list = list;
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean contains(double d) {
        return list.contains(d);
    }

    public double[] toArray() {
        double[] arr = new double[list.size()];
        int i = 0;
        for (Double d : list) {
            arr[i++] = d;
        }
        return arr;
    }

    public boolean add(double d) {
        return list.add(d);
    }

    public boolean remove(double d) {
        return list.remove((Object) d);
    }

    public void clear() {
        list.clear();
    }

    public double get(int index) {
        return list.get(index);
    }

    public double set(int index, double d) {
        return list.set(index, d);
    }

    public void add(int index, double d) {
        list.add(index, d);
    }

    public double removeAt(int index) {
        return list.remove(index);
    }

    public int indexOf(double d) {
        return list.indexOf(d);
    }

    public int lastIndexOf(double d) {
        return list.lastIndexOf(d);
    }
}