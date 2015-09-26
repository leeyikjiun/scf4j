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
public class JDKDoubleSetAdapter implements DoubleSet {
    private final Set<Double> set;

    public JDKDoubleSetAdapter(Set<Double> set) {
        this.set = set;
    }

    public boolean add(double d) {
        return set.add(d);
    }

    public void clear() {
        set.clear();
    }

    public boolean contains(double d) {
        return set.contains(d);
    }

    public boolean isEmpty() {
        return set.isEmpty();
    }

    public boolean remove(double d) {
        return set.remove(d);
    }

    public int size() {
        return set.size();
    }

    public double[] toArray() {
        int i = 0;
        double[] arr = new double[set.size()];

        for (Double d : set) {
            arr[i++] = d;
        }
        return arr;
    }
}
